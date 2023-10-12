package com.lbg.ob.auditv3.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AuditRequestHolderV3 extends BaseRequestHolder {

    private String partyId;

    private String sourceChannelName;

    private String externalUserId;

    private AuditEventRequestV3 auditEventRequestV3;

    public AuditRequestHolderV3(AuditEventRequestV3 auditEventRequestV3, String internalUserId,String cidpersId, String txnCorrelationId, String sessionId, Channel channel,
                                Brand brand, String internalPartyId, Boolean fovIndicator, String partyHost, String partyId, String sourceChannelName, String externalUserId) {
        super(internalUserId, cidpersId, txnCorrelationId, sessionId, channel, brand, internalPartyId, fovIndicator, partyHost);
        this.partyId = partyId;
        this.sourceChannelName = sourceChannelName;
        this.externalUserId = externalUserId;
        this.auditEventRequestV3 = auditEventRequestV3;
    }

}