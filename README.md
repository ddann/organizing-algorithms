# organizing-algorithms

Harjoitustyö, jossa luon itse toteutukset eri järjestelemisalgoritmeille ja testaan miten ne suoriutuvat tehokkuudeltaan, eli siis teen "teoreettisen" aikavaativusanalyysin ja empiiriset reaalisuoritusaikojen mittaukset eri algoritmeille. Myöskin tilavaativuus esitetään. Siis eri järjestelemisalgoritmeja verrataan toisiinsa.
  
  
Tarkemmin kuvaus löytyy dokumentit - kansiosta määrittelydukumentista. (ja muut dokumentit myös sieltä)

Viikkoraportit löytyvät myös dokumentit - kansiosta. (Itse olisin nimennyt kansion pikemminkin "dokumentaatio")

Itse tulokset löytyvät algoritmien suoritukset - kansiosta. (Osa toteutusdokumenttia, siis analyysit, tulee olemaan kopioituna siellä, koska se on osa tuloksia)

Ei algoritmit samassa projektissa eri luokkina kansion algoritmit alla.

Algoritmien kuvaukset ovat javadoccina. (Ei ole mukana historiaa siitä eikä muuta sellaista tietenkään.)

Buildattu .jar löytyy kansiossa builded-jar, kansiot sen alla ovat tarpeellisia, jotta voi ajata ohjelman oikein.
  
  
PS. Scriptit on kirjoitettu kokonaan englanniksi. Taas dokumentointi (ei javadocci) suomeksi. (Ei aivan koherenttia ehkä...)  
Ja kaikki algoritmien metodit ovat staattisia, ei ole ehkä tavallista java-projektille, mutta koska (algoritmien) luokkia käytetään vain suorittamaan sen yksittäisen metodin on tämä paras toteutus.  
  
  
**introsortista** Siinä on koodia mitä en ole itse kirjoittanut: login implementaatio, joka on todella yksinkertainen. (Se käyttää hyväkseen Integer.numberOfLeadingZeros(n):a)
Varmaan on OK käyttää tätä hyväkseen kun kertoo sen ettei ole itse tehnyt näitä itse.

**Tärkeä huomio** Oletuksena lista *to be ordered 7* on pakattu zippiin koonsa takia. Jos haluaa käyttää sitä testauksessa (automaattinen mukaanlukien), niin on se purattava.  
Jos ei ole purattu ja ajaa automaattisen testit ei ohjelma kaadu, se vaan testaa sen tillalla kuutosta. Manuaalisesti jos valitsee sen testtavaksi niin sitten se kaatuisi Null viitteeseen.