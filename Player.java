package tombola_02_02_2022_Google_cloud_Platform_Cours_;
import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.math.*;



public class Player {

	int [] schedina = new int [5];
	int [] scheda = new int [5];
	String appellativo;

	public Player (String appellativo)
		{
		
		// --__ Costruzione delle schedine __--
		
		this.appellativo = appellativo;
		for (int i = 0 ; i < 5 ; i=i+1 )
			{
				schedina[i] = -1;
			} // --__ For Schedina __--
		
		Random sorte = new Random();
		
		for (int i = 0 ; i<5 ; i=i+1) 
			{
				boolean funz;
				// --__ Inizializzo un do per fare un ciclo fino a che non creo la schedina finale __--
				// --__ Poi sotto il do, nel while metteremo la condizione d'uscita __--
				
				do
					{
						// --__ Non posso avere numeri oltre al 90 --__
						int j =sorte.nextInt(90)+1;
						funz = true;
						
						for (int y = 0; y < i && funz ; y = y +1 )
							{
								if (funz && (schedina[y] !=j ));
								
								else 
									{
										funz = false;
										
									}
							
							if (funz)
								{
									
									schedina [i] = j;
									scheda [i] = j;
									
								} // --__ Con questo ultimo if si salva la schedina per la fine __--
							
							} // --__ Ciclo For per verificare che la schedina non tenga numeri uguali __--
						
					
					} // --__ Ciclo do 
				
					while 
						(!funz);
						
			} // --__ Ciclo for __--
		
		
		
		
		} // --__ Public Player __--
	
	public boolean controllaCifra (int lung_vettore)
		{
			boolean j = false ;
			for (int i = 0 ; i < 5 && !j; i=i+1)
				{
					if (schedina[i] == lung_vettore)
						{
							j = true;
						} // --__ if __--
					else 
						{
							j = false ;
						} // --__ else __--
					if (j)
						{
							schedina [i] = -1;
						}
					
				} // --__ For __--
			// --__ Con questo ciclo controlliamo che il Player abbia il numero __--
			if (j)
				{
					System.out.println(appellativo + "possiede la cifra: "+lung_vettore);
				}
			// --__ Se il Player ha la cifra la variabile booleana diventa true 
			return j;
			
		} // --__ public boolean controllaCifra __--
	
	public boolean Stombola ()
		{
			boolean j = true ;
			for (int i=0 ; i < 5 ;  i = i+1)
				{
					if ((j)&& (schedina[i] == -1))
						{
							j = true ;
						} // --__ if __--
					else 
						{
							j = false;
						}
				} // --__ Ciclo for 
			return j;
		} // --__ public boolean Stombola __-- 
	// --__ Leggiamo la schedina vincente __--
	// --__ Ciclo for che indichi la schedina vincente __--
	
	public void esamina ()
		{
			for (int i=0; i<5 ; i=i+1)
			{
				System.out.println(scheda[i]);
				System.out.println(" ");
			}// --__ Ciclo for __--
		}// --__ public void esamina __--
	
	

} // --__ public class Player --__
