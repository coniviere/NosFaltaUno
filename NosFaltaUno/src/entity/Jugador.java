package entity;

import java.util.ArrayList;

public class Jugador {
	
	public int posicion;
	public String nombre;
	public String numeroCelular;
	public ArrayList<String> mensajesRecibidos = new  ArrayList<>();
	
	public Jugador(String nombre, int posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
	}
	
	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public void recibirMensaje(String m) {
		this.mensajesRecibidos.add(m);
	}
	
	public void enviarMensaje(Equipo e) {
		String mensaje = "Hola, mi nombre es "+ this.nombre;
		mensaje += "./n Podría jugar con ustedes./n Mi celular es "+ this.numeroCelular;
		e.recibirMensaje(mensaje);
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

}
