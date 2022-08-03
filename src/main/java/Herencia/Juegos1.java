/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author DELL
 */
public class Juegos1 {
    private String minecraft;
    private String segasonic;
    private String mariobros;

    public Juegos1(String minecraft, String segasonic, String mariobros) {
        this.minecraft = minecraft;
        this.segasonic = segasonic;
        this.mariobros = mariobros;
        System.out.println(">>>Tipos de Videojuegos ");
    }

    public String getMinecraft() {
        return minecraft;
    }

    public void setMinecraft(String minecraft) {
        this.minecraft = minecraft;
    }

    public String getSegasonic() {
        return segasonic;
    }

    public void setSegasonic(String segasonic) {
        this.segasonic = segasonic;
    }

    public String getMariobros() {
        return mariobros;
    }

    public void setMariobros(String mariobros) {
        this.mariobros = mariobros;
    }
   
}
