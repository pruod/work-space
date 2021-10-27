package cn.com.tbshuda.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wsd
 * @date: 2021/10/27 9:47
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello  " + name;
    }
}
