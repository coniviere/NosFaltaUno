package entity;


public class Jugador {
	
	public int posicion;
	public String nombre;
	public String numeroCelular;
	
	public Jugador(String nombre, int posicion, String num) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.numeroCelular=num;
	}
	
	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

}
