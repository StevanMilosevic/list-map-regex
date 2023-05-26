package list;

import java.util.*;

// Klasa Stack je podklasa klase Vector, zato sve metode koje sadrzi klasa Vector, sadrzi i klasa Stack

public class StackDemo {

	public static void main(String[] args) {
		/*
		 * Stack funkcionise kao kao spil karata, postavljamo karte na vrh spila i uzimamo ih sa vrha,
		 * LIFO - Last In First Out order
		 * PUSH() za postavljanje,
		 * POP() za uzimanje sa stacka,
		 * PEEK() za ucitavanje elementa sa vrha steka, ne uklanja ga		 
		 */

		// Moze da se i ne definise genericki tip u stacku
		Stack stack = new Stack();

		stack.push("jedan"); // 1 u stacku, ide skroz dole
		stack.push(2); // 2 u stacku, iznad prvog se nalazi
		stack.push("tri"); // 3 u stacku, skroz na vrhu

		System.out.println(stack); // moze i ovako da se pogleda sta je na stacku

		String tri = (String) stack.pop(); // pop() izbacuje element sa vrha stacka
		int dva = (int) stack.pop(); // potrebna je eksplicitna konverzija elemenata posto je stack genericki
		String jedan = (String) stack.pop();

		System.out.println(tri + " " + dva + " " + jedan);

		// definisemo genericki tip u stacku
		Stack<Integer> stack1 = new Stack<>();

		stack1.push(10);
		stack1.push(11);

		// SIZE() - vraca velicinu stacka
		System.out.println("Velicina stacka je: " + stack1.size());

		int broj1 = stack1.pop(); // nije potrebna eksplicitna konverzija elemenata
		int broj2 = stack1.pop();

		System.out.println(broj1 + " " + broj2);

		// PEEK() - "pogled" na vrh stacka, ne brise element sa njega
		Stack<String> stack2 = new Stack<>();

		stack2.push("prvi");
		stack2.push("drugi");

		String str = stack2.peek();

		System.out.println("Na vrhu stacka se nalazi: " + str);

		// SEARCH() - pretraga unutar stacka, vraca indeks od pronadjenog elementa,
		// ukoliko nema trazenog elementa vraca -1

		int index1 = stack2.search("prvi"); // posto je prvi upisan, ide na kraj stacka (najveci indeks)
		int index2 = stack2.search("drugi");
		int index3 = stack2.search("peti"); // vratice -1

		System.out.println(index1);
		System.out.println(index2);
		System.out.println(index3);

		// iteracije kroz stack:

		System.out.println("Iterator: ");
		Iterator<String> iterator = stack2.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		// elementi stacka su iterirani po redu u kome su "gurani" na stack,
		// a ne po redu po kome su "uzimaju" sa stacka

		System.out.println("\nIteracija uz pomoc FOR petlje: ");
		for (String element : stack2)
			System.out.print(element + " ");

		// mozemo da okrenemo redosled elemenata iz Liste uz pomoc Stacka
		List<String> lista = new ArrayList<>();
		Stack<String> stackGradova = new Stack<>();

		lista.add("Beograd");
		lista.add("Smederevo");
		lista.add("Novi Sad");
		lista.add("Nis");

		System.out.println("\n" + lista);
		// imamo listu gradova, koja prebacujemo u stack, pa nazad u listu
		while (lista.size() > 0)
			stackGradova.push(lista.remove(0));

		while (stackGradova.size() > 0)
			lista.add(stackGradova.pop());

		System.out.println(lista);
	}

}
