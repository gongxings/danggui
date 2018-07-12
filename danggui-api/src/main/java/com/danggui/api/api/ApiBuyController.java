package com.danggui.api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.danggui.api.annotation.LoginUser;
import com.danggui.api.dto.BuyGoodsDTO;
import com.danggui.api.entity.UserVo;
import com.danggui.api.redis.ApiBuyKey;
import com.danggui.api.util.ApiBaseAction;
import com.danggui.common.redis.RedisService;

@RestController
@RequestMapping("/api/buy")
public class ApiBuyController extends ApiBaseAction {
    @Autowired
    private RedisService redisService;
    @RequestMapping("/add")
    public Object addBuy(@LoginUser UserVo loginUser) {
        JSONObject jsonParam = getJsonRequest();
        Integer goodsId = jsonParam.getInteger("goodsId");
        Integer productId = jsonParam.getInteger("productId");
        Integer number = jsonParam.getInteger("number");
        BuyGoodsDTO goodsDTO = new BuyGoodsDTO();
        goodsDTO.setGoodsId(goodsId);
        goodsDTO.setProductId(productId);
        goodsDTO.setNumber(number);
        this.redisService.set(ApiBuyKey.goods(), loginUser.getUserId()+"", goodsDTO);
        return toResponsMsgSuccess("添加成功");
    }

}
