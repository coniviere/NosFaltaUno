package entity;

import java.util.ArrayList;

public class Buscador {
	public Barrio barrio;
	public int posicion;
	
	public Buscador(Barrio b, int pos) {
		this.barrio = b;
		this.posicion = pos;
	}
	
	public ArrayList<Jugador> buscarJugador() {
		ArrayList<Jugador> jugadoresEncontrados = new ArrayList<>();
		for (Jugador j: barrio.getJugadores()) {
			if (j.getPosicion()==posicion) {
				jugadoresEncontrados.add(j);
			}
		}
		return jugadoresEncontrados;
	}
	
	public ArrayList<Equipo> buscarEquipo() {
		ArrayList<Equipo> equiposEncontrados = new ArrayList<>();
		for (Equipo e: barrio.getEquipos()) {
			if (e.getPosicionFaltante()==posicion) {
				equiposEncontrados.add(e);
			}
		}
		return equiposEncontrados;
	}

}
