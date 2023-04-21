package list;

import java.util.Vector;

/* klasa Vector

Ova klasa je starija od Collections Frameworka, kasnije će njegovim uvođenjem i klasa Vector da se preradi
kako bi bila u potpunosti kompatibilna sa kolekcijama (nasleđuje interfejse Iterable i List) - odatle potiče
mala razlika u definisanim metodama u odnosu na ostale klase koje implementiraju List. */

public class VectorDemo {
	
    public static void main(String[] args) {

        /* Ona ima nekoliko konstruktora, koji će uvek da zadaju određeni početni kapacitet niza.
            Pa tako konstruktor:
            Vector() - pravi podrazumevani vektor početne veličine 10.
            Vector(int veličina) - pravi vektor sa zadatim početnim kapacitetom.
            Vector(int veličina, int priraštaj) - zadaje se početni kapacitet, koji se povećava u koracima koju su zadati
            parametrom priraštaj */


        // pocetna vrednost 5, prirastaj je 3
        Vector<String> drzave = new Vector<>(5, 3);
        /* Vector definiše i zaštićene promenljive:
            int elementCount - broj elemenata vektora
            int capacityIncrement - vrednost priraštaja
            int Object[] elementData - niz koji sadrži elemente vektora */

        /* neke metode karakteristicne za klasu Vector */
        System.out.println("Pocetna velicina vektora je: " + drzave.size());
        System.out.println("Pocetni kapacitet vektora je: " + drzave.capacity());

        // addElement() umesto add()
        drzave.addElement("Norveska");
        drzave.addElement("Kanada");
        drzave.addElement("Novi Zeland");
        drzave.addElement("Japan");
        drzave.addElement("Argentina");
        drzave.addElement("Poljska");

        // kapacitet kolekcije smo postavili na 5, unosom 6og elementa kapacitet je povecan za vrednost capacityIncrement
        System.out.println("Nakon 6 ubacenih elemenata, kapacitet vektora je: " + drzave.capacity());

        // prvi element u kolekciji
        System.out.println("Prva drzava na spisku je: " + drzave.firstElement());

        // poslednji element u kolekciji
        System.out.println("Poslednja drzava na spisku je: " + drzave.lastElement());

        // ispitivanje da li kolekcija sadrzi neku konkretnu drzavu
        if(drzave.contains("Japan"))
            System.out.println("Na spisku drzava se nalazi Japan");

        // ispis kolekcije
        System.out.print("Spisak drzava: ");
        for(String s : drzave)
            System.out.print(s + " ");
    }
}
