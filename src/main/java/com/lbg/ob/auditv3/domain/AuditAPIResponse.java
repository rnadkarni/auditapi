package com.lbg.ob.auditv3.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuditAPIResponse {

    public String successResponse;
    public ErrorResponse errorResponse;

}