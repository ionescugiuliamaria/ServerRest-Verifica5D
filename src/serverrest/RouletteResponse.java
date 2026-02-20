/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteResponse {
    String giocata;
    Integer numero;
    boolean vinto;
    
    // Costruttore vuoto necessario per GSON
    public RouletteResponse() {
    }
    
    // Costruttore con parametri
    public RouletteResponse(String giocata, Integer numero, boolean vinto) {
        this.giocata = giocata;
        this.numero = numero;
        this.vinto = vinto;
    }
    
    // Getter
   
    public String getGiocata() {
        return giocata;
    }

    public Integer getNumero() {
        return numero;
    }

    public boolean isVinto() {
        return vinto;
    }
    
    // Setter

    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setVinto(boolean vinto) {
        this.vinto = vinto;
    }
    
}