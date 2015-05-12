# Infoa kansion sisältämästä projektista

Jokainen toteutettu algoritmi on omana luokkanaan projektissa.

Järjestettävät lukujoukot löytyvät kansiosta *lists*. Tiedostoiden nimet on "to be ordered x".

On olemassa oma luokka, jonka avulla voi tehdä listoja.

Outputtia ei kirjoiteta itseasiassa, sillä kerran kun on testattu algoritmin toimivaksi ei ole tarvittavaa kirjoittaa muistiin lopputulos.  
  
Jos haluaisi käyttää omia listoja testaukseen, se on mahdollista jos muistaa pistää vaan *list-size* tiedostoon infon sen koosta muodolla: "(x osion nimi) (määrä lukuja)".  
Ja voi laittaa myös helppiin vastaava infoa kun jo *built-inneissä* halutessa.  
  
**Tärkeä huomio:** Ajaessa algoritmia (itseasiassa ajautuu ohjelman kutsu ja sitten algoritmi siinä theradissa, mutta ei sillä niin väliä) suorituaika heittelee melkoisesti, mutta ensimmäisen kutsukerran enemmän kun seuraavissa ja se vaikuttaa todella suuresti.  
Kannattaa huomioida se ja ajaa testaukset aina huomioiden vaan ensimmäista seuraavat. (Varmaan johtuu Javan kääntämistavasta C:hen, siis oliko?: "just-in-time", sekä cacheamisen, jonka en tosin uskois vaikuttavan aivan niin suuresti kun testien suoriteusero yksinään)  
Testattu: Näyttää olevan syynä tosiaan alkukääntäminen + cacheeminen, sillä jos perää luo nopeasti toisen kutsin niin kulunut aika on huomattavasti pienempi kun jos odottaa kauemmin.  
mmm...tämä tekee vertailun laadusta huonomman, ainakin tässä prosessorin cachen määrän ero vaikuttaa melkoisesti ellei kutsu heti perään.  
Kun aikavaativuustestit tehdään kannattaa laittaa automaattisesti kutsuumaan ja kirjaamaan tulokset putkeen.
(Tosin tämä ei varmaan vaikuta elapsed time:n suhteessa syötteen kokooon, eli ainakin aikavaativuusluokka pitäisi mennä oikein. Niin kauan kun joko käyttää jompaakumpaa tapaa.)
  
  

## Järjestettävien lukojoukkojen sisältämä data

Jokainen tiedosto sisältää 32-bittsisiä integereitä putkeen järjestettäväksi  
  Eri tyypit:  
* randomissa järjestyksessä: Kaikki mahdolliset luvut ovat käytössä ja jakauma pitäisi olla tasainen, käytetty Javan Random.nextInt() metodia. 1-7  
* järjestetty lista: tasaisin välein lukuja 0- (listan lukujen määrä -1). 8-10  
* käänteisessä järjestyksessä oleva lista:  tasaisin välein lukuja 0- (-listan lukujen määrä +1). 11-13  
* samaa lukua: kaikki elemntit ovat listassa samaa lukua: 100. 14-16
  
Nimet ovat "to be ordered_x", missä x on alla olevan jaon mukaisesti se lukujoukkko.  
  
  
### 1
Todella lyhyt joukko lukuja järjestäväksi. 10 lukua.

### 2
Vähän enemmän 100.

### 3
Jonkin pienen verran jo lukuja 1000.

### 4
Tässä on jo jonkin verran lukuja 10000.

### 5
Tässä hitaimmissa jo huomaa jotain 100000.

### 6
Hitaat ovat nyt oikeasti hitaita 1000000.

### 7
Ei todellakaan kannata edes kokeilla kaikilla: 10000000. Meni vähän yli.  
Huomio: zipattu, koska muuten veisi 100 MBi tilaa (No vie se nytkin 50MBi). Pitää purkaa jotta voi käyttää.  
(Sen saa nopeasti purattua käyttöön ja parempi näin, ettei vahingossa päädy tälläinen möykky githubiin.)

### 8
Lyhyt joukko jo järjestettyjä lukuja. Arvot ovat 0-999 tasaisin välein.

### 9
Melko lyhyt joukko jo järjestettyjä lukuja. Arvot ovat 0-9999 tasaisin välein.

### 10
Pitempi joukko jo järjestettyjä lukuja. Arvot ovat 0-99999 tasaisin välein.

### 11
Lyhyt joukko jossa luvut ovat käänteisessä järjestyksessä. Arvot ovat 0-(-999) tasaisin välein.

### 12
Melko lyhyt joukko jossa luvut ovat käänteisessä järjestyksessä. Arvot ovat 0-(-9999) tasaisin välein.

### 13
Pitempi lyhyt joukko jossa luvut ovat käänteisessä järjestyksessä. Arvot ovat 0-(-99999) tasaisin välein.

### 14
Lista jossa kaikki elementit ovat arvoltaan sama: 100. Kokonaisuutena 1000 kpl.

### 15
Lista jossa kaikki elementit ovat arvoltaan sama: 100. Kokonaisuutena 10000 kpl.

### 16
Lista jossa kaikki elementit ovat arvoltaan sama: 100. Kokonaisuutena 100000 kpl.


