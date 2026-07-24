package com.info.consumer.httpinterface;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ProducerHttpInterface {

    @GetExchange("/instance-info")
    String getInstanceInfo();
}
