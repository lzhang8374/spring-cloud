package com.aderi.springcloud.serviceprovider.service;

import com.aderi.springcloud.serviceprovider.dao.ShopDao;
import com.aderi.springcloud.serviceprovider.entity.TShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopService {

    @Autowired
    private ShopDao shopDao;

    public List<TShop> findAll() {
        return this.shopDao.findAll();
    }
}
