package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.model.GepagineerdBase;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.*;

@Schema(allOf = GepagineerdBase.class)
public class GepagineerdBetrokkeneLijst {

  @Schema(requiredMode = RequiredMode.REQUIRED)
  private List<Betrokkene> resultaten;

  public List<Betrokkene> getResultaten() {
    return this.resultaten;
  }

  public void setResultaten(List<Betrokkene> resultaten) {
    this.resultaten = resultaten;
  }

}
