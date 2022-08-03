/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author DELL
 */
public class LocalesVideojuegos1 {
    public String playzoneLatacunga;
    public String playzoneCCI;
    
    public LocalesVideojuegos1(String playzoneLatacunga,String playzoneCCI) {
        this.playzoneLatacunga = playzoneLatacunga;
        this.playzoneCCI = playzoneCCI;
        System.out.println(">>>Sucursales ");
    }

    public String getPlayzoneLatacunga() {
        return playzoneLatacunga;
    }

    public void setPlayzoneLatacunga(String playzoneLatacunga) {
        this.playzoneLatacunga = playzoneLatacunga;
    }

    public String getPlayzoneCCI() {
        return playzoneCCI;
    }

    public void setPlayzoneCCI(String playzoneCCI) {
        this.playzoneCCI = playzoneCCI;
    }

    
    
}

