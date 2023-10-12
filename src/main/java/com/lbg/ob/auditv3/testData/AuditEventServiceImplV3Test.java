package com.lbg.ob.auditv3.testData;

import com.lbg.ob.auditv3.domain.*;


public class AuditEventServiceImplV3Test {


    private static AuditRequestHolderV3 mockedRCRequestObject() {
        String productHeldIdentifier = "4323232343242323";
        String sortCode = "233412";
        String accountNumber = "12342312";
        String cardNumber = "4323232343242323";
        String internalUserId = "internalUserId";
        String cidpersId = "CidpersId";
        String txnCorrelationId = "txnCorrelationId";
        String sessionId = "sessionId";
        String internalPartyId = "internalPartyId";
        String partyHost = "partyHost";
        String partyId = "partyId";
        String sourceChannelName = "sourceChannelName";
        String externalUserId = "externalUserId";
        AccountHost accountHost = AccountHost.L;
        AccountProductType accountProductType = AccountProductType.A;
        Channel channel = Channel.RC;
        Brand brand = Brand.LYDS;
        boolean fovIndicator = false;
        return new AuditRequestHolderV3(
                prepareV2auditRequest(accountHost, accountProductType, productHeldIdentifier, sortCode, accountNumber,
                        cardNumber),
                internalUserId, cidpersId, txnCorrelationId, sessionId, channel, brand, internalPartyId, fovIndicator,
                partyHost, partyId, sourceChannelName, externalUserId);
    }

    private static AuditRequestHolderV3 mockedCCRequestObject() {
        String productHeldIdentifier = "4323232343242323";
        String sortCode = "233412";
        String accountNumber = "12342312";
        String cardNumber = "4323232343242323";
        String internalUserId = "internalUserId";
        String txnCorrelationId = "txnCorrelationId";
        String sessionId = "sessionId";
        String internalPartyId = "internalPartyId";
        String partyHost = "partyHost";
        String partyId = "partyId";
        String cidpersId = "CidpersId";
        String sourceChannelName = "sourceChannelName";
        String externalUserId = "externalUserId";
        AccountHost accountHost = AccountHost.L;
        AccountProductType accountProductType = AccountProductType.A;
        Channel channel = Channel.CC;
        Brand brand = Brand.LYDS;
        boolean fovIndicator = false;
        return new AuditRequestHolderV3(
                prepareV2auditRequest(accountHost, accountProductType, productHeldIdentifier, sortCode, accountNumber,
                        cardNumber),
                internalUserId, cidpersId, txnCorrelationId, sessionId, channel, brand, internalPartyId, fovIndicator,
                partyHost, partyId, sourceChannelName, externalUserId);
    }

    private static AuditRequestHolderV3 mockedBadRequestCRequestObject() {
        String productHeldIdentifier = "4323232343242323";
        String sortCode = "233412";
        String accountNumber = "12342312";
        String cardNumber = "4323232343242323";
        String internalUserId = "internalUserId";
        String cidpersId = "CidpersId";
        String txnCorrelationId = "txnCorrelationId";
        String sessionId = "sessionId";
        String internalPartyId = "internalPartyId";
        String partyHost = "partyHost";
        String partyId = "partyId";
        String sourceChannelName = "sourceChannelName";
        String externalUserId = "externalUserId";
        AccountHost accountHost = AccountHost.L;
        AccountProductType accountProductType = AccountProductType.A;
        Channel channel = Channel.RC;
        Brand brand = Brand.LYDS;
        boolean fovIndicator = false;
        return new AuditRequestHolderV3(
                prepareV2BadauditRequest(accountHost, accountProductType, productHeldIdentifier, sortCode, accountNumber,
                        cardNumber),
                internalUserId, cidpersId, txnCorrelationId, sessionId, channel, brand, internalPartyId, fovIndicator,
                partyHost, partyId, sourceChannelName, externalUserId);
    }

    private static AuditEventRequestV3 prepareV2BadauditRequest(AccountHost accountHost,
                                                                AccountProductType accountProductType, String productHeldIdentifier, String sortCode, String accountNumber,
                                                                String cardNumber) {

        AuditEventRequestV3 auditRequest = new AuditEventRequestV3();
        Account account = new Account();
        account.setAccountHost(accountHost);
        account.setAccountProductType(accountProductType);
        account.setAccountNumber(accountNumber);
        account.setSortCode(sortCode);
        account.setProductHeldIdentifier(productHeldIdentifier);
        account.setCardNumber(cardNumber);
        auditRequest.setAccount(account);
        EventObject eventObject = new EventObject();
        eventObject.setEventLogText("event log");
        eventObject.setEventType("OB40");
        eventObject.setErrorCode("dkfjaslfjdlsfdgjoiejglkdsnvojnkjnjuhjnjnoinkjnknkjnjkbndcsdcdscsdjnkjnknknsdcscsdcsknknknknkjncsdncsjdncsjnckjsdncjsncjsdnckjs"
                + "jncksncksdncjksnkjsncjkdsnvjksnvmsnvksnvkjsnvkjsnkjsnvkjsbvksbnvkjsdnvksnvkjsnvjksvkj"
                + "kjncvksjnvjksvnksnvdjksndjdksvmscnkmsncksnvsndvkjsnvjksnvjksvknknjknkmnkjnkjnknoijoijfeoiw");
        auditRequest.setEventObject(eventObject);

        return auditRequest;
    }

    private static AuditEventRequestV3 prepareV2auditRequest(AccountHost accountHost,
                                                             AccountProductType accountProductType, String productHeldIdentifier, String sortCode, String accountNumber,
                                                             String cardNumber) {

        AuditEventRequestV3 auditRequest = new AuditEventRequestV3();
        Account account = new Account();
        account.setAccountHost(accountHost);
        account.setAccountProductType(accountProductType);
        account.setAccountNumber(accountNumber);
        account.setSortCode(sortCode);
        account.setProductHeldIdentifier(productHeldIdentifier);
        account.setCardNumber(cardNumber);
        auditRequest.setAccount(account);

        EventObject eventObject = new EventObject();
        eventObject.setEventLogText("event log");
        eventObject.setEventType("OB40");
        eventObject.setErrorCode("0");
        auditRequest.setEventObject(eventObject);

        return auditRequest;
    }
}