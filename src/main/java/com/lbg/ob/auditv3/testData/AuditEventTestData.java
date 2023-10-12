package com.lbg.ob.auditv3.testData;

import com.lbg.ob.auditv3.domain.*;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

public class AuditEventTestData {


    public RestResponse.ResponseBuilder<AuditAPIResponse> collectEvents(AuditRequestHolderV3 auditRequestHolder)
    {
     /*   if(Channel.CC.value().equals(auditRequestHolder.getChannel().value()))
        {
            return addToCCEventsQueue(auditRequestHolder);
        }
        else {

        }*/
        return addToCCEventsQueue(auditRequestHolder);
    }




    /**
     * Method to add CC audit event request to queue
     *
     * @param auditRequestHolder
     */
    public RestResponse.ResponseBuilder<AuditAPIResponse> addToCCEventsQueue(AuditRequestHolderV3 auditRequestHolder) {

        // logger.info("Adding request to Commercial queue  - {}", auditRequestHolder.getTxnCorrelationId());
        AuditAPIResponse auditAPIResponse = new AuditAPIResponse();
        ErrorResponse errorResponse = new ErrorResponse();
        if (auditRequestHolder.getAuditEventRequestV3().getEventObject() != null && auditRequestHolder.getAuditEventRequestV3().getEventObject()
                .getErrorCode() != null && auditRequestHolder.getAuditEventRequestV3().getEventObject().getErrorCode().length() > 255) {
            // logger.info("Event Object-Error Code value should not be greater than 255 characters!!");
            errorResponse.setErrorMessage("Error Code value should not be greater than 255 characters in CC Event");
            auditAPIResponse.setErrorResponse(errorResponse);
            return RestResponse.ResponseBuilder.create(Response.Status.BAD_REQUEST, auditAPIResponse);
            // return new Response(auditAPIResponse, Response.Status.BAD_REQUEST);
        }

        // transform request in String format
      /*  String event = AuditEventRequestTransformer.buildAuditEventRequestV3(auditRequestHolder);
        Even auditEvent = new Event();
        auditEvent.setBody(event);
        auditEvent.setEvMeta(String.valueOf(Timestamp.from(Instant.now())));

        //add commercial audit event to queue
        boolean eventAdded = ccAuditQueueReceiver.addCommercialEventToQueue(auditEvent, persistentQueue, auditRequestHolder.getTxnCorrelationId());

        if(eventAdded) {
            auditAPIResponse.setSuccessResponse("Commercial audit event added to Commercial Queue Successfully");
            return new ResponseEntity<>(auditAPIResponse, HttpStatus.CREATED);
        } else {
            errorResponse.setErrorMessage("Too many requests - Commercial Queue is full");
            auditAPIResponse.setErrorResponse(errorResponse);
            return new ResponseEntity<>(auditAPIResponse, HttpStatus.TOO_MANY_REQUESTS);
        }*/
          return RestResponse.ResponseBuilder.create(Response.Status.CREATED, auditAPIResponse);

    }

}
