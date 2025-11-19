package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.model.GepagineerdBase;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.*;

@Schema(allOf = GepagineerdBase.class)
public class GepagineerdBesluitLijst {

  @Schema(requiredMode = RequiredMode.REQUIRED)
  private List<Besluit> resultaten;

  public List<Besluit> getResultaten() {
    return this.resultaten;
  }

  public void setResultaten(List<Besluit> resultaten) {
    this.resultaten = resultaten;
  }

}
