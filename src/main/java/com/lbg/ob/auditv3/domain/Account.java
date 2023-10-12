package com.lbg.ob.auditv3.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {

    @JsonProperty("AccountHost")
    private AccountHost accountHost;

    @JsonProperty("AccountProductType")
    private AccountProductType accountProductType;

    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("SortCode")
    private String sortCode;

    @JsonProperty("CardNumber")
    @ToString.Exclude
    private String cardNumber;

    @JsonProperty("ProductHeldIdentifier")
    private String productHeldIdentifier;

    public Account() {
    }

}