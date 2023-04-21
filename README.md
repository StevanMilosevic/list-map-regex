# Collections Framework

Javin podsistem za rad sa kolekcijama standardizuje nacin na koji programi rade sa grupom objekata, sto znaci da su kolekcije strukture podataka u kojima se cuvaju srodni objekti, ne vrednosti.
Kolekcije mogu skladistiti samo reference, ne mogu skladistiti vrednosti primitivnih tipova (da bi to bilo moguce potrebno ih je smestiti u omotacku wrapper klasu). 

Interfejs <b>Collection</b> se nalazi na vrhu piramide <b>Collections Framework</b> posto ga mora implementirati svaka klasa koja definise kolekciju. On nasledjuje interfejs <b>Iterable</b> sto znaci da se elementima svake kolekcije moze pristupiti pomocu <b>for-each</b> petlje.
Definise osnovne metode koje ce imati svaka kolekcija.

<b>Interfejs List</b><br>
List prosiruje interfejs Collection, elementi se u listu mogu umetati ili dodavati, može im se pristupiti preko njihovog mesta na listi, vrednost indeksa počinje od nule. Lista može da sadrži duplirane elemente.<br>
Pored metoda definisanih u Colllections interfejsu, List definiše sopstvene metode ali i menja semantiku postojećim metodama iz Collection:
<b>add()</b> - umeće objekat na zadato mesto <br>
<b>get()</b> - vraća objekat sa zadatog mesta<br>
<b>indexOf()</b> - vraća indeks prve instance objekta na listi, ukoliko traženi element ne postoji vraća vrednost -1<br>
<b>listIterator()</b> - vraća iterator na početak pozivajuće liste<br>
<b>remove()</b> - uklanja sa liste element sa položaja <i>index</i><br>
<b>set()</b> - dodaje objekat na položaj <i>index</i><br>

<b>Klase za rad sa kolekcijama</b><br>
<b>klasa ArrayList</b><br>
Interfejs List implementira i proširuje klasa <b>ArrayList</b>, ona podržava dinamičke nizove koji po potrebi mogu da rastu, tj ova klasa predstavlja niz promenljive dužine koji sadrži reference na objekte.
Detaljnije o tome šta sve ova klasa može pogledati u komentarima <i>ArrayListDemo</i>

<b>klasa LinkedList</b><br>
Ona pored interfejsa List, implementira i interfejse <b>Deque</b> i <b>Queue</b> što omogućava izradu povezane liste. To znači da je LinkedLista u osnovi niz parova (element, pokazivač) pri čemu pokazivač sadrži adresu narednog para.<br>
Detaljnije o tome šta sve ova klasa može pogledati u komentarima <i>LinkedListDemo</i>

<b>klasa Vector</b><br>
Ova klasa je starija od Collections Frameworka, kasnije će njegovim uvođenjem i klasa Vector da se preradi kako bi bila u potpunosti kompatibilna sa kolekcijama (nasleđuje interfejse Iterable i List) - odatle potiče mala razlika u definisanim metodama u odnosu na ostale klase koje implementiraju List. Ona ima nekoliko konstruktora, koji će uvek da zadaju određeni početni kapacitet niza. Pa tako konstruktor:<br>
<i>Vector()</i> - pravi podrazumevani vektor početne veličine 10.<br>
<i>Vector(int veličina)</i> - pravi vektor sa zadatim početnim kapacitetom.<br>
<i>Vector(int veličina, int priraštaj)</i> - zadaje se početni kapacitet, koji se povećava u koracima koju su zadati parametrom <i>priraštaj</i><br>
Vector definiše i zaštićene promenljive:<br>
int <i>elementCount</i> - broj elemenata vektora<br>
int <i>capacityIncrement</i> - vrednost priraštaja<br> 
int <i>Object[] elementData</i> - niz koji sadrži elemente vektora<br>
Detaljnije o tome šta sve ova klasa može pogledati u komentarima <i>VectorDemo</i>

# Map

Mapa predstavlja objekat u kome se čuvaju parovi <i>ključ/vrednost</i>. Kada imamo ključ, pomoću mape možemo da saznamo vrednost koja mu odgovara. I ključ i vrednost su objekti. Ključ mora da bude jedinstven, ali se vrednosti mogu ponavljati.

Rad sa mapama se svodi na dve glavne metode:
<b>get(Object ključ)</b> - vraća vrednost koja odgovara ključu zadatom u parametru, ako ga ne pronađe vraća null
<b>put(K ključ, V vrednost)</b> - unosi novu stavku u mapu, pri čemu nova vrednost zamenjuje staru koja odgovara postojećem ključu. Ako zadati ključ ne postoji, metoda vraća null. Ako ključ postoji, vraća prethodnu vrednost koja je sa njim povezana.

<b>Klase za rad sa mapama</b><br><br>
<b>Klasa HashMap</b><br>
ona podatke čuva u hash tabeli, zbog toga je vreme izvršavanja metoda isto bez obzira na veličinu mape. Takođe heš-mapa ne garantuje određeni redosled učitavanja, tj redosled kojim su elementi dodavani u mapu ne moraju da se poklapaju sa redosledom kojim će ih iterator čitati.
Mapa predstavlja objekat u kome se čuvaju parovi <i>ključ/vrednost</i>. Kada imamo ključ, pomoću mape možemo da saznamo vrednost koja mu odgovara. I ključ i vrednost su objekti. Ključ mora da bude jedinstven, ali se vrednosti mogu ponavljati.
Detaljnije o tome šta sve ova klasa može pogledati u komentarima <i>HashMapDemo</i>.

<b>TreeMap</b><br>
TreeMap za smestanje podataka koristi hijerarhijsko stablo, elementi su razvrstani u obliku stabla prema rastucem redosledu kljuceva bez obzira kojom redosledom smo ih unosili.
Detaljnije o tome šta sve ova klasa može pogledati u komentarima <i>TreeMapDemo</i>.

# Regex

Regularni izraz je grupa znakova koja opisuje odredjenu znakovnu sekvencu, on se jos zove sablon ili uzorak (pattern) i moze se iskoristiti za pronalazenje datog sablona u drugim znakovnim sekvencama. 
Regularni izrazi mogu da sadrze dzokerske znake, skupove znakova i razne kvantifikatore.
Postoje dve klase koje podrzavaju obradu regularnih izraza: Pattern i Matcher
Klasa <b>Pattern</b> omogucava definisanje regularnog izraza ili sablona, a onda tako definisani sablon poredimo sa drugim sekvencama pomocu objekta tipa <b>Matcher</b>.
Detaljnije o tome šta se sve može uraditi sa regularnim izrazima pogledati u komentarima <i>RegularniIzrazi</i>


