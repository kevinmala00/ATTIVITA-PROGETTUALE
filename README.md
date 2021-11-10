# ATTIVITA-PROGETTUALE: Modalità di accesso ai dati forniti dal Linguaggio Java per dispositivi mobili e non, con particolare attenzione alla tecnologia REST
***
## GUIDE UTILI
* [CREAZIONE E SINTASSI FILE README.md](https://lorenzoneri.com/come-scrivere-un-readme/) oppure [QUESTO](https://www.ionos.it/digitalguide/siti-web/programmazione-del-sito-web/file-readme/) o [ESEMPIO](https://github.com/italia/readme-starterkit)
* [CREAZIONE E SINTASSI FILE .gitgnore](https://git-scm.com/docs/gitignore#_pattern_format)
* [PROGETTAZIONE APP ANDROID](https://www.html.it/guide/guida-android/)
* [CREAZIONE DELLA DOCUMENTAZIONE JAVA](https://person.dibris.unige.it/magillo-paola/P2_SMID04/lez11.html)
* [NOTAZIONE UML](https://www.tutorialspoint.com/uml/uml_basic_notations.htm)
* [IBM ILOGCPLEX MANUAL](https://www.ibm.com/docs/en/SSSA5P_12.8.0/ilog.odms.studio.help/pdf/usrcplex.pdf)

## DESCRIZIONE
L'attività si incentra sulle varie **modalità di accesso ai dati forniti da Java** (android e pc), ovvero JDBC, REST e SQLite. Dopo una analisi teorica verranno ad un'applicazione gestionale per una pizzeria.
L'applicazione pc utilizzata dalla **_pizzeria_** prevederà le seguenti funzioni chiave: 
* gestione degli ordini che avviene attraverso l'utilizzo di IBM ILOGCPLEX per la risoluzione di problemi di ottimizzazione lineare
* gestione dei turni dei dipendenti
* gestione delle entrate 
* gestione delle destinazioni degli ordini
* gestione del menu

L'applicazione pc interagirà con una versione android riservata a:
* **_clienti_** che potranno:
  * visualizzare le celle temporali in cui possono effettuare un ordine rispetto alla pizzeria
  * visualizzare il menu della pizzeria

* **_fattorini_** che potranno:
  * associarsi a una pizzeria per poter lavorare con essa
  * inserire nuove destinazioni e utilizzare quelle gia presenti 
  * utilizzare il software di calcolo del totale della pizzeria 
  * visualizzare il menu della pizzeria


Di seguito un use case diagram che ne mostra il funzionamento:
![use-case diagram](UML/UseCaseMyPizzeria.jpg)



