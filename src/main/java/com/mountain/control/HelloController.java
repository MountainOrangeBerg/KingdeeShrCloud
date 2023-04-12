package com.mountain.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping(value = "/hello")
    @ResponseBody
    public String say() {//返回json 数据
        return "gril";
    }

    @GetMapping(value = "/hello1")
    @ResponseBody
    public String say1() {//
        return "sys/index1";
    }
}