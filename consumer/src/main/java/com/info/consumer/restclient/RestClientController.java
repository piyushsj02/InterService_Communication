package com.info.consumer.restclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/rest-client")
public class RestClientController {

    private final ProducerRestClient producerRestClient;

    @GetMapping("/instance")
    public String getInstance(){
        return producerRestClient.getInstanceInfo();
    }
}
