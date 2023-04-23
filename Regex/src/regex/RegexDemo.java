package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// prost program u koji se ubacuju paterni i zatim ispisuju recenice u kojima se ispituje da li se nesto poklapa 

public class RegexDemo {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("Unesite regularni izraz: ");
			Pattern pattern = Pattern.compile(input.nextLine());
			
			System.out.println("Unesite tekst za ispitivanje: ");
			Matcher matcher = pattern.matcher(input.nextLine());
			
			boolean pogodak = false;
			while (matcher.find()) {
				System.out.println("Pronadjen patern \"" + matcher.group() + "\" koji pocinje na indeksu " + matcher.start()
						+ " i zavrsava se na indeksu " + matcher.end());
				pogodak = true;
			}
			if (!pogodak) {
				System.out.println("Nije pronadjen match");
			
			}
		}
	}

}
