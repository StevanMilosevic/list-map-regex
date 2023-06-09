package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Regex je Javin paket za regularne izraze koji omogucava pronalazenje sablona

public class RegularniIzrazi {
	public static void main(String[] args) {
		// Pattern klasa nema konstruktor, nego se sablon pravi preko metode compile()
		Pattern pattern = Pattern.compile("w{3}");

		// objekat tipa Pattern koristimo za izradu objekta tipa Matcher, 
		// uz pomoc metode matcher() tu ide ono sto ispitujemo sa nasim patternom
		
		Matcher matcher = pattern.matcher("www.neki-sajt.com");

		/*
		 * kompletan spisak regex paterna je na:
		 * https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html 
		 * ispod su izlistani neki od onih koji se najcesce koriste
		 *
		 * [abc] -> a, b ili c 
		 * [a-z] -> pronalazi jedan karakter od A do Z 
		 * a | b -> Matchuje A ili B 
		 * \d -> Digit: [0-9] 
		 * \w -> Word: [a-zA-Z_0-9] 
		 * . -> bilo koji karakter 
		 * a{3} -> Tacno 3 A: aaa 
		 * a{3,} -> 3 ili vise A 
		 * a{2,4} -> izmedju 2 i 4 A: aa, aaa ili aaaa 
		 * ^ -> pocetak linije 
		 * $ -> kraj linije 
		 * * -> matchuje 0 ili vise ponavljanja 
		 * + -> matchuje jedan ili vise ponavljanja 
		 * ? -> matchuje 0 ili jedno ponavljanje
		 */

		boolean pronadjen = matcher.find();
		System.out.println(pronadjen);

		// compile() - sastavlja dati regularni izraz i vraca instancu Patterna
		Pattern p1 = Pattern.compile("[a-z]+"); 	// ako izostavimo + izdvojice slovo po slovo, ne rec po rec
		Pattern p2 = Pattern.compile("[A-Z]+"); 	// izdvojice samo velika slova
		Pattern p3 = Pattern.compile("[a-zA-Z]+"); // izdvojice i velika i mala slova
		Matcher m1 = p1.matcher("Svakog Dana u Svakom Pogledu Sve Vise i Vise Napredujem");

		while (m1.find()) {
			System.out.print(m1.group() + " "); // group() vraca uhvacenu matchovanu sekvencu u obliku Stringa
		}
		System.out.println();

		// .(tacka)
		Pattern p4 = Pattern.compile(".a"); // trazi 2 slova i na drugom mestu je A
		Matcher m2 = p4.matcher("Ja");
		Matcher m3 = p4.matcher("Jasno");

		// RAZLIKA IZMEDJU find() i matches()
		// find() pretrazuje da li se regularni izraz bilo kako poklapa
		// matches() gleda ceo tekst za poklapanje

		System.out.println(m2.find() + " - " + m3.find()); 			// true - true
		System.out.println(m2.matches() + " - " + m3.matches()); 	// true - false

		// sledeci patern pronalazi sva imena koja pocinju sa "Mil" i pretvara ih u "Pera"
		String imena = "Dragan Milan Milica Milena Jovan Stevan Milivoje Milorad Bane";
		Pattern p9 = Pattern.compile("Mil.*? ");
		Matcher m9 = p9.matcher(imena);
		System.out.println(imena);
		imena = m9.replaceAll("Pera ");
		System.out.println(imena);
	}
}
