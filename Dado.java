package dado;

public class Dado {

	private int sei;
	private int ripeti;
	
	
	public Dado(int sei, int ripeti) {
		this.sei=sei;
		this.ripeti=ripeti;
	}
	
	public Dado() {
		sei =0;
		ripeti=0;
	}
	

	public int getsei() {
		return sei;
	}
	public void setsei(int sei) {
		this.sei = sei;
	}
	
	public int getripeti() {
		return ripeti;
	}
	
	public void setripeti (int ripeti) {
		this.ripeti = ripeti;
	}
	
	public void stampa () {
		
		int dadoG = (int) (Math.random()*sei)+1;
		System.out.println ("Numero uscito dal dado: "+ dadoG);
	}
	
	public void ripeti () {
		
		for (int i=1; i<ripeti; i++) {
			int dadoG = (int) (Math.random()*sei)+1;
			System.out.println ("Numero uscito dal dado: "+ dadoG);
		}
	}
}	
