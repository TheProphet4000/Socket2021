-Serveren opretter en pool på 500 pladser, hvor den derefter lytter på port 59002.
-Når serveren opretter pool, vil den samtidig acceptere alle requests på denne port.
-Hvis serveren finder en forbindelse, vil den spørger om et unikt brugernavn. Hvis navnet ikke er unikt,     vil den spørge igen.
-Herefter, vil serveren skrive til alle clienter, at det nye brugernavn er tilsluttet.4
  Serveren vil så videresende den besked, som den enklete client har sent til serveren, med brugernavnet     foran.
-Hvis clientens forbindelse bliver afbrydt, vil serveren skrive til alle, at clienten ved dette brugernavn,   har forladt serveren. Hvor serveren så vil lukke den socket.
