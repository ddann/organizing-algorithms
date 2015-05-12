# "Mittausten" tulokset

Tässä löytyy "mittausten" keskiarvo jokaiselle algoritmi ja lista parille erikseen (ja pyöristetty niin, että desimaaliosa jää pois).  
Otoksia oli 3.  
Mittaukset tehtiin niin, että ensin kutsuttiin luokkaa saadakseen sen kääntämisen aiheuttaman vaikutuksen pois ja sitten käytettiin seuraavaa käyttöä otoksena. (Seuraavia ei, jottei cacheaminen vaikuttaisi liikaa.)  
Ja kuten huomaa aikavaativuudet eri listoilla eri algoritmeilla ovat sellaiset kun pitäisi (ainakin mittaustarkuuden puitteissa).  
  
Huomio: ovat keskiarvoja, tarkat "mittaukset" omina tiedostoina.  
Laskut ovat myöskin omana tiedostoina. Ensimmäinen sheet on laskut ja seuraavat algoritmikohtaisia arvoja.  
*Yhteenveto.md* tiedostossa on lyhyet päättelyt algoritmien suoritustehokkuudesta.
(Kaikki ilmoitetut keskiverto-ajat ovat nanosekunteissa)  
  
## Bubble sort

### Random listat
* 1:        1618
* 2:      163304
* 3:     3376303
* 4:   113361685
* 5: 12166525267

### Järjestetyt listat
* 8:        1132
* 9:        5876
* 10:      41311

### käänteiset järjestykset
* 11:     483103
* 12:   45000675
* 13: 4539035266

### samaa lukua
* 14:       1160
* 15:       6241
* 16:      41782


## Selection sort

### Random listat
* 1:        1171
* 2:       68205
* 3:     2781160
* 4:    21206131
* 5:  2054991498

### Järjestetyt listat
* 8:      213496
* 9:    20502203
* 10: 2053859090

### käänteiset järjestykset
* 11:     213390
* 12:   20462362
* 13: 2054078017

### samaa lukua
* 14:     214018
* 15:   20500581
* 16: 2052837840


## Insertion sort

### Random listat
* 1:         495
* 2:        2846
* 3:       24763
* 4:      246871
* 5:     2516742

### Järjestetyt listat
* 8:        1434
* 9:        9169
* 10:      90025

### käänteiset järjestykset
* 11:       1260
* 12:      10042
* 13:      88103

### samaa lukua
* 14:       1271
* 15:       9691
* 16:      87997


## Quicksort (eri versioita, tämä yksinkertaissemman mukaan):

### Random listat
* 1:        2185
* 2:       21740
* 3:      250203
* 4:     5238304
* 5:     7858385
* 6:    76910637

### Järjestetyt listat
* 8:       12831
* 9:      143198
* 10:    1782475

### käänteiset järjestykset
* 11:      11246
* 12:     141612
* 13:    1773943

### samaa lukua
* 14:     352197
* 15:   34178839


## Merge sort

### Random listat
* 1:        5061
* 2:       56162
* 3:      803684
* 4:    22256336
* 5:    34686508
* 6:    93700362
* 7:  1852413522

### Järjestetyt listat
* 8:       71120
* 9:      725258
* 10:    8094150

### käänteiset järjestykset
* 11:      68048
* 12:     722664
* 13:    7714583

### samaa lukua
* 14:      61787
* 15:     644052
* 16:    7314382

## HeapSort

### Random listat
* 1:        2785
* 2:       37293
* 3:      579838
* 4:     2066694
* 5:     7610895
* 6:    64005776
* 7:  1775571964

### Järjestetyt listat
* 8:       43291
* 9:      467664
* 10:    5352955

### käänteiset järjestykset
* 11:      41898
* 12:     474556
* 13:    5322074

### samaa lukua
* 14:       3252
* 15:      30486
* 16:     297831


## Introsort (itseasiassa se on hybriidi, joka käyttää hyväkseen Heapsortia ja Quicksortia)

### Random listat
* 1:        4815
* 2:       47519
* 3:      628835
* 4:    11644300
* 5:    16045342
* 6:    48183980
* 7:   544790503

### Järjestetyt listat
* 8:       41656
* 9:      408507
* 10:    4404950

### käänteiset järjestykset
* 11:      40421
* 12:     408275
* 13:    4415743

### samaa lukua
* 14:      40510
* 15:     350781
* 16:    4304063

