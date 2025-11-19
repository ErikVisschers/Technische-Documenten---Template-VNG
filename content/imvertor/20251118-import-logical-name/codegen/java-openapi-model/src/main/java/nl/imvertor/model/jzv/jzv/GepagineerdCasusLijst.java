package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.model.GepagineerdBase;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.*;

@Schema(allOf = GepagineerdBase.class)
public class GepagineerdCasusLijst {

  @Schema(requiredMode = RequiredMode.REQUIRED)
  private List<Casus> resultaten;

  public List<Casus> getResultaten() {
    return this.resultaten;
  }

  public void setResultaten(List<Casus> resultaten) {
    this.resultaten = resultaten;
  }

}
