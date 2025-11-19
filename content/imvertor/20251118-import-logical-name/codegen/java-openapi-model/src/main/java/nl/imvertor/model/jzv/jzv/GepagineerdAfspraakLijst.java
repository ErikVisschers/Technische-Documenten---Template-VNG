package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.model.GepagineerdBase;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.*;

@Schema(allOf = GepagineerdBase.class)
public class GepagineerdAfspraakLijst {

  @Schema(requiredMode = RequiredMode.REQUIRED)
  private List<Afspraak> resultaten;

  public List<Afspraak> getResultaten() {
    return this.resultaten;
  }

  public void setResultaten(List<Afspraak> resultaten) {
    this.resultaten = resultaten;
  }

}
