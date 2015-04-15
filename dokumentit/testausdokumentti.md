# Organizing algorithmsin testausdokumentti


Projektissa ei ole mitään sen kummenpaa testausta, sillä kaikki toteutetut algoritmit ainoastaan järjestävät syötteen ja sen toimivuuden testaus on triviaalia.

Kaikille algoritmeille on tehty samat testit, tosin kutsutapa on jollain erilainen eikä kaikille ole mahdollista testata esimerkiksi tyhjää listaa, koska algoritmi ei toimi sille (kerrottu jos on tälläinen *ominaisuus* luokan kuvauksesssa).

Myöskin testien apuluokalla checker on vastaava testiluokka.

Testaukset voi yksinkertaisesti toistaa esimerkiksi lataamalla (siis "avaamalla") projektin haluamsa (tukevalla) IDElla ja ajamalla sitten testit.

Testaukseen on käytetty JUnittia, jolloin helposti näkee suoraan toimiiko algoritmi.
  
  
Huomio: Testit eivä ole samat kun syötteet, joiden mukaan vertailut tehtiin (ne suoritetaan main-luokan kautta käyttäen tekstitiedostoja), testien tarkoituksena oli vaan testata toimivuus.
  
## Eri testaukset
Kurssiivilla testiluokassa käytetyt testSort_xxx:n nimet.  

* *Random ordered*: Neljä lukua (2,8,4,3) jotka algoritmin on järjestettävä. Tämä on käytännössä päätesti.

* *Already ordered*: Neljä lukua (1,2,3,4), jotka jo järjestetty ja algoritmi pitäis palauttaa sellaisenaan.

* *One number*: Yksinkertaisesti ykkönen, joka pitäisi nyt palautua ykkösena takaisin.

* *Empty*: Tyhjä lista. Testataan, että sellaiset algoritmit, jotka "toimivat" (eivät kaadu) tyhjälle listalle tosiaan tekevät niin.