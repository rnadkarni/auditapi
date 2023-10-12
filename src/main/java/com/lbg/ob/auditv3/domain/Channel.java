package com.lbg.ob.auditv3.domain;

public enum Channel {

    RC(
            "RC"),
    BB(
            "BB"),
    CC("CC");

    private String value;

    private Channel(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}