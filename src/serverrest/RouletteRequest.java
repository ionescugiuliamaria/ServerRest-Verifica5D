/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteRequest {
    String giocata;
    Integer numero;
    boolean vittoria;
    
    // Costruttore vuoto necessario per GSON
    public RouletteRequest() {
    }
    
    // Costruttore con parametri  
   public RouletteRequest(String giocata, Integer numero, boolean vittoria) {
        this.giocata = giocata;
        this.numero = numero;
        this.vittoria = vittoria;
    }
    
    // Getter
   
    public String getGiocata() {
        return giocata;
    }

    public Integer getNumero() {
        return numero;
    }

    public boolean isVittoria() {
        return vittoria;
    }
    
    // Setter
     public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setVittoria(boolean vittoria) {
        this.vittoria = vittoria;
    }

    // ToString

    @Override
    public String toString() {
        return "RouletteRequest{" + "giocata=" + giocata + ", numero=" + numero + ", vittoria=" + vittoria + '}';
    }
}