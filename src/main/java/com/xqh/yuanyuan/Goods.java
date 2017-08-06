package com.xqh.yuanyuan;

public class Goods {

    int id;
    String goodsName;
    int goodsPrice;
    String description;

    public Goods(int id,String goodsName,int goodsPrice,String description){

        this.id = id;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.description = description;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

