package nl.imvertor.model.jzv.mim111;

import nl.imvertor.mim.model.GepagineerdBase;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import java.util.*;

@Schema(allOf = GepagineerdBase.class)
public class GepagineerdCharacterStringLijst {

  @Schema(requiredMode = RequiredMode.REQUIRED)
  private List<CharacterString> resultaten;

  public List<CharacterString> getResultaten() {
    return this.resultaten;
  }

  public void setResultaten(List<CharacterString> resultaten) {
    this.resultaten = resultaten;
  }

}
