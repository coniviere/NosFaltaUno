package view;

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
				String nombre = in.next();
				System.out.println("Ingrese el numero de posicion faltante:");
				int pos = in.nextInt();
				System.out.println("Ingrese su numero de contacto:");
				String num = in.next();
				Equipo e = new Equipo(nombre, pos, num);
				
				System.out.println("Seleccione un barrio:");
				for (Barrio b: barrios) {
					int indice = barrios.indexOf(b)+1;
					System.out.println(indice+"."+b.nombre);
				}
				int numeroSeleccionado = in.nextInt();
				Barrio barrioSeleccionado = barrios.get(numeroSeleccionado-1);
				barrioSeleccionado.addEquipo(e);
				
				Buscador buscador = new Buscador(barrioSeleccionado, e.getPosicionFaltante());
				ArrayList<Jugador> jugadoresEncontrados = buscador.buscarJugador();
				
				if (jugadoresEncontrados.size()>0) {
					System.out.println("Jugadores encontrados...");
					for (Jugador j: jugadoresEncontrados) {
						int indice = jugadoresEncontrados.indexOf(j)+1;
						System.out.println(indice+"."+j.nombre+" ---------> "+j.numeroCelular);
					}
				} else {
					System.out.println("No se han encontrado jugadores en la zona :(");
				}
				
				
			} else {
				System.out.println("Ingrese su nombre:");
				String nombre = in.next();
				System.out.println("Ingrese su posicion:");
				int pos = in.nextInt();
				System.out.println("Ingrese su numero de contacto:");
				String num = in.next();
				System.out.println("Seleccione un barrio:");
				Jugador j = new Jugador(nombre, pos, num);
				
				for (Barrio b: barrios) {
					int indice = barrios.indexOf(b)+1;
					System.out.println(indice+"."+b.nombre);
				}
				int numeroSeleccionado = in.nextInt();
				Barrio barrioSeleccionado = barrios.get(numeroSeleccionado-1);
				barrioSeleccionado.addJugador(j);
				
				Buscador buscador = new Buscador(barrioSeleccionado, j.getPosicion());
				ArrayList<Equipo> equiposEncontrados = buscador.buscarEquipo();
				
				if (equiposEncontrados.size()>0) {
					System.out.println("Equipos encontrados...");
					for (Equipo e: equiposEncontrados) {
						int indice = equiposEncontrados.indexOf(e)+1;
						System.out.println(indice+"."+e.nombre+" ---------> "+e.numeroCelular);
					}
				} else {
					System.out.println("No se han encontrado equipos en la zona :(");
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
}
		
	

