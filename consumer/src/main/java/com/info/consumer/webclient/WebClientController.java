package com.info.consumer.webclient;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/web-client")
public class WebClientController {

    private final ProducerWebClient producerWebClient;

    @GetMapping("/instance")
    public Mono<String> getInstance() {
        return producerWebClient.getInstanceInfo();
    }
}
