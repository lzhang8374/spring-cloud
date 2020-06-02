package com.aderi.springcloud.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestConsumer {

    @Autowired
    private ServiceInterface serviceInterface;

    @GetMapping("/test.do")
    public String test() {
        String name = "zhanglei";
        return serviceInterface.helloworld(name);
    }

    @GetMapping("/findAll.do")
    public List<Map<String, Object>> findAll() {
        List<Map<String, Object>> aa =  serviceInterface.findAll();
        System.out.println(aa.size());
        return aa;
    }

}
