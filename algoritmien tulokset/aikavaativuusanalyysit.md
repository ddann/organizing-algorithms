# Algoritmien aikavaativuusanalyysit (sekä tilavaativuus)

### Bubble sort:
  Paras tapaus: n		Ainoastaan jos lista jo järjestyksessä.
  Huonoin: n²			Jos pienin luku on viimeisempänä. (Ei lue missään olevan tämä näin, mutta päättelisin sen olevan näin)
  Keskiverto: n²
  Tilavaativuus: 1

### Insertion sort:
  Paras tapaus: n		Annettu lista on jo järjestyksessä.
  Huonoin: n²			Annetussa listassa jokainen alkio on pienempi tai toiseksi pienempi kun edelliset. (Yksinkertaisin tilanne lista käänteisessä järjestyksessä)
  Keskiverto: n²
  Tilavaativuus: n

### Quicksort (eri versioita, tämä yksinkertaissemman mukaan):
  Paras tapaus: n*logn		"kaikista parhaiten balancoitu tapaus": Jos jokaisella osoittamisella lista jakautuu niin että uksi osa on ainakin 25% alkuperäisestä ja toinen vastaavasti enintään 75%.
  Huonoin: n²			"kaikista huonoiten balancoitu tapaus": Vain jos joka kerta osittaiminen (partitioning) jakaa listan kahdeksi osaksi: Yhden tyhjän ja toisen kooltaan n-1. (esimerkiksi kun kaikki listan numerot ovat samat) (on todella harvinaista)
  Keskiverto: n*logn		(On lähes sama kun paras lähes kaikissa tapauksissa)
  Tilavaativuus: logn

### Merge sort:
  Paras tapaus: n*logn		???
  Huonoin: n*logn		???
  Keskiverto: n*logn
  Tilavaativuus: n

### HeapSort:
  Paras tapaus: n*logn		???
  Huonoin: n*logn		???
  Keskiverto: n*logn
  Tilavaativuus: 1

### Cocktail sort:
  Paras tapaus: n		Ainoastaan jos lista jo järjestyksessä.
  Huonoin: n²			Lista käänteisessä järjestyksessä. (?)
  Keskiverto: n²
  Tilavaativuus: 1

### Introsort (itseasiassa se on hybriidi, joka käyttää hyväkseen Heapsortia ja Quicksortia):
Huomio: Riippuu siitä miten järjestettävä käyttäytyy Heapsortin ja Quicksortin kanssa. Painottuu Quicksortiin.
  Paras tapaus: n*logn
  Huonoin: n*logn
  Keskiverto: n*logn
  Tilavaativuus: logn

### Selection sort:
Huomio: Selection sort suoriutuu aina yhtä tehokkaasti riippumatta annetun järjestettävän alkioista ja järjestyksestä, riippuu vaan sen koosta.
  Paras tapaus: n²
  Huonoin: n²
  Keskiverto: n²
  Tilavaativuus: n

### Timsort (hybridi algoritmi, joka perustuu Merge sortiin ja Insertion sortiin):
Huomio: Aikavaativuus tietyssä tapauksessa on jonkinlaisesti pääteltävissä siitä miten Merge sort ja Insertion sort suoriutuvat sillä. Mutta tässä on aikavaativuuteen vahvasti vaikuttavaa omaa toteutusta.
  Paras tapaus: n		Jos data on jo järjestetty tai käänteisessä järjestyksessä.
  Huonoin: n*logn		???
  Keskiverto: n*logn
  Tilavaativuus: n

