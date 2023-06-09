package list;

import java.util.*;

// LinkedLista je u osnovi niz parova (element, pokazivač) pri čemu pokazivač sadrži adresu narednog para

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> kolekcija = new LinkedList<>();
		
		// add() dodaje elemente u listu
		kolekcija.add("Mile");	// 0
		kolekcija.add("Pera");	// 1
		kolekcija.add("Zika");	// 2
		kolekcija.add("Mika");	// 3
		kolekcija.add("Ana");	// 4
		kolekcija.add("Bane");	// 5
		kolekcija.add("Aca");	// 6
		
		// moze i ovako da se ubaci nov element u kolekciju
		kolekcija.add(7, "Jana");	// na indeks 7, ubacujemo novo ime
		
		// prolaz kroz kolekciju uz pomoc Iteratora
		Iterator<String> iterator = kolekcija.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		// set() postavlja element na zadati indeks, prethodno upisani element se brise
		kolekcija.set(3, "Dragan"); 	// pregazice Miku
		System.out.println("\n" + kolekcija);
		
		// ispitivanje i dodavanje/brisanje imena u kolekciji
		String ime = "Una";
		boolean provera = kolekcija.contains(ime);
		if(provera)
			kolekcija.remove(ime);
		else
			kolekcija.add(ime);
		
		// remove() brise element iz kolekcije, bilo preko indeksa ili preko vrednosti
		kolekcija.remove(0);		// brise element na indeksu 0
		kolekcija.remove("Bane");	// brise ime Bane
		
		// ListIterator - jos jedan nacin prolaska kroz kolekciju
		ListIterator iter = kolekcija.listIterator();
		while(iter.hasNext()) 
			System.out.print(iter.next() + " ");
		System.out.println();
		
		// ListIterator moze da vrti elemente kolekcije i u nazad
		while(iter.hasPrevious())
			System.out.print(iter.previous() + " ");
	
		

	}

}
