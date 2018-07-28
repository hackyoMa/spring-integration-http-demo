package com.integration.receiver.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Receiver {

    @RequestMapping(value = "test", method = RequestMethod.POST)
    public String test(@RequestBody JSONObject params) {
        System.out.println(params.toJSONString());
        return "success";
    }

}
