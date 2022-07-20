/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author DELL
 */
public class Jugadores extends Tiposdejuegos {
    private String competir;
    private String puntos;
    private String niveles;
    
    
    //Constructor
    public Jugadores (String basquet,String futbol,String competir,String puntos,String niveles){
            super(basquet, futbol);
            this.competir = competir;
            this.puntos = puntos;
            this.niveles = niveles;
    }
    public void mostrarInf (){
        System.out.println("Basquet: "+getBasquet()+
                "\nFutbol:"+getFutbol()+
                "\nCompetir"+competir+
                "\nPuntos"+puntos+
                "\nNiveles"+niveles);
    }
}
