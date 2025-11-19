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
public class Casus {

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
  @Schema(name = "startDatum", requiredMode = RequiredMode.REQUIRED)
  private java.time.LocalDate startDatum;

  /**
   * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
   * Relatiesoort -> Objecttype
   */
  @ArraySchema(schema = @Schema(name = "heeft nevenbetrokkene", nullable = true))
  private List<nl.imvertor.model.jzv.jzv.Betrokkene> heeftNevenbetrokkene;

  /**
   * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
   * Relatiesoort -> Objecttype
   */
  @ArraySchema(schema = @Schema(name = "heeftScenario", nullable = true))
  private List<nl.imvertor.model.jzv.jzv.Scenario> heeftScenario;

  /**
   * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
   * Relatiesoort -> Objecttype
   */
  @ArraySchema(schema = @Schema(name = "heeftAfspraak", nullable = true))
  private List<nl.imvertor.model.jzv.jzv.Afspraak> heeftAfspraak;

  /**
   * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
   * Relatiesoort -> Objecttype
   */
  @ArraySchema(schema = @Schema(name = "heeftBesluit", nullable = true))
  private List<nl.imvertor.model.jzv.jzv.Besluit> heeftBesluit;

  /**
   * <!-- FOUT: De waarde voor dit verplichte metagegeven is niet gespecificeerd in het model -->
   * Relatiesoort -> Objecttype
   */
  @Schema(name = "heeft hoofdbetrokkene", requiredMode = RequiredMode.REQUIRED)
  private nl.imvertor.model.jzv.jzv.Betrokkene heeftHoofdbetrokkene;

  public String getUrl() {
    return url;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public java.time.LocalDate getStartDatum() {
    return startDatum;
  }

  public void setStartDatum(java.time.LocalDate startDatum) {
    this.startDatum = startDatum;
  }

  public List<nl.imvertor.model.jzv.jzv.Betrokkene> getHeeftNevenbetrokkene() {
    return heeftNevenbetrokkene;
  }

  public void setHeeftNevenbetrokkene(List<nl.imvertor.model.jzv.jzv.Betrokkene> heeftNevenbetrokkene) {
    this.heeftNevenbetrokkene = heeftNevenbetrokkene;
  }

  public List<nl.imvertor.model.jzv.jzv.Scenario> getHeeftScenario() {
    return heeftScenario;
  }

  public void setHeeftScenario(List<nl.imvertor.model.jzv.jzv.Scenario> heeftScenario) {
    this.heeftScenario = heeftScenario;
  }

  public List<nl.imvertor.model.jzv.jzv.Afspraak> getHeeftAfspraak() {
    return heeftAfspraak;
  }

  public void setHeeftAfspraak(List<nl.imvertor.model.jzv.jzv.Afspraak> heeftAfspraak) {
    this.heeftAfspraak = heeftAfspraak;
  }

  public List<nl.imvertor.model.jzv.jzv.Besluit> getHeeftBesluit() {
    return heeftBesluit;
  }

  public void setHeeftBesluit(List<nl.imvertor.model.jzv.jzv.Besluit> heeftBesluit) {
    this.heeftBesluit = heeftBesluit;
  }

  public nl.imvertor.model.jzv.jzv.Betrokkene getHeeftHoofdbetrokkene() {
    return heeftHoofdbetrokkene;
  }

  public void setHeeftHoofdbetrokkene(nl.imvertor.model.jzv.jzv.Betrokkene heeftHoofdbetrokkene) {
    this.heeftHoofdbetrokkene = heeftHoofdbetrokkene;
  }

}
