package paquete1;

public class Personaje {

	private int vida;
	private int danio;
	
	public Personaje(int vida, int danio) {
		this.vida = vida;
		this.danio = danio;
	}
	
	/**
	 * Método para obtener el daño del personaje
	 * @return
	 */
	public int getDanio() {
		return danio;
	}

	/**
	 * METODO DE QUITAR VIDA
	 * @param danio
	 */
	public void quitarVida(int danio) {
		vida = vida - danio;
	}
	
}
