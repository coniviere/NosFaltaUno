ackage view;

import java.util.ArrayList;
import java.util.Scanner;

import entity.*;


public class Main {
	
	
	public static void main(String[] args) {
		

		Inicializador init = new Inicializador();
		ArrayList<Barrio> barrios = init.inicializarBarrios();
		
		Boolean cerrarApp = false;
		
		while (!cerrarApp) {
			System.out.println("Seleccione un modo:");
			System.out.println("1. Equipo");
			System.out.println("2. Jugador");
			
			Scanner in = new Scanner(System.in);
			int modo = in.nextInt();
			
			if (modo==1) {
				System.out.println("Ingrese el nombre de su equipo:");
				String nombre = in.nextLine();
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
				System.out.println("Ingrese su posicion:");
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
			
			System.out.println("Desea cerrar la aplicacion?");
			System.out.println("1. Si");
			System.out.println("2. No");
			int cerrar = in.nextInt();
			
			if (cerrar==1) {
				System.out.println("----Cerrando APP----");
				cerrarApp = true;
			}
		}
		
		
	}
