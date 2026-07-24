package com.info.consumer.feign;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/feign")
public class FeignController {

    private final ProducerFeignClient producerFeignClient;

    @GetMapping("/instance")
    public String getInstance(){
        return producerFeignClient.getInstanceInfo();
    }
}
