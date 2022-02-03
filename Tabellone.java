package tombola_02_02_2022_Google_cloud_Platform_Cours_;

import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Tabellone {
	
	Random sorte;
	boolean[]cifreEstratte;
	
	// --__ Collegamento __--
	public Tabellone()
	{
		sorte = new Random();
		cifreEstratte = new boolean[90];
		
	} // --__ public Tabellone __--
	public int estraiCifra()
		{
			boolean tirato = false;
			int cifra = 0;
			do
				{
					cifra = sorte.nextInt(90);
						if ( ! cifreEstratte [cifra])
							{
								cifreEstratte[cifra] = true;
								tirato = true;
							} // --__ if __--
					
				} // --__ fine Do __--
			while(!tirato);
		return cifra +1;		
		} // --__ public int estraicifra __--

} // --__ public class tabellone __--
