package com.lbg.ob.auditv3.domain;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BaseRequestHolder {

    @NotNull(message = "Internal user Id cannot be null")
    private String internalUserId;

    private String cidpersId;

    @NotNull(message = "Correlation Id cannot be null")
    private String txnCorrelationId;

    @NotNull(message = "Channel cannot be null")
    private Channel channel;

    @NotNull(message = "Brand cannot be null")
    private Brand brand;

    private String internalPartyId;

    private Boolean fovIndicator;

    private String sessionId;

    private String partyHost;


    public BaseRequestHolder(String internalUserId, String cidpersId, String txnCorrelationId, String sessionId, Channel channel,
                             Brand brand, String internalPartyId, Boolean fovIndicator, String partyHost) {
        super();
        this.internalUserId = internalUserId;
        this.cidpersId = cidpersId;
        this.txnCorrelationId = txnCorrelationId;
        this.sessionId = sessionId;
        this.channel = channel;
        this.brand = brand;
        this.internalPartyId = internalPartyId;
        this.fovIndicator = fovIndicator;
        this.partyHost = partyHost;
    }

    public String getInternalUserId() {
        return internalUserId;
    }

    public void setInternalUserId(String internalUserId) {
        this.internalUserId = internalUserId;
    }

    public String getCidpersId() {
        return cidpersId;
    }

    public void setCidpersId(String cidpersId) {
        this.cidpersId = cidpersId;
    }

    public String getTxnCorrelationId() {
        return txnCorrelationId;
    }

    public void setTxnCorrelationId(String txnCorrelationId) {
        this.txnCorrelationId = txnCorrelationId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getInternalPartyId() {
        return internalPartyId;
    }

    public void setInternalPartyId(String internalPartyId) {
        this.internalPartyId = internalPartyId;
    }

    public Boolean getFovIndicator() {
        return fovIndicator;
    }

    public void setFovIndicator(Boolean fovIndicator) {
        this.fovIndicator = fovIndicator;
    }

    public String getPartyHost() {
        return partyHost;
    }

    public void setPartyHost(String partyHost) {
        this.partyHost = partyHost;
    }

}