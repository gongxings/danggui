package com.danggui.api.entity;

import java.io.Serializable;


/**
 * 
 * @author GongXings
 * @date 2018年7月12日 下午10:32:26
 */
public class CommentPictureVo implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Integer id;
    //评价Id
    private Integer comment_id;
    //评价图片
    private String pic_url;
    //排序
    private Integer sort_order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }
}
