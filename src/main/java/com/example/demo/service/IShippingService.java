package com.example.demo.service;

import com.github.pagehelper.PageInfo;
import com.commen.ServerResponse;
import com.example.demo.pojo.Shipping;

/**
 * 分页查询
 * Created by geely
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId, Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}
