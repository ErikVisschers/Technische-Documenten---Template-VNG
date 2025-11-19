package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.model.GepagineerdBase;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.*;

@Schema(allOf = GepagineerdBase.class)
public class GepagineerdScenarioLijst {

  @Schema(requiredMode = RequiredMode.REQUIRED)
  private List<Scenario> resultaten;

  public List<Scenario> getResultaten() {
    return this.resultaten;
  }

  public void setResultaten(List<Scenario> resultaten) {
    this.resultaten = resultaten;
  }

}
