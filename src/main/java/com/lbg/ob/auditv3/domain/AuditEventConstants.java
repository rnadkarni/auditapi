package com.lbg.ob.auditv3.domain;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AuditEventConstants {

    public static final String X_LBG_CHANNEL = "x-lbg-channel";

    public static final String X_LBG_BRAND = "x-lbg-brand";

    public static final String X_LBG_INTERNAL_USER_ID = "x-lbg-internal-user-id";

    public static final String X_LBG_INTERNAL_PARTY_ID = "x-lbg-internal-party-id";

    public static final String X_LBG_CIDPERS_ID = "x-lbg-cidpers-id";

    public static final String X_LBG_TXN_CORRELATION_ID = "x-lbg-txn-correlation-id";

    public static final String X_LBG_SESSION_ID = "x-lbg-session-id";

    public static final String X_LBG_FOV_INDICATOR = "x-lbg-fov-indicator";

    public static final String X_LBG_PARTY_HOST = "x-lbg-party-host";

    public static final String X_LBG_PARTY_ID = "x-lbg-party-id";

    public static final String X_LBG_SOURCE_CHANNEL_NAME = "x-lbg-source-channel-name";

    public static final String X_LBG_EXTERNAL_USER_ID = "x-lbg-external-user-id";

    public static final String ACCOUNT_NUMBER = "AccountNumber";

    public static final String SORT_CODE = "SortCode";

    public static final String AUD_API_ERR = "AUD_API_ERR_";

    public static final String AUD_SVC_INVALID_REQUEST = "AUD_SVC_InvalidRequest";

    public static final String AUD_API_ERR_999 = "AUD_API_ERR_999";

    public static final String AUD_API_ERR_503 = "AUD_API_ERR_503";

    public static final String PARTY_HOST_VALUE_WITH_CIDPERS_ID = "T";

    public static final String PARTY_HOST_VALUE_WITHOUT_CIDPERS_ID = "I";

    public static final String ACCOUNT_HOST_VALUE = "T";

    public static final String SUCCESS_ERROR_CODE = "0";

    public static final String ACCOUNT_HOST = "AccountHost";

    public static final String ACCOUNT_PRODUCT_TYPE = "AccountProductType";

    public static final String DEFUALT_OCISID_VALUE = "0";

    public static final String LBG = "LBG";

    public static final String SWITCH_API_ERR_100 = "SWITCH_API_ERR_100";

    public static final String SWITCH_API_ERR_503 = "SWITCH_API_ERR_503";

    public static final String CHANNEL_CONTEXT = "channelContext";

    public static final String OB = "OB";

    public static final String CODE_UNKNOWN_PRODUCT_TYPE = "131299";

    public static final String CODE_CARD_NUMBER_NOT_PRESENT = "131160";

    public static final String CODE_NUMERICS_ONLY = "131016";

    public static final String CODE_SORTCODE_NOT_PRESENT = "131014";

    public static final String CODE_ACCOUNT_NUMBER__NOT_PRESENT = "131015";

    public static final String CODE_INVALID_PRODUCT_NUMBER = "131294";

    public static final String CODE_INCORRECT_LOAN_NUMBER = "131298";

    public static final String CODE_MISSING_REQUEST_PARAMETER = "131008";

    public static final String CODE_SYSTEM_ERROR = "131001";

    public static final String MSG_UNKNOWN_PRODUCT_TYPE = "Unknown Product Type returned";

    public static final String MSG_CARD_NUMBER_NOT_PRESENT = "Card number not present";

    public static final String MSG_NUMERICS_ONLY = "Numerics only are expected in the field";

    public static final String MSG_SORTCODE_NOT_PRESENT = "Sort code not present";

    public static final String MSG_ACCOUNT_NUMBER__NOT_PRESENT = "Account number not present";

    public static final String MSG_INVALID_PRODUCT_NUMBER = "An invalid product number was entered";

    public static final String MSG_INCORRECT_LOAN_NUMBER = "Loan Number is not of correct length";

    public static final String MSG_MISSING_REQUEST_PARAMETER = "Mandatory field(s) have not been completed";

    public static final String MSG_SYSTEM_ERROR = "System Error";

    public static final String MSG_INVALID_NOTIFICATION_FLAG = "An invalid product number was entered";

    public static final String PLACE_HOLDERS = "PlaceHolders";

    public static final String AMOUNT = "Amount";

    public static final String FLAG_Y = "Y";

    public static final String FLAG_N = "N";

    public static final String CACHE_OBJECT = "switchCache";

    public static final String CACHE_KEY = "cacheKey";

    public static final String EMPTY_STRING = "";
    public static final String SELF_AUDIT_EVENT_TYPE = "OB58";
    public static final String SELF_AUDIT_ERROR_CODE = "145000";
    public static final String SELF_AUDIT_ERROR_TEXT = "Error while processing Audit events";
    public static final String SELF_AUDIT_NOTF_FLAG = "N";

    public static final int MAX_SEG_SIZE = 512;
    public static final int WARNING_DELTA = 1000;
    public static final int MAX_NUM_DELMARKERS_IN_SEGMENT = 2000;
    public static final String INITIAL_DELAY = "5000";
    public static final String FIXED_DELAY = "1000";


}