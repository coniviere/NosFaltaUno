package entity;

import java.util.ArrayList;

public class Barrio {
	
	public String nombre;
	public ArrayList<Equipo> equipos = new ArrayList<>();
	public ArrayList<Jugador> jugadores = new ArrayList<>();
	
	public Barrio(String nombre) {
		this.nombre = nombre;
	}
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void addJugador(Jugador j) {
		this.jugadores.add(j);
	}
	
	public void addEquipo(Equipo e) {
		this.equipos.add(e);
	}


}
