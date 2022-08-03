/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coleccion;

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

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getNiveldeljugador() {
        return niveldeljugador;
    }

    public void setNiveldeljugador(String niveldeljugador) {
        this.niveldeljugador = niveldeljugador;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

}
