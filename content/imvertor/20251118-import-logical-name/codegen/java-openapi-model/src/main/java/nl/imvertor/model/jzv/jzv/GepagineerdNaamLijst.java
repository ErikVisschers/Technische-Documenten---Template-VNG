package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.model.GepagineerdBase;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.*;

@Schema(allOf = GepagineerdBase.class)
public class GepagineerdNaamLijst {

  @Schema(requiredMode = RequiredMode.REQUIRED)
  private List<Naam> resultaten;

  public List<Naam> getResultaten() {
    return this.resultaten;
  }

  public void setResultaten(List<Naam> resultaten) {
    this.resultaten = resultaten;
  }

}
