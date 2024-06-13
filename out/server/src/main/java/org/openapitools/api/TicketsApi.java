/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.7.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Event;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-12T13:57:43.210224513Z[Etc/UTC]", comments = "Generator version: 7.7.0-SNAPSHOT")
@Validated
@Tag(name = "users", description = "Operations related to users")
public interface TicketsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /tickets : Add ticket
     *
     * @param userId  (required)
     * @param eventId  (required)
     * @return Ticket added (status code 204)
     */
    @Operation(
        operationId = "addTicket",
        summary = "Add ticket",
        tags = { "users" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Ticket added")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/tickets"
    )
    
    default ResponseEntity<Void> addTicket(
        @NotNull @Parameter(name = "userId", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "userId", required = true) Integer userId,
        @NotNull @Parameter(name = "eventId", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "eventId", required = true) Integer eventId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tickets : Get all tickets for a user
     *
     * @param userId  (required)
     * @return A list of events (status code 200)
     */
    @Operation(
        operationId = "getTickets",
        summary = "Get all tickets for a user",
        tags = { "users" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A list of events", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Event.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/tickets",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Event>> getTickets(
        @NotNull @Parameter(name = "userId", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "userId", required = true) Integer userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"eventId\" : 0, \"eventDuration\" : 1, \"eventImage\" : \"eventImage\", \"eventExactLocation\" : \"eventExactLocation\", \"eventLocation\" : \"eventLocation\", \"eventDescription\" : \"eventDescription\", \"eventPrice\" : 6, \"eventName\" : \"eventName\", \"eventDate\" : \"2000-01-23\" }, { \"eventId\" : 0, \"eventDuration\" : 1, \"eventImage\" : \"eventImage\", \"eventExactLocation\" : \"eventExactLocation\", \"eventLocation\" : \"eventLocation\", \"eventDescription\" : \"eventDescription\", \"eventPrice\" : 6, \"eventName\" : \"eventName\", \"eventDate\" : \"2000-01-23\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}