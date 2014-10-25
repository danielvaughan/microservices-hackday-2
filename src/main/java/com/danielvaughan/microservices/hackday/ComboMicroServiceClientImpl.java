package com.danielvaughan.microservices.hackday;

import org.springframework.web.client.RestTemplate;

public class ComboMicroServiceClientImpl implements ComboMicroServicesClient {

    private static final String POST_FACT = "topics/{topic}/facts";

    private static final String BASE_URL = "http://combo-squirrel.herokuapp.com/";

    private final RestTemplate restTemplate;

    public ComboMicroServiceClientImpl() {
        restTemplate = new RestTemplate();
    }

    @Override
    public void postFact(Fact fact, String topic) {
        final String requestUrl = BASE_URL + POST_FACT;
        restTemplate.postForObject(requestUrl, fact, String.class, topic);
    }
}
