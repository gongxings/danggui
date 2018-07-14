package com.danggui.mall.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danggui.common.utils.PageUtils;
import com.danggui.common.utils.Query;
import com.danggui.common.utils.R;
import com.danggui.mall.entity.AddressEntity;
import com.danggui.mall.service.AddressService;

/**
 * Controller
 *
 * @author GongXingSheng
 * 
 * @date 2018年6月30日 17:22:46
 */
@RestController
@RequestMapping("address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    /**
     * 查看列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("address:list")
    public R list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<AddressEntity> addressList = addressService.queryList(query);
        int total = addressService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(addressList, total, query.getLimit(), query.getPage());

        return R.ok().put("page", pageUtil);
    }


    /**
     * 查看信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("address:info")
    public R info(@PathVariable("id") Integer id) {
        AddressEntity address = addressService.queryObject(id);

        return R.ok().put("address", address);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("address:save")
    public R save(@RequestBody AddressEntity address) {
        addressService.save(address);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("address:update")
    public R update(@RequestBody AddressEntity address) {
        addressService.update(address);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("address:delete")
    public R delete(@RequestBody Integer[] ids) {
        addressService.deleteBatch(ids);

        return R.ok();
    }
}
