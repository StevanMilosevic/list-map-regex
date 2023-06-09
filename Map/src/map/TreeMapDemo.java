package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

// TreeMap za smestanje podataka koristi hijerarhijsko stablo, elementi su razvrstani
// u obliku stabla prema rastucem redosledu kljuceva bez obzira kojom redosledom smo ih unosili

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        // put()
        map.put(1, "Danska");
        map.put(62, "Mongolija");
        map.put(23, "Sudan");
        map.put(91, "Srbija");
        map.put(238, "Kanada");
        map.put(7, "Iran");

        // TreeMap cuva elemente poredjane po key vrednosti, kada se iterira kroz mapu dobija se uvek isti redosled
        // za razliku od HashMap koja se ne ponasa tako
        for(Integer i : map.keySet())
            System.out.println(i + " : " + map.get(i));

        // ostale metode su manje vise identicne kao i kod HashMap

        // get() - vraca value po zadatom kljucu
        System.out.println(map.get(7));

        // mozemo ovako da vidimo koji su sve elementi u mapi
        System.out.println(map);

        // pravimo drugu mapu i u nju stavljamo sve elemente iz prve
        Map<Integer, String> map1 = new HashMap<>();
        map1.putAll(map); // putAll() kopira sve elemente u drugu mapu
        System.out.println(map1);

        // size() - velicina mape
        System.out.println("Broj elemenata u mapi je: " + map.size());

        // provera da li je mapa prazna
        System.out.println(map.isEmpty());
        System.out.println(map.size() == 0);   // moze i ovako

        // containsKey() / containsValue()- provera da li mapa sadrzi odredjeni kljuc / vrednost
        System.out.println(map.containsKey(91));
        System.out.println(map.containsValue("Mongolija"));

        // remove() - brise jedan element iz mape
        map1.remove(23);
        System.out.println(map1);

        // clear() - brisanje svih elemenata iz mape
        map1.clear();
        System.out.println(map1);

        // replace(key, value) - menja value, vraca stari value elementa kao rezultat
        String staraDrzava = map.replace(7, "Egipat");
        System.out.println("Stara drzava: " + staraDrzava);
        System.out.println("Nova drzava: " + map.get(7));

        // Iterator, prolaz kroz mapu preko kljuceva, uz pomoc keySet()
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Integer kljuc = iterator.next();                 // prolazi kroz kljuceve
            System.out.print(kljuc + " ");
            System.out.println(map.get(kljuc));             // ovako izvlacimo i vrednosti
        }

        // for-each, potreban keySet() za prolazak kroz kljuceve
        for(Integer key : map.keySet()){
            System.out.println(key + " - " + map.get(key));
        }
    }
}
