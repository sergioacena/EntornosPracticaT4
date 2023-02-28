package paquete1;

public class Personaje {

	private int vida;
	private int danio;
	
	
	public Personaje(int vida, int danio) {
		this.vida = vida;
		this.danio = danio;
	}
	
	
	
	public int getDanio() {
		return danio;
	}



	public void quitarVida(int danio) {
		vida = vida - danio;
	}
	
	
	
	
}
