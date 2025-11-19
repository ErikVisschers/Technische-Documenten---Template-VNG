package nl.imvertor.resource.custom;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.headers.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@Path("/")
@Tag(name = "Casusoverleg", description = "")
public class Casusoverleg {

  @GET
  @Path("/v1/casusoverleg-datum")
  @Produces(MediaType.APPLICATION_JSON)
  @Operation(operationId = "vindCasusoverlegOpDatum", summary = "Zoek overleg op datum", description = "Retourneert de Overleggen die hebben plaatsgevonden op de gespecificeerde datum.")
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
  public Response vindCasusoverlegOpDatum(
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/page") int page,
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/pageSize") int pageSize,
    @Parameter(ref = "https://armatiek.github.io/imvertor-openapi-generator/openapi/common-parameters.yaml#/components/parameters/sortField") String sortField,
    @QueryParam("zoekdatum") @Parameter(description = "De datum waarop het overleg heeft plaatsgevonden.", required = true, example = "2025-10-01") java.time.LocalDate zoekdatum) {
    return Response.ok().build();
  }

}
