# Infoa kansion sisältämästä tiedosta

Tässä kansiossa löytyvät tulokset, joiden perusteella voi verrata eri järjestämisalgoritmeja toisiinsa.  
Sekä aikavaativuusanalyysit jokaiselle. (Sekä tilavaativuus ekstrana)  
Todellisesti tarkkaan tehokkuusvertailuun vaikuttaa jonkin verran prosessorin ominaisuudet, mutta ei mitenkään merkittävästi.

## Tärkeä huomio:
Tämä on merkittävää ainoastaan suurilla syötteillä  
  
On itsessään väärää vetää johtopäätöksen tehokkuudesta pelkästään aikavaativuusanalyysin ja suorituaika-testien perusteella, sillä jos RAMia on rajoitetusti (tai siis liian vähän algoritmille) itseasiassa algoritmien tehokkuusjärjestys voi olla melkoisesti erillainen. Mutta tässä projektissa on oletettu, että RAMia on tarpeeksi.  
Tilavaativuudesta käy ilmi millä kokoluokalla. (Tilavaativuudelle ei ole mitään vakioiden aiheuttamia eroja suuresti.)  
  
  
* Vähän turhaa, mutta senkun kirjoittelin:
  
Syy tähän on se, että jos prosessii vaatii enemmän kun on fyysistä välimuistia vapaana silloin on pakko alkaa swappaamaan virtuaaliseen välimuistiin ja silloin nopeus kärsii valtavasti.  
(Oikeastaan se on se piste, missä käyetetty muisti ylittää rajan milloin on määritelty Swappaamisen alkaminen.)  
(Jos tosin ohjelmalle annetaan rajoitetusti muistia eikä sitä rajaa saa ylittää niin se suoraan kaatuu ylittäen rajan.)  
Itse aikasuoritusero riippuu toki tallennusvälineen lukunopeudesta/kirjoitusnopeudesta sekä onko jaettu tallennusvälineiden kesken, mutta vaikka olisi todella high-end SSD(t), jota(joita) ei pitäisi käyttää swapille oikeastaan, ero siihen, että käyttäisi RAMia suoraan on silti merkittävä.