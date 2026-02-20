/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

import javax.swing.JOptionPane;

/**
 *
 * @author delfo
 */
public class RouletteService {
    
    /**
     * Esegue l'operazione matematica richiesta
     * 
     * @param giocata
     * @param numero
     * @return 
     * @throws IllegalArgumentException se ...
     */
    public static boolean logicaDellaRoulette(String giocata, Integer numero) 
            throws IllegalArgumentException {
        
        // Controllo se i parametri passati sono validi
                if (!parametriValidi(giocata, numero)) {
            throw new IllegalArgumentException("Giocata e numero non possono essere vuoti");
        }
        
        try {
            String g = giocata.toUpperCase();
            if(g.equals("PARI")){
                if(numero%2 == 0){
                    return true;
                }else if(numero == 0){
                    return false;
                }else{
                    return false;
                }
            }else if(g.equals("DISPARI")){
                if(numero%2 != 0){
                    return true;
                }else if(numero == 0){
                    return false;
                }else{
                    return false;
                }
            }else{
                JOptionPane.showInputDialog("La giocata non è valida, le giocate che puoi fare è: PARI, DISPARI");
            }
            
        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Opzione non valida. Opzione deve essere DA FARE");
        }
        return true; // Placeholder, da sostituire con il risultato della logica di calcolo
    }

    // Metodo di validazione dei parametri (da implementare)
    private static boolean parametriValidi(String giocata, Integer numero)
    {
        if(giocata == null || giocata.trim().isEmpty() || numero == null){
            return false;
        }
        else{
            return true;
        }
    }
}
