package entity;

import java.util.ArrayList;

public class Equipo {
	
	public String nombre;
	public int posicionFaltante;
	public String numeroCelular;
	public ArrayList<String> mensajesRecibidos;


	public Equipo(String nombre, int posicionFaltante) {
		this.nombre = nombre;
		this.posicionFaltante = posicionFaltante;
	}
	
	public int getPosicionFaltante() {
		return this.posicionFaltante;
	}

	public void setPosicionFaltante(int posicionFaltante) {
		this.posicionFaltante = posicionFaltante;
	}
	
	public ArrayList<String> getMensajesRecibidos() {
		return this.mensajesRecibidos;
	}

	public void setMensajesRecibidos(ArrayList<String> mensajesRecibidos) {
		this.mensajesRecibidos = mensajesRecibidos;
	}
	
	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	
	public void recibirMensaje(String m) {
		this.mensajesRecibidos.add(m);
	}
	
	public void enviarMensaje(Jugador j) {
		String mensaje = "Hola, nuestro equipo es "+ this.nombre;
		mensaje += "./n Podrías jugar con nosotros./n Nuestro número de contacto es "+ this.numeroCelular;
		j.recibirMensaje(mensaje);
	}

	
}
