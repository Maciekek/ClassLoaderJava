# ClassLoaderJava
"Program" napisany na potrzeby przedmiotu JVN Internals 2015 Uniwersytet Gdański.

----

##Kilka słów o programie

Zadanie polegało na napisaniu programu który w czasie działania aplikacji podmieni klasę bez potrzeby restaru aplikacji czy jakiejkolwiek ingerencji ze strony użytkownika. Aplikacja, a w zasadzie nadpisany stworzony ClassLoader pobiera nową definicje klasy ze wskazanego w kodzie serwera. 

Do postawienia serwera wykorzystałem wygenerowaną aplikacje [ExpressJS](http://expressjs.com/starter/generator.html). Generator stworzył mi prosty serwerek (do tego zadania nawet nazbyt rozbudowany). Tam ustawiłem wystawianie pliku ```ClassName.class``` jako odpowiedź na wszystkie zapytania ```(/*)```

Gdy ClassLoader pobierze nową definicje klasy zwraca ją jako znalezioną klasę. W ten sposób odbywa się dynamiczna podmiana klasy.

###Umieszczenie nowej klasy na serwerze
Żeby program zadziałał i podmienił nową klasę należy umieścić wcześniej skompilowaną definicje klasy w katalogu ```webapp/server/routes/public``` o nazwie takiej jak klasa, którą chcemy podmienić


###Uruchomienie serwera
```
node .\bin\www
```

##Podsumowanie
Kolejne ciekawe zadanie. Temat wcześniej przeze mnie nie znany. Fajne połączenie częsci serwera z tym co się dzieje w aplikacji.
