package com.danggui.admin.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danggui.admin.entity.SysSmsLogEntity;
import com.danggui.admin.service.SysSmsLogService;
import com.danggui.api.annotation.IgnoreAuth;
import com.danggui.common.utils.DateUtils;
import com.danggui.common.utils.R;
import com.danggui.common.utils.RRException;
import com.danggui.common.utils.RequestUtil;
import com.danggui.common.utils.ResourceUtil;
import com.danggui.common.utils.StringUtils;

/**
 * 发送短信接口Controller
 *
 * @author liepngjun
 * @email 939961241@qq.com
 * @date 2018-06-05 13:58:47
 */
@RestController
@RequestMapping("api")
public class ApiSmsController {
    @Autowired
    private SysSmsLogService smsLogService;

    /**
     * 发送短信
     *
     * @param request request
     * @param params 请求参数{mobile：电话号码字符串，中间用英文逗号间隔,content：内容字符串,stime：追加发送时间，可为空，为空为及时发送}
     * @return R
     */
    @IgnoreAuth
    @RequestMapping("/sendSms")
    public R sendSms(HttpServletRequest request, @RequestParam Map<String, String> params) {
        SysSmsLogEntity smsLog = new SysSmsLogEntity();
        String validIP = RequestUtil.getIpAddrByRequest(request);
        if (ResourceUtil.getConfigByName("sms.validIp").indexOf(validIP) < 0) {
            throw new RRException("非法IP请求！");
        }
        smsLog.setMobile(params.get("mobile"));
        smsLog.setContent(params.get("content"));
        String stime = params.get("stime");
        if (StringUtils.isNotEmpty(stime)) {
            smsLog.setStime(DateUtils.convertStringToDate(stime));
        }
        SysSmsLogEntity sysSmsLogEntity = smsLogService.sendSms(smsLog);
        return R.ok().put("result", sysSmsLogEntity);
    }
}
