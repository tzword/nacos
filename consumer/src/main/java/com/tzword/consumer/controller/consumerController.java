package com.tzword.consumer.controller;

import com.tzword.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jianghy
 * @Description:
 * @date 2020/12/22 10:24
 */
@RestController
@RequestMapping("consumer")
public class consumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("test")
    public String consumer(){
        return consumerService.provide();
    }
}
