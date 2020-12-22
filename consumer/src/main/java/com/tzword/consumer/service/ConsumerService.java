package com.tzword.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jianghy
 * @Description:
 * @date 2020/12/22 10:27
 */
@FeignClient(value = "nacos-provider")
public interface ConsumerService {
    @RequestMapping("/provider/test")
    String provide();
}
