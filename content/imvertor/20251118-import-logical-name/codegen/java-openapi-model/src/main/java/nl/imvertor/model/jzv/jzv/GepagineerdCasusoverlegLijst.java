package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.model.GepagineerdBase;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.*;

@Schema(allOf = GepagineerdBase.class)
public class GepagineerdCasusoverlegLijst {

  @Schema(requiredMode = RequiredMode.REQUIRED)
  private List<Casusoverleg> resultaten;

  public List<Casusoverleg> getResultaten() {
    return this.resultaten;
  }

  public void setResultaten(List<Casusoverleg> resultaten) {
    this.resultaten = resultaten;
  }

}
