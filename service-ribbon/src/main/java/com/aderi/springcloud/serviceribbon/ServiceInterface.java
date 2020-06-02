package com.aderi.springcloud.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceInterface {

    @Value("${eureka.client.serviceUrl.defaultZone}")
    private String foo;

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String test(String name) {
        return "foo:" + this.foo + restTemplate.getForObject("http://SERVICE-PROVIDER/shop/helloworld?name=" + name, String.class);
    }

    public String error(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
