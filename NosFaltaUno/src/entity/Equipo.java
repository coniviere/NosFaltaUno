package entity;


public class Equipo {
	
	public String nombre;
	public int posicionFaltante;
	public String numeroCelular;


	public Equipo(String nombre, int posicionFaltante, String num) {
		this.nombre = nombre;
		this.posicionFaltante = posicionFaltante;
		this.numeroCelular=num;
	}
	
	public int getPosicionFaltante() {
		return this.posicionFaltante;
	}

	public void setPosicionFaltante(int posicionFaltante) {
		this.posicionFaltante = posicionFaltante;
	}
	
	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	
}
