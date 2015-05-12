 
# Yhteenveto algoritmien suorituskyvystä

## Bubble sort
Aivan ilmeisesti yleensä huonoin testatuista. Vähän pidempikin lista niin suoritusaika on valtava.  
Ei ole myöskään edes tehokas pienillä listoilla, esim. insertion sort on huomattavasti nopeampi niissä.  
Ainoa tapaus milloin se on hyvä on jos lista on jo järjestetty (tai aivan lähes), silloin se on paras.

## Selection sort
Paljon muuta ei voi sanoa tehokkuudesta kun, että on sentään tehokkaampi kun ei-optimpoitu bubble sort (häviää optimoidulle).  
Ja että jos lista on jo järjestyksessa huonoin vaihtoehto, sillä se suoriutuu aina yhtä tehokkaasti.(Käänteiselläkään ei ole paras vaihtoehto)  

## Insertion sort
On itseasiassa laadukas algoritmi, joka voi olla hidas suurilla syötteillä, mutta pienillä on ehdottomasti nopein.  
Ihmeellisesti kyllä itselläni testieni mukaan käänteinen järjestys oli yhtä tehokas kun jo järjestetty (siis best-case), siis ei ollut worst-case. Mitään virhettä ei ole minun listoissa, joten ehkä se on Wikipediassa se virhe...

## Quicksort
Huomattavasti huonompi kun maineensa antaa ymmärtää: Vaati todella paljon muistia ja helposti aiheuttaa stack overflowin/"välimuistin täyttymisen"(josta seuraa jotain ei hyvää).  
Pienillä listoilla ei ole tehokkain, Insertion sort voitta, Suurilla listoilla taas heapsort voittaa.  
Oikealla pivot-valinnalla quicksort on ehkä "tehokkain" silloin kun insertionin n² alkaa aiheuttamaan liikaa hitautta ja listan koko on vielä sen verran pieni ettei muisti ole ongelmana.  
Sen ainoa hyöty on hyvä worst-case: paras vaihoteoehto jos lista on käänteisessä järjestyksessä.  
Hyvä ehkä osana hybriidia algoritmia kuten introsort.

## Merge sort
Hyvä vaihtoehto, jos lista on käänteisessä järjestyksessä (tai lähes). Mutta silloinkin häviää heapsortille, tosin tästä on *luonnollinen variaatio*, joka olisi tässä tapauksessa paras vaihtoehto algoritmeista.  
Muuten se ei ole nopeudeltaan eikä tilavaativuudeltaan mikään hyvä.

## Heapsort
Ei-hybriidesitä ehdottomasti paras.  
Suoriutuu nopeasti isoilla listoilla ja pienillä lähes yhtä hyvin kun yksinkertaiset (jotka suoriutuvat parhaiten pienillä).
Ehdottomasti paras vaihtoehto, jos listassa on reilusti samoja alkioita.

## Introsort
Projektin ainoa hybriidi, joka käyttää hyväkseen quicksortiia ja heapsorttia.  
Erityisen tehokas isoilla syötteillä ja worst-case on suhteellisen nopea. Tosin suhteellisesti hidas pienillä syötteillä.  