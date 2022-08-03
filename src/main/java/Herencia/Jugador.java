/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author DELL
 */
public class Jugador extends JuegosOlimpicos {
    private String apodo;
    private String skin;
    private String niveldeljugador;
    private String puntaje;
    
  
    //Constructor
    public Jugador (String tiempo,String puntos,String posicion,String apodo,String skin,String niveldeljugador,String puntaje){
            super(tiempo,puntos,posicion);
            this.apodo = apodo;
            this.skin = skin;
            this.niveldeljugador = niveldeljugador;
            this.puntaje = puntaje;
           
}
    public void mostrarInf (){
        System.out.println(">>>Datos del Jugador "+
                "\nTiempo: "+getTiempo()+
                "\nPuntos: "+getPuntos()+
                "\nPosicion: "+getPosicion()+
                "\nApodo: "+apodo+
                "\nSkin: "+skin+
                "\nNiveldeljugador: "+niveldeljugador+
                "\nPuntaje: "+puntaje);
    }
}       