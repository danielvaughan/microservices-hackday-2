package com.danielvaughan.microservices.hackday;

public interface ComboMicroServicesClient {

    void postFact(Fact fact, String topic);
}
