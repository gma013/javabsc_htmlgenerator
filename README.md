# HTML gener�tor
##### Amiket igyekeztem a megold�sba belevenni:
-	�r�kl�d�s: HtmlElement oszt�ly alapj�n az egyes html elemek (HtmlDiv, HtmlButton, stb)
-	absztrakt met�dus/oszt�ly: toString k�telez� kidolgoz�sa az egyes sz�rmaztatott oszt�lyokban, ez adja vissza az adott elem HTML k�dj�t
-	enum: ez kiss� er�ltetett lett, a gombhoz a lehets�gesen v�laszthat� t�pusokat sorolja fel (reset, submit, button)
-	hibakezel�s: (kis egyszer�, nem teljesk�r�) st�lusokat lehet el�re defini�lni, �s itt ha nem l�tez� sz�nt adunk meg border- vagy textcolor-nak, akkor kiv�telt dob)
-	met�dus t�lterhel�s: p�ld�ul HmlButton elemn�l lehet t�bbf�le param�terlist�val l�trehozni az elemet
-	unitteszt: p�r html elem gener�lt k�dj�t ellen�rzi

##### P�r plusz, ami nem volt benne a feladatban:
-	st�lusok el�re defini�l�sa (nem �pp css, de p�r alap form�z�st meg lehet vele csin�lni)
-	param�terezhet�, hogy form�zott vagy ��mlesztett� html k�dot gener�ljon v�g�l
-	script blokk hozz�ad�si lehet�s�g, �gy p�ld�ul egyes html elemek onClick-j�ben k�l�nb�z� javascript f�ggv�nyek h�vhat�k (a p�ld�ban enableButton/disableButton)