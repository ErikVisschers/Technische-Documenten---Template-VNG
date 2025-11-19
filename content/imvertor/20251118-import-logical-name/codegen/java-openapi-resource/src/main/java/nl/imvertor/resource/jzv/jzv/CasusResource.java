package nl.imvertor.resource.jzv.jzv;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.headers.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@Path("/v1/casus")
@Tag(name = "Casus", description = "")
public class CasusResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "haalAlleCasusOp", summary = "Retourneert de lijst van alle Casus objecten", description = "Retourneert een gepagineerde lijst van alle Casus objecten")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.GepagineerdCasusLijst.class)),
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
  public Response haalAlleCasusOp(
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/page") int page,
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/pageSize") int pageSize,
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/sortField") String sortField) {
    return Response.ok().build();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "maakCasusAan", summary = "Maakt een nieuw Casus object", description = "Maakt een nieuw Casus object aan op basis van de aangeleverde gegevens")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "201", description = "Casus succesvol aangemaakt",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Casus.class)),
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
  public Response maakCasusAan(
    @Parameter(description = "De gegevens van het Casus object", required = true) nl.imvertor.model.jzv.jzv.Casus casus) {
    return Response.ok().build();
  }

  @DELETE
  @Path("/{id}")
  @Operation(operationId = "verwijderCasus", summary = "Verwijderd een Casus object", description = "Verwijderd een specifiek Casus object permanent uit het systeem")
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
  public Response verwijderCasus(
    @PathParam("id") @Parameter(description = "Casus ID", required = true, example = "123") String id) {
    return Response.ok().build();
  }

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "haalCasusOp", summary = "Retourneert een Casus object op basis van zijn unieke identificatie", description = "Retourneert een individueel Casus object op basis van zijn unieke identificatie")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Casus.class)),
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
  public Response haalCasusOp(
    @PathParam("id") @Parameter(description = "Casus ID", required = true, example = "123") String id) {
    return Response.ok().build();
  }

  @PUT
  @Path("/{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "werkCasusBij", summary = "Maakt nieuw of overschrijft bestaand Casus object", description = "Maakt een nieuw of overschrijft (volledig) een bestaand Casus object")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Casus.class)),
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset")}),
    @ApiResponse(responseCode = "201", description = "Casus succesvol aangemaakt",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Casus.class)),
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset"),
        @Header(name = "Location", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Location")}),
    @ApiResponse(responseCode = "204", description = "Casus succesvol geupdate",
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
  public Response werkCasusBij(
    @PathParam("id") @Parameter(description = "Casus ID", required = true, example = "123") String id,
    @Parameter(description = "De gegevens van het Casus object", required = true) nl.imvertor.model.jzv.jzv.Casus casus) {
    return Response.ok().build();
  }

  @PATCH
  @Path("/{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "pasCasusAan", summary = "Werkt een bestaand Casus object gedeeltelijk bij", description = "Werkt een bestaand Casus object gedeeltelijk bij door alleen de aangeleverde velden te overschrijven")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Casus.class)),
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
  public Response pasCasusAan(
    @PathParam("id") @Parameter(description = "Casus ID", required = true, example = "123") String id,
    @Parameter(description = "De gegevens van het Casus object", required = true) nl.imvertor.model.jzv.jzv.Casus casus) {
    return Response.ok().build();
  }

}
