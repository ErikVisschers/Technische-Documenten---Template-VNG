package nl.imvertor.resource;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;
import io.swagger.v3.oas.annotations.servers.*;
import io.swagger.v3.oas.annotations.tags.*;

@OpenAPIDefinition(
  info = @Info(
    title = "JZV",
    description = "Dit is de tekst van de tag *OA Description* bij de package «Informatiemodel» JZV. Dit is een [link](https://www.justid.nl/).",
    version = "1.0.0",
    contact = @Contact(
      
    ),
    license = @License(
      
    )
  ),
  servers = {
  }
)
public class OpenApiDefinition {

  public enum OpenAPISpecVersion { API30, API31 };

  public static OpenAPISpecVersion getOpenAPISpecVersion() {
    return OpenAPISpecVersion.API30;
  }

  public static boolean getSchemasOnly() {
    return false;
  }

  public static boolean getBundleDescriptions() {
    return false;
  }

}
