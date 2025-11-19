package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.annotation.*;
import nl.imvertor.mim.model.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.media.Schema.*;
import java.util.*;
import java.time.*;

/**
 * Een toezegging van een ketenpartner bepaalde handelingen of interventies zo snel mogelijk uit te gaan voeren.
 */
@Objecttype
@Schema(description = "Een toezegging van een ketenpartner bepaalde handelingen of interventies zo snel mogelijk uit te gaan voeren.")
public class Afspraak {

  @Schema(name = "url", description = "URL-referentie naar de resource waarnaar verwezen wordt", type = "string", format = "uri", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY, minLength = 1)
  private String url;

  /**
   * De unieke identificatie van de afspraak.
   * Attribuutsoort
   */
  @Schema(name = "id", description = "De unieke identificatie van de afspraak.", requiredMode = RequiredMode.REQUIRED)
  private String id;

  /**
   * De beschrijving van de gemaakte afspraak.
   * Attribuutsoort
   */
  @Schema(name = "omschrijving", description = "De beschrijving van de gemaakte afspraak.", requiredMode = RequiredMode.REQUIRED)
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
