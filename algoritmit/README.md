# Infoa kansion sisältämästä projektista

Jokainen toteutettu algoritmi on omana luokkanaan projektissa.

Järjestettävät lukujoukot ovat projektin juuressa samassa kansiossa kun tämä tiedosto. Tiedostoiden nimet on "to be ordered x".

Outputtia ei kirjoiteta itseasiassa (vaikka onkin toteutettu, on enemmän "extraa"), sillä kerran kun on testattu algoritmin toimivaksi ei ole tarvittavaa kirjoittaa muistiin lopputulos.  
  
**Tärkeä huomio:** Ajaessa algoritmia (itseasiassa ajautuu ohjelman kutsu ja sitten algoritmi siinä theradissa, mutta ei sillä niin väliä) suorituaika heittelee melkoisesti, mutta ensimmäisen kutsukerran enemmän kun seuraavissa ja se vaikuttaa todella suuresti.  
Kannattaa huomioida se ja ajaa testaukset aina huomioiden vaan ensimmäista seuraavat. (Varmaan johtuu Javan kääntämistavasta C:hen, siis oliko?: "just-in-time", sekä cacheamisen, jonka en tosin uskois vaikuttavan aivan niin suuresti kun testien suoriteusero yksinään)  
Testattu: Näyttää olevan syynä tosiaan alkukääntäminen + cacheeminen, sillä jos perää luo nopeasti toisen kutsin niin kulunut aika on huomattavasti pienempi kun jos odottaa kauemmin.  
mmm...tämä tekee vertailun laadusta huonomman, ainakin tässä prosessorin cachen määrän ero vaikuttaa melkoisesti ellei kutsu heti perään.  
Kun aikavaativuustestit tehdään kannattaa laittaa automaattisesti kutsuumaan ja kirjaamaan tulokset putkeen.
Kysymys: Tai onko sittenkin niin, että pitäis ensin ajaa kerran ja sitten odottaa jonkin aikaa, koska jos se, että on sama lista cachen kautta vaikuttaa tulokseen, niin eihän algoritmin saa (tavallisesti) kun järjestettävän listan kerran ja muita laskuja tapahtuu sen käytön välillä...
(Tosin tämä ei varmaan vaikuta elapsed time:n suhteessa syötteen kokooon, eli ainakin aikavaativuusluokka pitäisi mennä oikein. Niin kauan kun joko käyttää jompaakumpaa tapaa.)
  
  

## Järjestettävien lukojoukkojen sisältämä data

Jokainen tiedosto sisältää 32-bittsisiä integereitä putkeen järjestettäväksi (randomissa järjestyksessä). Kaikki mahdolliset luvut ovat käytössä ja jakauma pitäisi olla tasainen, käytetty Javan Random.nextInt() metodia.  
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
(Itselläni tiedosto purattu tiedosto muualla, ettei vahingossa päädy tälläinen möykky githubiin.)