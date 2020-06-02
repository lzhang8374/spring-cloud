package com.aderi.springcloud.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(value = "SERVICE-PROVIDER", fallback = Error.class)
public interface ServiceInterface {

    @RequestMapping(value = "/shop/helloworld", method = RequestMethod.GET)
    String helloworld(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/shop/findAll", method = RequestMethod.GET)
    List<Map<String, Object>> findAll();
}
