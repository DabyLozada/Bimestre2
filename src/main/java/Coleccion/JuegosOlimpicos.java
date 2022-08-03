/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coleccion;

/**
 *
 * @author DELL
 */
public class JuegosOlimpicos {
    private String tiempo;
    private String puntos;
    private String posicion;
    
    
    //Constructor
    public JuegosOlimpicos (String tiempo,String puntos,String posicion) {
            this.tiempo = tiempo;
            this.puntos = puntos;
            this.posicion = posicion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    
    
}

