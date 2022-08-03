/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coleccion;

import Herencia.LocalesVideojuegos1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CentroVideojuegos {
    public static void main(String[] args) {

        String opcionMenuPrincipal;
        String opcionMenuInterno;
        ArrayList<Juegos> listaObjetosJuegos = new ArrayList();
        ArrayList<Jugador> listaObjetosJugador = new ArrayList();
        ArrayList<LocalesVideojuegos1> listaObjetosLocalesVideojuegos = new ArrayList();
        do {
          
            System.out.println("- Menu principal -");
            System.out.println("1.- Listado de juegos");
            System.out.println("2.- Listado de Jugador");
            System.out.println("3.- Listado de LocalesVideojuegos");
            System.out.println("4.- Salir");
            Scanner entradaData = new Scanner(System.in);
            System.out.print("Ingrese opción: ");
            opcionMenuPrincipal = entradaData.nextLine();

            if (opcionMenuPrincipal.equals("1")) {
                do {
                    System.out.println("1.- Listar juegos");
                    System.out.println("2.- Ingresar juegos");
                    System.out.println("3.- Buscar juegos");
                    System.out.println("4.- Eliminar juegos");
                    System.out.println("5.- Salir de la opcion");
                    System.out.print("Ingrese opción: ");
                    opcionMenuInterno = entradaData.nextLine();
                    if (opcionMenuInterno.equals("1")) {
                        System.out.println("----------------------------------");
                        System.out.println("Listar juegos");
                        if (listaObjetosJuegos.isEmpty()) {
                            System.out.println("No hay juegos agregados");
                        } else {
                            for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                                Juegos objJuegos = listaObjetosJuegos.get(i);
                                System.out.println("******************");
                                System.out.println("Juegos: " + i);
                                System.out.println("Minecraft: " + objJuegos.getMinecraft());
                                System.out.println("Segasonic: " + objJuegos.getSegasonic());
                                System.out.println("MarioBross: "+ objJuegos.getMariobros());
                            }
                        }
                    }
                     if (opcionMenuInterno.equals("2")) {
                        System.out.println("----------------------------------");
                        String minecraftJuegos;
                        System.out.println("Ingresar al juego de supervivenvia");
                        minecraftJuegos = entradaData.nextLine();
                        String segasonicJuegos;
                        System.out.println("Ingresar al juego de aventura");
                        segasonicJuegos = entradaData.nextLine();
                        String marioBrossJuegos;
                        System.out.println("Ingresar al juego de aventura");
                        marioBrossJuegos = entradaData.nextLine();
                        
                        Juegos objJuegos = new Juegos("Supervivenvia", "Aventura", "Aventura");
                        
                        listaObjetosJuegos.add(objJuegos);
                        System.out.println("Juego escogido");
                    }
                     if (opcionMenuInterno.equals("3")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar Videojuego");
                        System.out.print("Ingrese el tipo de videojuego: ");
                        String minecraftJuegos = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                            Juegos objJuegos = listaObjetosJuegos.get(i);
                            if (minecraftJuegos.equals(objJuegos.getMinecraft())) {
                                
                                System.out.println("******************");
                                System.out.println("Juegos: " + i);                              
                                System.out.println("Minecraft: " + objJuegos.getMinecraft());
                                System.out.println("Segasonic: " + objJuegos.getSegasonic());
                                System.out.println("MarioBross: " + objJuegos.getMariobros());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("4")) {
                        System.out.println("----------------------------------");
                        System.out.println("Eliminar juego");
                        System.out.print("Ingrese el Tipo de VideoJuego: ");
                        String minecraftJuegos = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                            Juegos dato = listaObjetosJuegos.get(i);
                            if (minecraftJuegos.equals(dato.getMinecraft())) {
                                System.out.println("*****");
                                listaObjetosJuegos.remove(dato);
                                System.out.println("Juego eliminado");
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("5")) {
                        System.out.println("----------------------------------");
                        System.out.println("Salir de la opcion");
                    }

                } while (!opcionMenuInterno.equals("5"));
            }
            if (opcionMenuPrincipal.equals("2")) {
                do {
                    System.out.println("1.- Listar Jugador");
                    System.out.println("2.- Ingresar Jugador");
                    System.out.println("3.- Buscar Jugador");
                    System.out.println("4.- Eliminar Jugador");
                    System.out.println("5.- Salir de la opcion");
                    System.out.print("Ingrese opción: ");
                    opcionMenuInterno = entradaData.nextLine();
                    if (opcionMenuInterno.equals("1")) { 
                        System.out.println("----------------------------------");
                        System.out.println("Listar Jugador");
                        if (listaObjetosJuegos.isEmpty()) {
                            System.out.println("No hay Jugador agregado");
                        } else {
                            for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                                Jugador objJugador = listaObjetosJugador.get(i);
                                System.out.println("******************");
                                System.out.println("Jugador: " + i);
                                System.out.println("Tiempo: " + objJugador.getTiempo());
                                System.out.println("Puntos: " + objJugador.getPuntos());
                                System.out.println("Posiciom: " + objJugador.getPosicion());
                                System.out.println("Apodo: " + objJugador.getApodo());
                                System.out.println("Skin: " + objJugador.getSkin());
                                System.out.println("NiveldelJugador: " + objJugador.getNiveldeljugador());
                                System.out.println("Puntaje: " + objJugador.getPuntaje());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("2")) {
                        System.out.println("----------------------------------");
                        String tiempoJugador;
                        System.out.print("Ingrese el tiempo del jugador: ");
                        tiempoJugador = entradaData.nextLine();
                        String puntosJugador;
                        System.out.print("Ingrese los puntos obtenidos del jugador: ");
                        puntosJugador = entradaData.nextLine();
                        String posicionJugador;
                        System.out.print("Ingrese la posicion del jugador ");
                        posicionJugador = entradaData.nextLine();
                        String apodoJugador;
                        System.out.print("Ingrese el apodo del jugador: ");
                        apodoJugador = entradaData.nextLine();
                        String skinJugador;
                        System.out.print("Ingrese las vestimentas del jugador: ");
                        skinJugador = entradaData.nextLine();
                        String niveldeljugadorJugador;
                        System.out.print("Ingrese el nivel del jugador: ");
                        niveldeljugadorJugador = entradaData.nextLine();
                        String puntajeJugador;
                        System.out.print("Ingrese el puntaje del jugador: ");
                        puntajeJugador = entradaData.nextLine();

                        Jugador objJugador = new Jugador("30 minutos", "10 puntos", "Segundo lugar", "Daby Lozada", "3 ", "1 HORA", "3.1200");
                        listaObjetosJugador.add(objJugador);
                        System.out.println("Jugador agregado");
                    }
                    if (opcionMenuInterno.equals("3")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar Jugador");
                        System.out.print("Ingrese el tiempo del jugador: ");
                        String tiempoJugador = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosJuegos.size(); i++) {
                            Jugador objJugador = listaObjetosJugador.get(i);
                            if (tiempoJugador.equals(objJugador.getTiempo())) {
                                System.out.println("******************");
                                System.out.println("Jugador: " + i);
                                System.out.println("Tiempo: " + objJugador.getTiempo());
                                System.out.println("Puntos: " + objJugador.getPuntos());
                                System.out.println("Posiciom: " + objJugador.getPosicion());
                                System.out.println("Apodo: " + objJugador.getApodo());
                                System.out.println("Skin: " + objJugador.getSkin());
                                System.out.println("NiveldelJugador: " + objJugador.getNiveldeljugador());
                                System.out.println("Puntaje: " + objJugador.getPuntaje());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("4")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar Jugador");
                        System.out.print("Ingrese el tiempo: ");
                        String tiempoJugador = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosJugador.size(); i++) {
                            Jugador objJugador = listaObjetosJugador.get(i);
                            if (tiempoJugador.equals(objJugador.getTiempo())) {
                                System.out.println("*****");
                                listaObjetosJuegos.remove(objJugador);
                                System.out.println("Juegador eliminado");
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("5")) {
                        System.out.println("----------------------------------");
                        System.out.println("Salir de la opcion");
                    }

                } while (!opcionMenuInterno.equals("5"));
            }
            if (opcionMenuPrincipal.equals("3")) {
                do {
                    System.out.println("1.- Listar LocalesVideojuegos");
                    System.out.println("2.- Ingresar Local");
                    System.out.println("3.- Buscar Local");
                    System.out.println("4.- Eliminar Local");
                    System.out.println("5.- Salir de la opcion");
                    System.out.print("Ingrese opción: ");
                    opcionMenuInterno = entradaData.nextLine();
                    if (opcionMenuInterno.equals("1")) {
                        System.out.println("----------------------------------");
                        System.out.println("Listar LocalesVideojuegos");
                        if (listaObjetosJuegos.isEmpty()) {
                            System.out.println("No hay Locales agregados");
                        } else {
                            for (int i = 0; i < listaObjetosLocalesVideojuegos.size(); i++) {
                                LocalesVideojuegos1 objLocalesVideojuegos = listaObjetosLocalesVideojuegos.get(i);
                                System.out.println("******************");
                                System.out.println("Locales: " + i);
                                System.out.println("playzoneLatacunga: " + objLocalesVideojuegos.getPlayzoneLatacunga());
                                System.out.println("playzoneCCI: " + objLocalesVideojuegos.getPlayzoneCCI());
                            }
                        }
                    }
                     if (opcionMenuInterno.equals("2")) {
                        System.out.println("----------------------------------");
                        String playzoneLatacungaLocalesVideojuegos;
                        System.out.println("Ingresar la sucursal 1");
                        playzoneLatacungaLocalesVideojuegos = entradaData.nextLine();
                        String playzoneCCILocalesVideojuegos;
                        System.out.println("Ingresar la sucursal 2");
                        playzoneCCILocalesVideojuegos = entradaData.nextLine();

                        LocalesVideojuegos1 objLocalesVideojuegos = new LocalesVideojuegos1("LOCAL lATACUNGA 1", "LOCAL CCI 2");
                        
                        listaObjetosLocalesVideojuegos.add(objLocalesVideojuegos);
                        System.out.println("Local escogido");
                    }
                     if (opcionMenuInterno.equals("3")) {
                        System.out.println("----------------------------------");
                        System.out.println("Buscar Sucursal");
                        System.out.print("Ingrese el numero de local: ");
                        String playzoneLatacunga = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosLocalesVideojuegos.size(); i++) {
                            LocalesVideojuegos1 objLocalesVideojuegos = listaObjetosLocalesVideojuegos.get(i);
                            if (playzoneLatacunga.equals(objLocalesVideojuegos.getPlayzoneLatacunga())) {
                                
                                System.out.println("******************");
                                System.out.println("LocalesVideojuegos: " + i);                              
                                System.out.println("playzoneLatacunga: " + objLocalesVideojuegos.getPlayzoneLatacunga());
                                System.out.println("playzoneCCI: " + objLocalesVideojuegos.getPlayzoneCCI());
                            }
                        }
                    }
                    if (opcionMenuInterno.equals("4")) {
                        System.out.println("----------------------------------");
                        System.out.println("Eliminar local");
                        System.out.print("Ingrese el sucursal: ");
                        String playzoneLatacunga = entradaData.nextLine();
                        for (int i = 0; i < listaObjetosLocalesVideojuegos.size(); i++) {
                            LocalesVideojuegos1 objLocalesVideojuegos = listaObjetosLocalesVideojuegos.get(i);
                            if (playzoneLatacunga.equals(objLocalesVideojuegos.getPlayzoneLatacunga())) {
                                System.out.println("*****");
                                listaObjetosLocalesVideojuegos.remove(objLocalesVideojuegos);
                                System.out.println("Local eliminado");
                        }
                        }
                    }
                    if (opcionMenuInterno.equals("5")) {
                        System.out.println("----------------------------------");
                        System.out.println("Salir de la opcion");
                    }

                } while (!opcionMenuInterno.equals("5"));
            }
            if (opcionMenuPrincipal.equals("3")) {
                System.out.println("Salir del programa");
            }

        } while (!opcionMenuPrincipal.equals("4"));

    }

}

                        
             