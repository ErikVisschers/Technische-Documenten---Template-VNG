package nl.imvertor.resource.jzv.jzv;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.headers.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@Path("/v1/besluit")
@Tag(name = "Besluit", description = "")
public class BesluitResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "haalAlleBesluitOp", summary = "Retourneert de lijst van alle Besluit objecten", description = "Retourneert een gepagineerde lijst van alle Besluit objecten")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.GepagineerdBesluitLijst.class)),
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset")}),
    @ApiResponse(responseCode = "400", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/400"),
    @ApiResponse(responseCode = "401", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/401"),
    @ApiResponse(responseCode = "403", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/403"),
    @ApiResponse(responseCode = "405", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/405"),
    @ApiResponse(responseCode = "415", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/415"),
    @ApiResponse(responseCode = "429", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/429"),
    @ApiResponse(responseCode = "500", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/500"),
    @ApiResponse(responseCode = "503", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/503"),
  })
  public Response haalAlleBesluitOp(
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/page") int page,
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/pageSize") int pageSize,
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/sortField") String sortField) {
    return Response.ok().build();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "maakBesluitAan", summary = "Maakt een nieuw Besluit object", description = "Maakt een nieuw Besluit object aan op basis van de aangeleverde gegevens")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "201", description = "Besluit succesvol aangemaakt",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Besluit.class)),
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset"),
        @Header(name = "Location", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Location")}),
    @ApiResponse(responseCode = "400", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/400"),
    @ApiResponse(responseCode = "401", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/401"),
    @ApiResponse(responseCode = "403", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/403"),
    @ApiResponse(responseCode = "405", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/405"),
    @ApiResponse(responseCode = "409", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/409"),
    @ApiResponse(responseCode = "415", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/415"),
    @ApiResponse(responseCode = "422", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/422"),
    @ApiResponse(responseCode = "429", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/429"),
    @ApiResponse(responseCode = "500", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/500"),
    @ApiResponse(responseCode = "503", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/503"),
  })
  public Response maakBesluitAan(
    @Parameter(description = "De gegevens van het Besluit object", required = true) nl.imvertor.model.jzv.jzv.Besluit besluit) {
    return Response.ok().build();
  }

  @DELETE
  @Path("/{id}")
  @Operation(operationId = "verwijderBesluit", summary = "Verwijderd een Besluit object", description = "Verwijderd een specifiek Besluit object permanent uit het systeem")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "202", description = "${name} zal worden verwijderd",
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset")}),
    @ApiResponse(responseCode = "204", description = "${name} succesvol verwijderd",
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset")}),
    @ApiResponse(responseCode = "400", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/400"),
    @ApiResponse(responseCode = "401", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/401"),
    @ApiResponse(responseCode = "403", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/403"),
    @ApiResponse(responseCode = "404", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/404"),
    @ApiResponse(responseCode = "405", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/405"),
    @ApiResponse(responseCode = "409", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/409"),
    @ApiResponse(responseCode = "415", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/415"),
    @ApiResponse(responseCode = "429", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/429"),
    @ApiResponse(responseCode = "500", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/500"),
    @ApiResponse(responseCode = "503", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/503"),
  })
  public Response verwijderBesluit(
    @PathParam("id") @Parameter(description = "Besluit ID", required = true, example = "123") String id) {
    return Response.ok().build();
  }

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "haalBesluitOp", summary = "Retourneert een Besluit object op basis van zijn unieke identificatie", description = "Retourneert een individueel Besluit object op basis van zijn unieke identificatie")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Besluit.class)),
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset")}),
    @ApiResponse(responseCode = "400", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/400"),
    @ApiResponse(responseCode = "401", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/401"),
    @ApiResponse(responseCode = "403", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/403"),
    @ApiResponse(responseCode = "404", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/404"),
    @ApiResponse(responseCode = "405", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/405"),
    @ApiResponse(responseCode = "415", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/415"),
    @ApiResponse(responseCode = "429", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/429"),
    @ApiResponse(responseCode = "500", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/500"),
    @ApiResponse(responseCode = "503", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/503"),
  })
  public Response haalBesluitOp(
    @PathParam("id") @Parameter(description = "Besluit ID", required = true, example = "123") String id) {
    return Response.ok().build();
  }

  @PUT
  @Path("/{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "werkBesluitBij", summary = "Maakt nieuw of overschrijft bestaand Besluit object", description = "Maakt een nieuw of overschrijft (volledig) een bestaand Besluit object")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Besluit.class)),
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset")}),
    @ApiResponse(responseCode = "201", description = "Besluit succesvol aangemaakt",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Besluit.class)),
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset"),
        @Header(name = "Location", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Location")}),
    @ApiResponse(responseCode = "204", description = "Besluit succesvol geupdate",
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Location", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Location")}),
    @ApiResponse(responseCode = "400", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/400"),
    @ApiResponse(responseCode = "401", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/401"),
    @ApiResponse(responseCode = "403", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/403"),
    @ApiResponse(responseCode = "404", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/404"),
    @ApiResponse(responseCode = "405", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/405"),
    @ApiResponse(responseCode = "409", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/409"),
    @ApiResponse(responseCode = "415", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/415"),
    @ApiResponse(responseCode = "422", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/422"),
    @ApiResponse(responseCode = "429", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/429"),
    @ApiResponse(responseCode = "500", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/500"),
    @ApiResponse(responseCode = "503", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/503"),
  })
  public Response werkBesluitBij(
    @PathParam("id") @Parameter(description = "Besluit ID", required = true, example = "123") String id,
    @Parameter(description = "De gegevens van het Besluit object", required = true) nl.imvertor.model.jzv.jzv.Besluit besluit) {
    return Response.ok().build();
  }

  @PATCH
  @Path("/{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "pasBesluitAan", summary = "Werkt een bestaand Besluit object gedeeltelijk bij", description = "Werkt een bestaand Besluit object gedeeltelijk bij door alleen de aangeleverde velden te overschrijven")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Besluit.class)),
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset")}),
    @ApiResponse(responseCode = "204", description = "OK",
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset")}),
    @ApiResponse(responseCode = "400", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/400"),
    @ApiResponse(responseCode = "401", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/401"),
    @ApiResponse(responseCode = "403", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/403"),
    @ApiResponse(responseCode = "404", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/404"),
    @ApiResponse(responseCode = "405", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/405"),
    @ApiResponse(responseCode = "409", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/409"),
    @ApiResponse(responseCode = "415", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/415"),
    @ApiResponse(responseCode = "422", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/422"),
    @ApiResponse(responseCode = "429", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/429"),
    @ApiResponse(responseCode = "500", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/500"),
    @ApiResponse(responseCode = "503", ref="https://armatiek.github.io/imvertor-openapi-generator/openapi/common-responses.yaml#/components/responses/503"),
  })
  public Response pasBesluitAan(
    @PathParam("id") @Parameter(description = "Besluit ID", required = true, example = "123") String id,
    @Parameter(description = "De gegevens van het Besluit object", required = true) nl.imvertor.model.jzv.jzv.Besluit besluit) {
    return Response.ok().build();
  }

}
