package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> kolekcija = new ArrayList<>();
		
		// add() dodaje elemente 
		kolekcija.add(18);		// 0
		kolekcija.add(321);		// 1
		kolekcija.add(7);		// 2
		kolekcija.add(65);		// 3
		kolekcija.add(334);		// 4
		kolekcija.add(92);		// 5
		kolekcija.add(105);		// 6
		
		// size() vraca broj elemenata u kolekciji
		System.out.println(kolekcija.size());
		
		// contains() proverava da li je zadati element u kolekciji
		boolean sadrzi = kolekcija.contains(66);
		if(sadrzi) 
			System.out.println("Broj 66 je u kolekciji");
		else
			System.out.println("Broj 66 nije u kolekciji");
		
		// get() vraca element sa zadatim indeksom
		System.out.println(kolekcija.get(3));
		
		// indexOf() vraca indeks prve pojave zadatog elementa kolekcije, vraca -1 ukoliko trazeni element ne postoji
		System.out.println("Broj 334 se nalazi na mestu br: " + kolekcija.indexOf(334));
		
		// toArray() prebacuje elemente dinamickog niza u obican niz
		Integer[] niz = new Integer[kolekcija.size()];
		kolekcija.toArray(niz);
		
		// prolazak kroz novoformirani niz
		for(int i : niz)
			System.out.print(i + " ");
		
		// remove() brise element na zadatom mestu
		kolekcija.remove(5);	// brise element na indeksu 5
		System.out.println(kolekcija);
		
		// clear() brise sve iz kolekcije
		kolekcija.clear();
		System.out.println("Broj elemenata u kolekciji je: " + kolekcija.size());
	}
}