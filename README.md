# HTML generátor
##### Amiket igyekeztem a megoldásba belevenni:
-	öröklõdés: HtmlElement osztály alapján az egyes html elemek (HtmlDiv, HtmlButton, stb)
-	absztrakt metódus/osztály: toString kötelezõ kidolgozása az egyes származtatott osztályokban, ez adja vissza az adott elem HTML kódját
-	enum: ez kissé erõltetett lett, a gombhoz a lehetségesen választható típusokat sorolja fel (reset, submit, button)
-	hibakezelés: (kis egyszerû, nem teljeskörû) stílusokat lehet elõre definiálni, és itt ha nem létezõ színt adunk meg border- vagy textcolor-nak, akkor kivételt dob)
-	metódus túlterhelés: például HmlButton elemnél lehet többféle paraméterlistával létrehozni az elemet
-	unitteszt: pár html elem generált kódját ellenõrzi

##### Pár plusz, ami nem volt benne a feladatban:
-	stílusok elõre definiálása (nem épp css, de pár alap formázást meg lehet vele csinálni)
-	paraméterezhetõ, hogy formázott vagy „ömlesztett” html kódot generáljon végül
-	script blokk hozzáadási lehetõség, így például egyes html elemek onClick-jében különbözõ javascript függvények hívhatók (a példában enableButton/disableButton)