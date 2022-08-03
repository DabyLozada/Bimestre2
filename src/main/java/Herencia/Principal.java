/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Herencia;

/**
 *
 * @author DELL
 */
public class Principal {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("1 Hora", "1000 estrellas", "Tercer lugar", "Daby", "12 vestimentas", "Principiante","12");
        
        jugador.mostrarInf();
        
        Juegos tiposdevideojuegos1 = new Juegos("Minecraftl", "Sonic", "MarioBross");
        System.out.println("VideojuegodeSupervivencia :"+ tiposdevideojuegos1.getMinecraft()+
                "\nVideojuegodeAventura: "+tiposdevideojuegos1.getSegasonic()+
                "\nVideojuegodeAventura: "+tiposdevideojuegos1.getMariobros());
        
        
        LocalesVideojuegos localesvideojuegos1 = new LocalesVideojuegos("LatacungaPLAYZONE", "CCIPlayZone");
        System.out.println("Local 1 :"+localesvideojuegos1.getPlayzoneLatacunga()+
                "\nLocal 2 :"+localesvideojuegos1.getPlayzoneCCI());
        
    }

}
