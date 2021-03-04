package com.imooc.mybatis.dto;

import com.imooc.mybatis.entity.Category;
import com.imooc.mybatis.entity.Goods;

/**
 * DTO 数据传输对象，一个扩展的JavaBean类，用于存储多样的关联查询结果
 */

//这个对应利用多表查询的
public class GoodsDTO {
    private Goods goods = new Goods();
    private Category category = new Category();
    private String test;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
