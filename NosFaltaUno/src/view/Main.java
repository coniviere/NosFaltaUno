package view;

import java.util.ArrayList;
import java.util.Scanner;

import entity.*;


public class Main {
	
	
	public static void main(String[] args) {
		
		ArrayList<Barrio> barrios = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
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
		
		System.out.println("Seleccione un modo:");
		System.out.println("1. Equipo");
		System.out.println("2. Jugador");
		int modo = in.nextInt();
		
		if (modo==1) {
			System.out.println("Ingrese el nombre de su equipo:");
			String nombre = in.next();
			System.out.println("Ingrese el numero de posicion faltante:");
			int pos = in.nextInt();
			Equipo e = new Equipo(nombre, pos);
			
			System.out.println("Seleccione un barrio:");
			for (Barrio b: barrios) {
				int indice = barrios.indexOf(b)+1;
				System.out.println(indice+"."+b.nombre);
			}
			int numeroSeleccionado = in.nextInt();
			Barrio barrioSeleccionado = barrios.get(numeroSeleccionado-1);
			
			Buscador buscador = new Buscador(barrioSeleccionado, e.getPosicionFaltante());
			ArrayList<Jugador> jugadoresEncontrados = buscador.buscarJugador();
			
			System.out.println("Jugadores encontrados...");
			for (Jugador j: jugadoresEncontrados) {
				int indice = jugadoresEncontrados.indexOf(j)+1;
				System.out.println(indice+"."+j.nombre);
			}
			
		} else {
			System.out.println("Ingrese su nombre:");
			String nombre = in.next();
			System.out.println("Ingrese su posición:");
			int pos = in.nextInt();
			Jugador j = new Jugador(nombre, pos);
			
			System.out.println("Seleccione un barrio:");
			for (Barrio b: barrios) {
				int indice = barrios.indexOf(b)+1;
				System.out.println(indice+"."+b.nombre);
			}
			int numeroSeleccionado = in.nextInt();
			Barrio barrioSeleccionado = barrios.get(numeroSeleccionado-1);
			
			Buscador buscador = new Buscador(barrioSeleccionado, j.getPosicion());
			ArrayList<Equipo> equiposEncontrados = buscador.buscarEquipo();
			
			System.out.println("Equipos encontrados...");
			for (Equipo e: equiposEncontrados) {
				int indice = equiposEncontrados.indexOf(e)+1;
				System.out.println(indice+"."+e.nombre);
			}
			
		}
		
		
	}
	
	
}

