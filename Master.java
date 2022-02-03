package tombola_02_02_2022_Google_cloud_Platform_Cours_;



// --__ Importiamo un pò di funzioni in caso potessero servirci più tardi --__

import java.io.*;
import java.math.*;
import java.util.Scanner;
// --__ Import per levare l'errore InputtStremReader cannot be resolved to a type --__
import java.io.File;
import java.util.Timer;

//import java.io.Reader.read(...);
//import java.io.Read.close();
	

public class Master { // --__ Classe __-- --__ Public class Master --__

	public static void main(String[] args) throws IOException { // --__ Static void main public static void --__
																// main __--

		/*
		 * --__ Stampiamo per iniziare bene un grande messaggio abbastanza --__ --__
		 * centrale per introdurre il gioco --__
		 */
		System.out.println("+++++++++++++++++++++++   GIOCO DELLA TOMBOLA   +++++++++++++++++++++++");

		BufferedReader insert_nome = new BufferedReader(new InputStremReader(System.in)); // BufferedReader insert_nome
																							// = new BufferedReader(new
																							// InsertStremReader(System.in));

		// --__ Ora chiediamo quante persone desiderano giocare --__

		System.out.println("Benvenut*, prego scrivere il numero dei giocatori con caratteri numeri grazie: ");

		/*
		 * --__ Inizializziamo la variabile che ci terrà il conteggio del numero dei
		 * --__ --__giocatori in base alla scelta dell'utente --__
		 */

		int lung_vettore;
		lung_vettore = 0;

		/*
		 * --__ Ora dato che l'utente potrebbe inserire dei valori coi quali si --__
		 * --__ potrebbero creare degli errori nella nostra variabile gestiremo --__
		 * --__ l'inserimento usando il metodo del try and catch (come scriveremo --__
		 * --__ qui sotto) --__
		 */
		try {
			lung_vettore = Integer.parseInt(insert_nome.readLine());
		} // --__ Try --__

		catch (IOException t) {
			t.printStackTrace();
		} // --__ Catch --__

		/*
		 * --__ Creiamo un vettore Player di lunghezza lung_vettore assegnando --__ --__
		 * un none a ciascuno --__
		 */

		Player[] p = new Player[lung_vettore];
		String appellativo = null;
		int x = 0;
		for (int i = 0; i < lung_vettore; i = i + 1) {

			x = 1 + i;
			System.out.println("Player number:" + x + " inserisci il tuo appellativo, per cortesia");
			Scanner appellativo_in = new Scanner(System.in);
			appellativo = appellativo_in.nextLine();
			appellativo = insert_nome.readLine();
			p[i] = new Player(appellativo); // --__ se metto dentro le () la variabile appellativo me lo segna come __--
											// errore?? !!!!!!(appellativo) --__ effettuando il collegamento il bug si è
											// risolto __--
		} // --__ Ciclo For __--

		// --__ Mostriamo a monitor la schedina di ogni Player

		for (int y = 0; y < lung_vettore; y = y + 1) {

			System.out.println("La schedina del Player: " + p[y].appellativo + " è:");
			p[y].esamina();

		} // --__ Ciclo For Stampa delle schedine dei Player

		Tabellone tabellone = new Tabellone();
		System.out.println("+++++++++++  ESTRAZIONE  ++++++++++++");

		// --__ Creiamo un vettore per permettere a più persone di giocare alla tombola
		// assieme

		int[] w = new int[lung_vettore];
		int q = 0;
		boolean h;
		boolean j = h = false;

		// --__ Funzionamento logico della tombola __--
		// --__ IL ciclo while gestisce l'estrazione della tombola __--
		// --__ Il ciclo while controlla se un giocatore fa tombola e gliela assegna
		// --__ tramite __--
		// --__ apposito contatore, gestiamo il ciclo while e la condizione if delle
		// --__
		// --__ variabili booleane __--

		while (h == false) {
			// --__ L'estrazione di un numero __--

			int cifra;
			// --__ Da qui si estrae una cifra
			cifra = tabellone.estraiCifra();
			System.out.println("La cifra estratta è: " + cifra);
			for (int i = 0; i < lung_vettore; i = i + 1) {
				// --__ Controlliamo il numero nella schedina __--
				p[i].controllaCifra(cifra);
				j = p[i].Stombola();
				// --__ Controlliamo se c'è tombola e la aggiudichiamo al Player __--

				if (j == true) {
					w[q] = i;
					q = q + 1;
					h = true;
					j = false;

				} // --__ Ciclo if __--

			} // --__ Ciclo for __--

		} // --__ While funzionamento tombola __--

		// --__ Ora ci occuperemo della gestione delle vincite __--

		System.out.println("++++++++++++++++++++__________          VITTORIE          __________++++++++++++++++++++");

		// --__ Verifichiamo chi ha fatto tombola e quanti Player l'hanno fatta __--
		if (q > 1) {
			System.out.println(" Il seguente / i seguenti player/s ha/hanno fatto tombola: ");

		} // --__ Condizione if __--

		for (int i = 0; i < q; i = i + 1) {
			if (q == 1) {
				System.out.println(p[w[i]].appellativo + " Ha fatto tombola ");
				System.out.println("La schedina vincente è: ");

			} // --__ Ciclo if __--

			else {
				System.out.println("Else 149" + p[w[i]].appellativo);
			} // --__ Else __--

			p[w[i]].esamina();

		} // --__ Ciclo for __--

		insert_nome.close();

	}// --__ static void main __-- --__ public static void main __--

} // --__ Classe __-- --__ public class Master --__

