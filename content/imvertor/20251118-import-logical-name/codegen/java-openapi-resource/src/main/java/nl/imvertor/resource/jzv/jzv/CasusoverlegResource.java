package nl.imvertor.resource.jzv.jzv;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.headers.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@Path("/v1/casusoverleg")
@Tag(name = "Casusoverleg", description = """
Een periodiek beraad waarbij meerdere bij de casus betrokken ketenpartners in een samenwerking samenwerken.

Zie deze [link](https://www.justid.nl/) voor meer informatie.""")
public class CasusoverlegResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "haalAlleCasusoverlegOp", summary = "Retourneert de lijst van alle Casusoverleg objecten", description = "Retourneert een gepagineerde lijst van alle Casusoverleg objecten")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.GepagineerdCasusoverlegLijst.class)),
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
  public Response haalAlleCasusoverlegOp(
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/page") int page,
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/pageSize") int pageSize,
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/sortField") String sortField) {
    return Response.ok().build();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "maakCasusoverlegAan", summary = "Maakt een nieuw Casusoverleg object", description = "Maakt een nieuw Casusoverleg object aan op basis van de aangeleverde gegevens")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "201", description = "Casusoverleg succesvol aangemaakt",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Casusoverleg.class)),
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
  public Response maakCasusoverlegAan(
    @Parameter(description = "De gegevens van het Casusoverleg object", required = true) nl.imvertor.model.jzv.jzv.Casusoverleg casusoverleg) {
    return Response.ok().build();
  }

  @DELETE
  @Path("/{id}")
  @Operation(operationId = "verwijderCasusoverleg", summary = "Verwijderd een Casusoverleg object", description = "Verwijderd een specifiek Casusoverleg object permanent uit het systeem")
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
  public Response verwijderCasusoverleg(
    @PathParam("id") @Parameter(description = "Casusoverleg ID", required = true, example = "123") String id) {
    return Response.ok().build();
  }

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "haalCasusoverlegOp", summary = "Retourneert een Casusoverleg object op basis van zijn unieke identificatie", description = "Retourneert een individueel Casusoverleg object op basis van zijn unieke identificatie")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Casusoverleg.class)),
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
  public Response haalCasusoverlegOp(
    @PathParam("id") @Parameter(description = "Casusoverleg ID", required = true, example = "123") String id) {
    return Response.ok().build();
  }

  @PUT
  @Path("/{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "werkCasusoverlegBij", summary = "Maakt nieuw of overschrijft bestaand Casusoverleg object", description = "Maakt een nieuw of overschrijft (volledig) een bestaand Casusoverleg object")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Casusoverleg.class)),
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset")}),
    @ApiResponse(responseCode = "201", description = "Casusoverleg succesvol aangemaakt",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Casusoverleg.class)),
      headers = {@Header(name = "API-Version", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/API-Version"),
        @Header(name = "Warning", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Warning"),
        @Header(name = "X-Pagination-Page", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Page"),
        @Header(name = "X-Pagination-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/X-Pagination-Limit"),
        @Header(name = "RateLimit-Limit", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Limit"),
        @Header(name = "RateLimit-Remaining", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Remaining"),
        @Header(name = "RateLimit-Reset", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/RateLimit-Reset"),
        @Header(name = "Location", ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-headers.yaml#/components/headers/Location")}),
    @ApiResponse(responseCode = "204", description = "Casusoverleg succesvol geupdate",
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
  public Response werkCasusoverlegBij(
    @PathParam("id") @Parameter(description = "Casusoverleg ID", required = true, example = "123") String id,
    @Parameter(description = "De gegevens van het Casusoverleg object", required = true) nl.imvertor.model.jzv.jzv.Casusoverleg casusoverleg) {
    return Response.ok().build();
  }

  @PATCH
  @Path("/{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "pasCasusoverlegAan", summary = "Werkt een bestaand Casusoverleg object gedeeltelijk bij", description = "Werkt een bestaand Casusoverleg object gedeeltelijk bij door alleen de aangeleverde velden te overschrijven")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "OK",
      content = @Content(mediaType = "application/json",
      schema = @Schema(implementation = nl.imvertor.model.jzv.jzv.Casusoverleg.class)),
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
  public Response pasCasusoverlegAan(
    @PathParam("id") @Parameter(description = "Casusoverleg ID", required = true, example = "123") String id,
    @Parameter(description = "De gegevens van het Casusoverleg object", required = true) nl.imvertor.model.jzv.jzv.Casusoverleg casusoverleg) {
    return Response.ok().build();
  }

}
