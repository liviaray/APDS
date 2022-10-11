package Dominio;

public class Hello {
	private boolean ok;
	
	public void oi () {
		ok = true;
	}
	
	public void Falar() {
		if (ok) {
			System.out.println("Hello Word!!");
		} else {
			System.out.println("NOT hello word!");
		}
	}
	              	
}