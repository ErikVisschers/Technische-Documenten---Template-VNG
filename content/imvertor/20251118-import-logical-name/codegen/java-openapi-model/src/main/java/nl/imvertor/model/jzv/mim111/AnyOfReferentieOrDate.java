package nl.imvertor.model.jzv.mim111;

import nl.imvertor.mim.model.Referentie;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(anyOf = { Referentie.class, Date.class })
public class AnyOfReferentieOrDate { }
