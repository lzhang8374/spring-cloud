package com.aderi.springcloud.servicefeign;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class Error implements ServiceInterface {

    @Override
    public String helloworld(String name) {
        return "sorry, " + name;
    }

    @Override
    public List<Map<String, Object>> findAll() {
        return new ArrayList<>();
    }

}
