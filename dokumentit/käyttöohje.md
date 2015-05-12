# Käyttöhjeet 

## Miten saadaan ajettua ohjelma
Yksinkertaisesti voidakseen käyttää ohjelmaa ajetaan algorithms.jar-tiedosto (tai sitten main.Main luokka IDEn kautta).  
Se on tekstipohjainen ohjelma ja se tulostaa outputin terminaaliin.  
Komennolla *java -jar "polku jonka kautta tiesosto löytyy mukaan lukien sen nimi päätteellä"* saa sen ajettua.


## Mitä voi tehdä ohjelmalla
(Valinta mitä haluaa tehdä tulee tehtyä vastaessa ohjelman kysymykseen)  

### Testata algoritmien tehokkuutta manuaalisesti
Ohjelmalla voi testata algoritmien tehokkuutta eri syötteillä.  
Kannattaa huomioda, että ensimmäinen kerta kun järjestämisalgoritmia käytetään sen luokka käännetään, joten sitä ei pidä ottaa huomioon.  
Ja jos kutsuu monta kertaa putkeen sama algoritmia samalla syötteellä niin cacheaminen vaikuttaa tuloksiin, joten niitä tulokisa ei kannata käyttää.  

### Testata algoritmien tehokkuutta automaattisesti
Ohjelmassa on automaattinen testaus, joka testaa kaikki algoritmit esimäärätyillä syötteillä ja tallentaa tulokset.  
Kaikki listat on käytössä paitsi 7 sekä 6 bubblelle, selectionille ja insertionille ja 7 quickille. Tämä testipaketti on suhteellisen nopeaa ajaa.  
Huomio: ÄLÄ poista tiedostoja kansion *results* alla tai et voi käyttää tätä ominaisuutta.

### Luoda listoja syötteeksi
Ohjelmassa on toteutettu oma *listan luova toiminto*, jolla voi tehdä listoja järjestettäviksi.  
Siinä voi valita luotavan listan elementtien määrä, mitä tyyppiä lista on (random numeroita, järjestetty, käänteinen järjestys, samaa numeroa) sekä 
tiedoston nimi johon se tallennetaan, joka on *to be ordered x* missä *x* on se mitä voi valita.   


## Omien listojen lisääminen mahdolliseksi syötteeksi
Kansioon *lists* on siirettävä haluttu tiedosto ja sen nimi kuuluu olla *to be ordered x* missä *x* on se mitä voi valita.
Listassa kuuluu olla kaikki luvut 32-bit integereita ja erotettuna välilyönnilla.  
Jos haluaa käyttää omia listoja testaukseen, pitää kirjoittaa vaan *list-size* tiedostoon infon sen koosta muodolla: "(x osion nimi) (määrä lukuja)".  
Ja voi laittaa myös helppiin vastaava infoa kun jo *built-inneissä* halutessa.  