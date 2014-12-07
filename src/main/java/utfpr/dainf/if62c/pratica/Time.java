/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.dainf.if62c.pratica;
import java.util.HashMap;

/**
 *
 * @author Fernando
 */
public class Time {
    private HashMap<String, Jogador> time;
    
    public Time(){
        time = new HashMap<>();
    }
    
    public HashMap<String, Jogador> getJogadores(){
        return time;
    }
    
    public void addJogador(String a, Jogador j){
        time.put(a,j);
    }
}
