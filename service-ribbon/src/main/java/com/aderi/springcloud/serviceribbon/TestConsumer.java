package com.aderi.springcloud.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConsumer {

    @Autowired
    private ServiceInterface serviceInterface;

    @GetMapping("/test.do")
    public String test() {
        String name = "zhanglei";
        return this.serviceInterface.test(name);
    }

}
