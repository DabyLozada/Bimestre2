/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Herencia;

/**
 *
 * @author DELL
 */
public class Principal1 {
    public static void main(String[] args) {
        Jugador1 jugador = new Jugador1("2 Hora", "1000 estrellas", "Tercer lugar", "Daby", "12 vestimentas", "Principiante","12");
        
        jugador.mostrarInf();
        
        Juegos1 tiposdevideojuegos1 = new Juegos1("Minecraftl", "Sonic", "MarioBross");
        System.out.println("VideojuegodeSupervivencia :"+ tiposdevideojuegos1.getMinecraft()+
                "\nVideojuegodeAventura: "+tiposdevideojuegos1.getSegasonic()+
                "\nVideojuegodeAventura: "+tiposdevideojuegos1.getMariobros());
        
        
        LocalesVideojuegos1 localesvideojuegos1 = new LocalesVideojuegos1("LatacungaPLAYZONE", "CCIPlayZone");
        System.out.println("Local 1 :"+localesvideojuegos1.getPlayzoneLatacunga()+
                "\nLocal 2 :"+localesvideojuegos1.getPlayzoneCCI());
        
    }

}
