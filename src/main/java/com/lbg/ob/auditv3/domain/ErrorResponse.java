package com.lbg.ob.auditv3.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


/**
 *
 * { "httpStatusCode": 503, "error":{ "code": "AUD_API_ERR_503", "message": "Timed out while
 * connecting to downstream service" } }
 *
 * @author fsingh
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ErrorResponse {

    @JsonProperty("code")
    private String errorCode;

    @JsonProperty("message")
    private String errorMessage;

    private int statusCode;

}