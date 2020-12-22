package com.tzword.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

/**
 * @author jianghy
 * @Description:
 * @date 2020/12/22 10:19
 */
@RestController
@RefreshScope
@RequestMapping("/provider")
public class ProviderController {

    @Value("${aaa}")
    private String aaa;

    @RequestMapping("test")
    public String provide(){
        return LocalTime.now() + "provide" + aaa;
    }

}
