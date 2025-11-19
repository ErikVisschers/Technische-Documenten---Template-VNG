package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.annotation.*;
import nl.imvertor.mim.model.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.media.Schema.*;
import java.util.*;
import java.time.*;

/**
 * Een persoon die onderwerp is van de casus.
 */
@Objecttype
@Schema(description = "Een persoon die onderwerp is van de casus.")
public class Betrokkene {

  @Schema(name = "url", description = "URL-referentie naar de resource waarnaar verwezen wordt", type = "string", format = "uri", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY, minLength = 1)
  private String url;

  /**
   * Het burgerservicenummer van de betrokkene.
   * Attribuutsoort
   */
  @Schema(name = "burgerservicenummer", description = "Het burgerservicenummer van de betrokkene.", requiredMode = RequiredMode.REQUIRED)
  private String burgerservicenummer;

  /**
   * De naam van de betrokkene.
   * Gegevensgroep -> Gegevensgroeptype
   */
  @Schema(name = "naam", description = "De naam van de betrokkene.", requiredMode = RequiredMode.REQUIRED)
  private nl.imvertor.model.jzv.jzv.Naam naam;

  public String getUrl() {
    return url;
  }

  public String getBurgerservicenummer() {
    return burgerservicenummer;
  }

  public void setBurgerservicenummer(String burgerservicenummer) {
    this.burgerservicenummer = burgerservicenummer;
  }

  public nl.imvertor.model.jzv.jzv.Naam getNaam() {
    return naam;
  }

  public void setNaam(nl.imvertor.model.jzv.jzv.Naam naam) {
    this.naam = naam;
  }

}
