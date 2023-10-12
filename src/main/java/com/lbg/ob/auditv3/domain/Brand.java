package com.lbg.ob.auditv3.domain;

public enum Brand {
    LYDS(
            "LYDS"),
    BOS(
            "BOS"),
    HFX(
            "HFX"),
    MBN(
            "MBN");

    private String value;

    private Brand(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

}