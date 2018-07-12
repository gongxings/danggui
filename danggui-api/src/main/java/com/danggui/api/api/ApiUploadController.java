package com.danggui.api.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.danggui.api.annotation.IgnoreAuth;
import com.danggui.api.util.ApiBaseAction;
import com.danggui.common.oss.OSSFactory;
import com.danggui.common.utils.RRException;

/**
 * 作者: @author Harmon <br>
 * 时间: 2017-09-08 13:20<br>
 * 描述: ApiUploadController <br>
 */
@RestController
@RequestMapping("/api/upload")
public class ApiUploadController extends ApiBaseAction {

    /**
     * 上传文件
     */
    @IgnoreAuth
    @RequestMapping("/upload")
    public Object upload(@RequestParam("file") MultipartFile file) throws Exception {
        if (file.isEmpty()) {
            throw new RRException("上传文件不能为空");
        }
        //上传文件
        String url = OSSFactory.build().upload(file);
        return toResponsSuccess(url);
    }
}