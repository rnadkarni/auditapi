package com.lbg.ob.auditv3.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//import javax.validation.Valid;
//import javax.validation.constraints.Pattern;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AuditEventRequestV3 {

    @JsonProperty("Account")
    private Account account;

    @JsonProperty("EventObject")
   // @Valid
    //@MetadataConstraint
    private EventObject eventObject;

    @JsonProperty("Placeholders")
   // @MetadataConstraint
    private Object placeholders;

    @JsonProperty("EventLogText")
    private String eventLogText;

    @JsonProperty("EventType")
    private String eventType;

    @JsonProperty("MobileDeviceUser")
   // @Pattern(regexp = "Y|N", flags = Pattern.Flag.CASE_INSENSITIVE, message = "MobileDeviceUser field can have Y or N value")
    private String mobileDeviceUser;

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("ErrorNumber")
    private Integer errorNumber;

}
