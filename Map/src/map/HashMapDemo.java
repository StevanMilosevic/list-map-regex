package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	
    public static void main(String[] args) {
        // pravimo HashMap
        Map<String, Integer> cenovnik = new HashMap<>();

        // Klasa HashMap cuva podatke u hash tabeli, zbog toga je vreme izvršavanja metoda isto bez obzira na veličinu mape.
        // Takođe heš-mapa ne garantuje određeni redosled učitavanja, tj redosled kojim su elementi dodavani
        // u mapu ne moraju da se poklapaju sa redosledom kojim će ih iterator čitati

        // stavljamo elemente u mapu
        cenovnik.put("Espreso", 200);
        cenovnik.put("Turska kafa", 150);
        cenovnik.put("Koka kola", 220);
        cenovnik.put("Sladoled", 300);
        cenovnik.put("Kisela voda", 160);
        cenovnik.put("Torta", 320);

        // HashMap ima dete klasu - LinkedHashMap koja nasledjuje skoro sve njene osobine
        // Ali sa druge strane LinkedHashMap omogucava da se zadrzi isti redosled elemenata kako su upisivani u mapu
        // Nothing comes for free - ovo povecava upotrebu memorije

        // smanjujemo cenu sladoleda za 100
        int cena = cenovnik.get("Sladoled");
        cenovnik.put("Sladoled", cena - 100);   // metoda put() menja vrednost po zadatom kljucu

        System.out.println("Nova cena za sladoled: " + cenovnik.get("Sladoled"));

        // get() - vraca value po zadatom kljucu
        System.out.println(cenovnik.get("Espreso"));

        // mozemo ovako da vidimo koji su sve elementi u mapi
        System.out.println(cenovnik);

        // pravimo drugu mapu i u nju stavljamo sve elemente iz prve
        Map<String, Integer> cenovnik1 = new HashMap<>();
        cenovnik1.putAll(cenovnik); // putAll() kopira sve elemente u drugu mapu
        System.out.println(cenovnik1);

        // size() - velicina mape
        System.out.println("Broj elemenata u mapi je: " + cenovnik.size());

        // provera da li je mapa prazna
        System.out.println(cenovnik.isEmpty());
        System.out.println(cenovnik.size() == 0);   // moze i ovako

        // containsKey() / containsValue()- provera da li mapa sadrzi odredjeni kljuc / vrednost
        System.out.println(cenovnik.containsKey("Sladoled"));
        System.out.println(cenovnik.containsValue(200));

        // remove() - brise jedan element iz mape
        cenovnik1.remove("Torta");
        System.out.println(cenovnik1);

        // clear() - brisanje svih elemenata iz mape
        cenovnik1.clear();
        System.out.println(cenovnik1);

        // replace(key, value) - menja value, vraca stari value elementa kao rezultat
        int staraCena = cenovnik.replace("Espreso", 500);
        System.out.println("Stara cena za espreso: " + staraCena);
        System.out.println("Nova cena za espreso: " + cenovnik.get("Espreso"));

        // Iterator, prolaz kroz mapu preko kljuceva, uz pomoc keySet()
        Iterator<String> iterator = cenovnik.keySet().iterator();
        while(iterator.hasNext()){
            String kljuc = iterator.next();                 // prolazi kroz kljuceve
            System.out.print(kljuc + " ");
            System.out.println(cenovnik.get(kljuc));        // ovako izvlacimo i vrednosti
        }

        // for-each, potreban keySet() za prolazak kroz kljuceve
        for(String key : cenovnik.keySet()){
            System.out.println(key + " - " + cenovnik.get(key));
        }

    }
}
