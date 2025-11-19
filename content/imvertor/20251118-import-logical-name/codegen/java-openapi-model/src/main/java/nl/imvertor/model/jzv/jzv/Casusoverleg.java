package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.annotation.*;
import nl.imvertor.mim.model.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.media.Schema.*;
import java.util.*;
import java.time.*;

/**
 * Een periodiek beraad waarbij meerdere bij de casus betrokken ketenpartners in een samenwerking samenwerken. Zie deze [link](https://www.justid.nl/) voor meer informatie.
 */
@Objecttype
@Schema(description = """
Een periodiek beraad waarbij meerdere bij de casus betrokken ketenpartners in een samenwerking samenwerken.

Zie deze [link](https://www.justid.nl/) voor meer informatie.""")
public class Casusoverleg {

  @Schema(name = "url", description = "URL-referentie naar de resource waarnaar verwezen wordt", type = "string", format = "uri", requiredMode = RequiredMode.REQUIRED, accessMode = AccessMode.READ_ONLY, minLength = 1)
  private String url;

  /**
   * De unieke identificatie van het casusoverleg.
   * Attribuutsoort
   */
  @Schema(name = "id", description = "De unieke identificatie van het casusoverleg.", requiredMode = RequiredMode.REQUIRED)
  private String id;

  /**
   * De datum waarop het casusoverleg heeft plaatsgevonden.
   * Attribuutsoort
   */
  @Schema(name = "datum", description = "De datum waarop het casusoverleg heeft plaatsgevonden.", requiredMode = RequiredMode.REQUIRED)
  private java.time.LocalDate datum;

  /**
   * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
   * Attribuutsoort
   */
  @Schema(name = "notulen", requiredMode = RequiredMode.REQUIRED)
  private String notulen;

  /**
   * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
   * Relatiesoort -> Objecttype
   */
  @ArraySchema(schema = @Schema(name = "heeft agendapunt", requiredMode = RequiredMode.REQUIRED))
  private List<nl.imvertor.model.jzv.jzv.Casus> heeftAgendapunt;

  public String getUrl() {
    return url;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public java.time.LocalDate getDatum() {
    return datum;
  }

  public void setDatum(java.time.LocalDate datum) {
    this.datum = datum;
  }

  public String getNotulen() {
    return notulen;
  }

  public void setNotulen(String notulen) {
    this.notulen = notulen;
  }

  public List<nl.imvertor.model.jzv.jzv.Casus> getHeeftAgendapunt() {
    return heeftAgendapunt;
  }

  public void setHeeftAgendapunt(List<nl.imvertor.model.jzv.jzv.Casus> heeftAgendapunt) {
    this.heeftAgendapunt = heeftAgendapunt;
  }

}
