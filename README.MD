Een projectje om uit te zoeken hoe je afslagen in je BPM proces kunt laten bepalen door het al dan niet 
afgaan van een Exception. Hier heb ik een klein basisprojectje voor opgezet met een simpel procesje 
dat een Exception in een service task triggert wanneer niet alle variabelen worden meegegeven aan de 
voorliggende handmatige stap. Wanneer er een exception optreedt, dien het proces middels een handmatige 
stap afgehandeld te worden. Geeft de service task geen foutmelding, dan kan het proces automatisch 
succesvol afgehandeld worden.

Bij lokaal draaien: 
- Benaderen via localhost:8080;
- Inloggen met kermit/superSecret;
- Ga naar TASKLIST;
- Klik op het proces "automatischeverwerking";
- Klik aan de rechterkant op Claim om het proces op jouw naam te zetten;
- Nu heb je de mogelijkheid om customerId en amount op te geven. De volgende stap geeft geen Exception wanneer beide gevuld zijn.
- Als je op het tabblad "Diagram" klikt zie je het proces en waar het proces zich op dit moment bevindt.
- Wanneer customerId en amount niet zijn meegegeven zal het proces een afslag nemen naar de stap "handmatig doordrukken", en dit het proces handmatig doorgedrukt te worden. Hiervoor dien je wellicht het proces weer te "claimen" net als hiervoor gedaan is;
- Wanneer customerId en amount wel zijn meegegeven eindigt het proces uit zichzelf.
- Zie de logging in de console waar het proces zich bevindt.

