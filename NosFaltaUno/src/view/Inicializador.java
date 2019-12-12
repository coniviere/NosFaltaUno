package view;

import java.util.ArrayList;


import entity.Barrio;
import entity.Equipo;
import entity.Jugador;

public class Inicializador {

	public Inicializador() {
		
	}
	
	public ArrayList<Barrio> inicializarBarrios() {
		ArrayList<Barrio> barrios = new ArrayList<>();
		
		Barrio olivos = new Barrio("Olivos");
		Barrio pilar = new Barrio("Pilar");
		Barrio sanfer = new Barrio("San Fernando");
		Barrio sani = new Barrio("San Isidro");
		
		
		barrios.add(olivos);
		barrios.add(pilar);
		barrios.add(sanfer);
		barrios.add(sani);
		
		Jugador ignacio = new Jugador("Ignacio",9);
		Jugador juan = new Jugador("Juan",5);
		Jugador pedro = new Jugador("Pedro",5);
		Jugador pablo = new Jugador("Pablo",5);
		
		
		pilar.addJugador(ignacio);
		pilar.addJugador(juan);
		sanfer.addJugador(pedro);
		sanfer.addJugador(pablo);
		
		Equipo malaFama = new Equipo("Mala Fama",9);
		Equipo pimienta = new Equipo("Pimienta",5);
		Equipo losLeales = new Equipo("Los leales",5);
		Equipo elPlata = new Equipo("El plata",5);
		
		
		pilar.addEquipo(malaFama);
		pilar.addEquipo(pimienta);
		sanfer.addEquipo(losLeales);
		sanfer.addEquipo(elPlata);
		return barrios;
		
	}

}
