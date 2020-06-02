package com.aderi.springcloud.serviceprovider.controller;

import com.aderi.springcloud.serviceprovider.entity.TShop;
import com.aderi.springcloud.serviceprovider.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("/helloworld")
    public String helloworld(String name) {
        return "hello " + name;
    }

    @GetMapping("/findAll")
    public List<TShop> findAll() {
        return this.shopService.findAll();
    }

}
