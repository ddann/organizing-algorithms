# Organizing algorithmsin määrittelydokumentti

 
Tässä harjoitustyössä on tarkoituksena toteuttaa eri järjestämisalgoritmeja ja verratana niiden suorituksia eri syötteillä.  
Siis toisin sanoen toteuttaa itse erilaisia järjestämisalgoritmeja, teen eempiiriset reaalisuoritusaikojen mittaukset eri algoritmeille erikokisilla syötteillä ja teen myös teoreettisen" aikavaativusanalyysin sekä ekstrana myöskin tilavaativuuden.  
  
  

Työssä tehdään erilaisia algoritmeja ja valmiita tietorakenteita käytetään vaan aivan "alkukantaisempia" (mitä ilman ei saa mitään aikaseksi).  
Yksinkertaisesti varsinaisesti mitään algoritmeja ei ole valittu ongelman ratkaisemiseen vaan itse algoritmien toteuttaminen ja niiden "tutkiminen" on itse "ongelmana".  
  
Pyrkimys on saada jokaissessa algoritmin toteutksessa mahdollisimman optimaalinen toteutus(tai ainakin tarpeeksi tehokas), jotta vakio aikavaativuusvakio olisi mahdollisimman pieni ja tietenkin aikavaativuusluokka (tärkein, erityisesti suurimmilla syötteillä) tulee olemaan täsmälleen algoritmin aikavaativuusluokkka.  
  
Mitä tulee tilavaativuuteen, niin algoritmien tilavaativuus on se mitä "niiden kuuluisi olla".
  
  
Syötteinä tulee olemaan erikokoisia 32-bittisiä kokonaislukuja siältäviä taulukoita, joita on järjestettävä. (Jotkut algoritmit voivat tosiaan myös järjestää muutakin kun lukuja, jos on määritelty jonkinkinlainen järjestyssehto.)  
Toteutus on tehty, niin että syötteet on tiedostona ja tulokset kirjoitetaan tiedostoksi.
  
  
Toteutettavia apurakenteita: Keko (jälkeenpäin), ArrayList (ei pakollinen, mutta varmaan kannattavaa). Ei muita tarvita varmaan.  
  
  
Lähteet: (jokaiselle algoritmille erikseen, en kyllä vahingossa laittanut ylös milloin katsoin wikipediasta, mikä olisi tärkeää...)  
* Bubble sort: TiRan moniste kunnes huomasin, että siinä toteutus ei ole oikeaoppinen (tarkastin miten sen kuului olla). Tehty wikipedian mukaan (sekä tieto): https://en.wikipedia.org/wiki/Bubble_sort  
* Merge sort: Lähdin liikkeelle TiRan monisteesta, mutta koska en saannut siitä tehtyä algoritmia oikein (ihan kun monisteessa olisi ollut jotain väärin...), käytin sitten pohjana Wikipediassa löytyvän pseudokoodin, sen jälkeen vielä merge metodiin käytin avuksi while-osioon (en hoksannut heti itse miten *pistää talteen* tai muutta jotain niin, että on selvää mitä on jo siiretty) stackoverflowista löytyvän vastauksen toteutuksen tekemiseksi. Tästä tuli monen lähteen *merge*... ei varmaan tavallinen toteutus tosin. Tietoa algoritmista sekä osa toteutuksesta: https://en.wikipedia.org/wiki/Merge_sort (stackoverflowin vastaus: http://stackoverflow.com/questions/1735863/merge-sort-java/18474190#18474190)  
* Insertion sort: Wikipedian artikkeli https://en.wikipedia.org/wiki/Insertion_sort  
* Quicksort: Wikipedian artikkeli https://en.wikipedia.org/wiki/Quicksort
* Selection sort: Wikipedian https://en.wikipedia.org/wiki/Selection_sort
* HeapSort: 
  

## Aika- sekä tilavaativuusanalyysit (huomioi, että tässä projektissa tämä löytyy myös kansiossa "algoritmien tulokset", koska on pakollinen algoritmien oikean vertailun takia):
(Kuten aina huonoin tapaus on pitkälti tärkein vertailessa, mutta ei yksinään kerro välttämättä paljoakaan silti. Pelkästään suuntaa antavaa, vakiot voivat poiketa todella suuresti ja tapauksien luokkien suhde, esim. paras tai huonoin, voi vaihdella suuresti)  
Huomio: Tässä ei ole kaikkia tavallisia algoritmeja, sillä niitä riittää enkä toteuta kaikkia.

### Bubble sort:
* Paras tapaus: n		  Ainoastaan jos lista jo järjestyksessä.  
* Huonoin: n²			  Jos pienin luku on viimeisempänä. (Ei lue missään olevan tämä näin, mutta päättelisin sen olevan näin)  
* Keskiverto: n²  
* Tilavaativuus: 1  

### Insertion sort:
* Paras tapaus: n		  Annettu lista on jo järjestyksessä.  
* Huonoin: n²			  Annetussa listassa jokainen alkio on pienempi tai toiseksi pienempi kun edelliset. (Yksinkertaisin tilanne lista käänteisessä järjestyksessä)  
* Keskiverto: n²  
* Tilavaativuus: n  

### Quicksort (eri versioita, tämä yksinkertaissemman mukaan):
* Paras tapaus: n*logn		  "kaikista parhaiten balancoitu tapaus": Jos jokaisella osoittamisella lista jakautuu niin että uksi osa on ainakin 25% alkuperäisestä ja toinen vastaavasti enintään 75%.  
* Huonoin: n²			  "kaikista huonoiten balancoitu tapaus": Vain jos joka kerta osittaiminen (partitioning) jakaa listan kahdeksi osaksi: Yhden tyhjän ja toisen kooltaan n-1. (esimerkiksi kun kaikki listan numerot ovat samat) (on todella harvinaista)  
* Keskiverto: n*logn		  (On lähes sama kun paras lähes kaikissa tapauksissa)  
* Tilavaativuus: logn  

### Merge sort:
Huomio: Mitä tasaisemmin lista jakautuu eri kerroilla kahteen sitä tehokkaampi algoritmi on. Siis verrattuna muihin käsittellessä samaa inputtia, niin mitä suhteellisemmin listan koko on lähellä edellistä kakkosen potenssia kun seuraavaa sitä tehokkaampi se on.  
Tosin riippumatta syötteen sisällön järjestyksestä, niin aikavaativuus on aina pitkälti sama (Siis riippuu pitälti vaan koosta). Poikkeuksena on "luonnollinen variaatio", jossa best-case on huomattavasti tehokkaampi.  
* Paras tapaus: n*logn  
* Huonoin: n*logn  
* Keskiverto: n*logn  
* Tilavaativuus: n  

### HeapSort:
* Paras tapaus: n*logn		  ???  
* Huonoin: n*logn		  ???  
* Keskiverto: n*logn  
* Tilavaativuus: 1  

### Cocktail sort: Ei tehty
* Paras tapaus: n		  Ainoastaan jos lista jo järjestyksessä.  
* Huonoin: n²			  Lista käänteisessä järjestyksessä. (?)  
* Keskiverto: n²  
* Tilavaativuus: 1  

### Introsort (itseasiassa se on hybriidi, joka käyttää hyväkseen Heapsortia ja Quicksortia): Ei tehty
Huomio: Riippuu siitä miten järjestettävä käyttäytyy Heapsortin ja Quicksortin kanssa. Painottuu Quicksortiin.  
* Paras tapaus: n*logn  
* Huonoin: n*logn  
* Keskiverto: n*logn  
* Tilavaativuus: logn  

### Selection sort:
Huomio: Selection sort suoriutuu aina yhtä tehokkaasti riippumatta annetun järjestettävän alkioista ja järjestyksestä, riippuu vaan sen koosta.  
* Paras tapaus: n²  
* Huonoin: n²  
* Keskiverto: n²  
* Tilavaativuus: n  

### Timsort (hybridi algoritmi, joka perustuu Merge sortiin ja Insertion sortiin): Ei tehty
Huomio: Aikavaativuus tietyssä tapauksessa on jonkinlaisesti pääteltävissä siitä miten Merge sort ja Insertion sort suoriutuvat sillä. Mutta tässä on aikavaativuuteen melko vahvasti vaikuttavaa omaa toteutusta.  
* Paras tapaus: n		  Jos data on jo järjestetty tai käänteisessä järjestyksessä.  
* Huonoin: n*logn  
* Keskiverto: n*logn  
* Tilavaativuus: n  

