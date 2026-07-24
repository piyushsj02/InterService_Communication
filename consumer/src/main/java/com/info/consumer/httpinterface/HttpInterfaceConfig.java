package com.info.consumer.httpinterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpInterfaceConfig {

    @Bean
    public ProducerHttpInterface webClientHttpInterface() {
        WebClient webClient = WebClient.builder().baseUrl("http://localhost:8081").build();
        WebClientAdapter webClientAdapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(webClientAdapter).build();

        ProducerHttpInterface service = factory.createClient(ProducerHttpInterface.class);
        return service;
    }

}
