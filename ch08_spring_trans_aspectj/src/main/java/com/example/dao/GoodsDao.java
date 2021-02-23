package com.example.dao;

import com.example.beans.Goods;

public interface GoodsDao {
    //更新库存
    //本次用户购买的商品信息、数量、价格
    int updateGoods(Goods goods);

    //查询商品信息
    Goods selectGood(Integer id);
}
