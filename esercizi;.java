package esercizi;

import java.util.Scanner;

public class esercizio3 {

	public static void main(String[] args) {
		String parola;
		Scanner temp = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		parola = temp.next();

		String parolafinale;
		StringBuilder rparola = new StringBuilder(parola);

		parolafinale = rparola.reverse().toString();
		System.out.println(parolafinale);

		if (parola.toLowerCase().equals(parolafinale.toLowerCase())) {
			System.out.println("la parola è palindroma");
		} else {
			System.out.println("la parola scritta non è palindroma");
		}

	}

}
