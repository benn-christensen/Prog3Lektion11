# Lektion 11: Iterator og Composite

## Opgave 1: Implementering af Iterator i Range

I denne opgave skal du færdiggøre klassen `Range`, der findes i pakken `opgave01`.
`Range` repræsenterer et interval af heltal (fra `start` til `end` inklusiv).

Klassen implementerer `Iterable<Integer>`, men metoden `iterator()` returnerer i øjeblikket `null`.

### Din opgave:
1.  Implementer en iterator til `Range` klassen.
2.  Du kan vælge at implementere iteratoren som en privat indre klasse i `Range`.
3.  Iteratoren skal kunne gennemløbe alle tal i intervallet fra `start` til og med `end`.
4.  Efter implementeringen skal du kunne køre `Main` klassen i `opgave01` og se tallene fra -3 til 10 blive udskrevet.
