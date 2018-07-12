package com.danggui.api.entity;

import java.io.Serializable;


/**
 * 
 * @author GongXings
 * @date 2018年7月12日 下午10:50:18
 */
public class GoodsAttributeVo implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Integer id;
    //商品Id
    private Integer goods_id;
    //属性Id
    private Integer attribute_id;
    //属性值
    private String value;
    // 冗余
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getAttribute_id() {
        return attribute_id;
    }

    public void setAttribute_id(Integer attribute_id) {
        this.attribute_id = attribute_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
