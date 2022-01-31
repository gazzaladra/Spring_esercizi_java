package dado;

import java.util.Scanner;

public class DadoTesting {

	public static void main(String[] args) {
		Scanner input2 = new Scanner(System.in);
		System.out.print("Inserisci qunate volte tirare il dado: ");
		int ripeti = input2.nextInt();
		Scanner input1 = new Scanner(System.in);
		System.out.print("Inserisci il numero delle facce: ");
		int sei = input1.nextInt();

		Dado r = new Dado(sei, ripeti);

		r.stampa();
		r.ripeti();

	}// main

}// class
