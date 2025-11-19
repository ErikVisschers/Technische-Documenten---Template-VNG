package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.annotation.*;
import nl.imvertor.mim.model.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.media.Schema.*;
import java.util.*;
import java.time.*;

/**
 * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
 */
@Objecttype
@Schema()
public class Scenario {

  @Schema(name = "url", description = "URL-referentie naar de resource waarnaar verwezen wordt", type = "string", format = "uri", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY, minLength = 1)
  private String url;

  /**
   * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
   * Attribuutsoort
   */
  @Schema(name = "id", requiredMode = RequiredMode.REQUIRED)
  private String id;

  /**
   * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
   * Attribuutsoort
   */
  @Schema(name = "omschrijving", requiredMode = RequiredMode.REQUIRED)
  private String omschrijving;

  /**
   * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
   * Attribuutsoort
   */
  @Schema(name = "verantwoordelijkeOrganisatie", requiredMode = RequiredMode.REQUIRED)
  private String verantwoordelijkeOrganisatie;

  public String getUrl() {
    return url;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOmschrijving() {
    return omschrijving;
  }

  public void setOmschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
  }

  public String getVerantwoordelijkeOrganisatie() {
    return verantwoordelijkeOrganisatie;
  }

  public void setVerantwoordelijkeOrganisatie(String verantwoordelijkeOrganisatie) {
    this.verantwoordelijkeOrganisatie = verantwoordelijkeOrganisatie;
  }

}
