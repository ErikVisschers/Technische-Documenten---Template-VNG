package nl.imvertor.model.jzv.jzv;

import nl.imvertor.mim.model.Referentie;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(anyOf = { Referentie.class, Naam.class })
public class AnyOfReferentieOrNaam { }
