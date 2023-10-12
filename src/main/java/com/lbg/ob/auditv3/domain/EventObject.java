package com.lbg.ob.auditv3.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class EventObject {

    @JsonProperty("EventLogText")
    private String eventLogText;

    @JsonProperty("EventType")
    private String eventType;

    @JsonProperty("ErrorCode")
    private String errorCode;

    @JsonProperty("NotificationRequiredFlag")
    private String notificationRequiredFlag;

}