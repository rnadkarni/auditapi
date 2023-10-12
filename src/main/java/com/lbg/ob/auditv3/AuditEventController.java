package com.lbg.ob.auditv3;

import com.lbg.ob.auditv3.domain.*;
import com.lbg.ob.auditv3.testData.AuditEventTestData;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestHeader;
import org.jboss.resteasy.reactive.RestResponse;


//@RestController
//@RequestMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Path(value = "/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

//@Validated
public class AuditEventController {

    // private static final Logger logger = LogManager.getLogger(AuditEventController.class);

    //  @Autowired
    //private AuditServiceV3 auditEventServiceImplV3;

    //@Autowired
    //private AccountDataValidator accountDataValidator;

    // @PostMapping(value = "/v3.0/event")
    @POST
    @Path("v3.0/event")
    public RestResponse.ResponseBuilder<AuditAPIResponse> submitAuditEventV3(
            @RestHeader(value = AuditEventConstants.X_LBG_INTERNAL_USER_ID)
            @NotBlank(message = "Internal User role is missing") String internalUserId,
            @RestHeader(value = AuditEventConstants.X_LBG_CHANNEL)
            @NotNull(message = "Channel is missing") final Channel channel,
            @RestHeader(value = AuditEventConstants.X_LBG_BRAND)
            @NotNull(message = "Brand is missing") final Brand brand,
            @RestHeader(value = AuditEventConstants.X_LBG_TXN_CORRELATION_ID) String txnCorrelationId,
            @RestHeader(value = AuditEventConstants.X_LBG_SESSION_ID) String sessionId,
            @RestHeader(value = AuditEventConstants.X_LBG_INTERNAL_PARTY_ID) String internalPartyId,
            @RestHeader(value = AuditEventConstants.X_LBG_FOV_INDICATOR) Boolean fovIndicator,
            @RestHeader(value = AuditEventConstants.X_LBG_PARTY_HOST) String partyHost,
            @RestHeader(value = AuditEventConstants.X_LBG_PARTY_ID) String partyId,
            @RestHeader(value = AuditEventConstants.X_LBG_SOURCE_CHANNEL_NAME) String sourceChannelName,
            @RestHeader(value = AuditEventConstants.X_LBG_EXTERNAL_USER_ID) String externalUserId,
            @RestHeader(value = AuditEventConstants.X_LBG_CIDPERS_ID) String cidpersId,
          AuditEventRequestV3 auditEventRequest) {
        // @RestHeader HttpHeaders httpHeaders) {

        System.out.println("Hello World");
        System.out.println("request "+auditEventRequest.getAmount());

       /* try {
            if (Channel.CC.value().equals(channel.value())) {
                accountDataValidator.isValid(auditEventRequest.getAccount(), 2);
            } else {
                accountDataValidator.isValid(auditEventRequest.getAccount(), 1);
            }
        } catch (Exception ex)
        {
            AuditAPIResponse auditAPIResponse = new AuditAPIResponse();
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setErrorMessage(ex.getMessage());
            auditAPIResponse.setErrorResponse(errorResponse);
            return new ResponseEntity<>(auditAPIResponse,HttpStatus.BAD_REQUEST);
        }

        logger.info("V3 request received for correlation id - {}. Event Type - {}. and Error Number - {}." ,txnCorrelationId ,
                auditEventRequest.getEventType() == null? auditEventRequest.getEventObject().getEventType():auditEventRequest.getEventType(),
                auditEventRequest.getErrorNumber() == null? auditEventRequest.getEventObject().getErrorCode():auditEventRequest.getErrorNumber());
        logger.debug("V3 Request Details - {}", auditEventRequest);*/

        AuditRequestHolderV3 auditRequestHolder =
                new AuditRequestHolderV3(
                        auditEventRequest,
                        internalUserId,
                        cidpersId,
                        txnCorrelationId,
                        sessionId,
                        channel,
                        brand,
                        internalPartyId,
                        fovIndicator, partyHost, partyId, sourceChannelName, externalUserId);

        AuditEventTestData test= new AuditEventTestData();
        AuditAPIResponse auditAPIResponseResponseEntity = new AuditAPIResponse();

      //  RestResponse.ResponseBuilder<AuditAPIResponse> build=test.collectEvents(auditRequestHolder);

        RestResponse.ResponseBuilder<AuditAPIResponse> build=test.collectEvents(auditRequestHolder);

       // auditAPIResponseResponseEntity=

        /*ResponseEntity<AuditAPIResponse> auditAPIResponseResponseEntity = auditEventServiceImplV3.collectEvents(auditRequestHolder);

        logger.info("V3 Audit event added - {}", txnCorrelationId);
        return auditAPIResponseResponseEntity;*/


      //  Response build = Response.ok(auditAPIResponseResponseEntity).build();
        return build;
    }


}