package com.danielvaughan.microservices.hackday;

import org.junit.Before;
import org.junit.Test;

public class ComboMicroServicesTest {

    public static final String TOPIC = "chat";
    private ComboMicroServicesClient comboMicroServicesClient;

    @Before
    public void setup()
    {
        comboMicroServicesClient = new ComboMicroServiceClientImpl();
    }

    @Test
    public void post_a_fact_successfully()
    {
        Fact fact = new Fact("Dan", "Hello");
        comboMicroServicesClient.postFact(fact, TOPIC);
    }
}
