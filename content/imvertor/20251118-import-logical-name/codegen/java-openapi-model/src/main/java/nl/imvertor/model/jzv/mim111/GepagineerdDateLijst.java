package nl.imvertor.model.jzv.mim111;

import nl.imvertor.mim.model.GepagineerdBase;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.*;

@Schema(allOf = GepagineerdBase.class)
public class GepagineerdDateLijst {

  @Schema(requiredMode = RequiredMode.REQUIRED)
  private List<Date> resultaten;

  public List<Date> getResultaten() {
    return this.resultaten;
  }

  public void setResultaten(List<Date> resultaten) {
    this.resultaten = resultaten;
  }

}
