| Eigenaar | Ingevuld door |
| --- | --- |
| Kennis centrum Architectuur | Robert Melskens |
<hr/>

# LET OP! Verwijder deze repository niet, tenzij...

Deze repository bevat 2 folders die met hun inhoud van belang zijn bij het renderen van Respec documentatie in andere repositories:
* js
* media

De eerste folder bevat het bestand 'organisation-config.js' met de eerder genoemde configuration properties. Aanpassing van deze properties leidt tot andere resultaten bij het renderen van Respec documentatie. Vanuit alle repositories die m.b.v. de VNG-R-Respec-Template repository zijn aangemaakt wordt hiernaar verwezen. 
De tweede folder bevat 'logo-VNG-Realisatie.ico' en 'logo-VNG-Realisatie.jpg', images met het VNG Realisatie logo die eveneens bij het renderen van Respec documentatie in andere repositories worden gebruikt.

Verwijderen van deze repositoy leidt tot andere resultaten bij het renderen van de Respec documentatie in de andere repositories. Verwijder deze repository dan ook alleen als het renderen van Respec documentatie niet meer van toepassing is of als dit op een andere wijze wordt gedaan.

Het 'build.yml' action script in de folder '.github/workflows/' is disabled aangezien het renderen van Respec documentatie voor deze repository niet van belang is. Disablen is gerealiseerd door:

* Het bestand te hernoemen naar 'githubworkflowsbuild.txt' en het te verplaatsen naar de 'root' folder;
* In de Settings van deze repository 'Actions' en de 'Actions' tab te disablen.

Op een later moment zullen we dit bestand verwijderen.


Deze documentatiestructuur is gebaseerd op de VNG-R-Respec-Template, die onder de W3C Software and Document License valt.
