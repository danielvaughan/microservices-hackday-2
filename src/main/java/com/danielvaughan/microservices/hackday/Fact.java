package com.danielvaughan.microservices.hackday;

/**
 * Created by danielvaughan on 25/10/14.
 */
public class Fact {

    private String who;
    private String says;

    public Fact(String who, String says) {
        this.who = who;
        this.says = says;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }
}
