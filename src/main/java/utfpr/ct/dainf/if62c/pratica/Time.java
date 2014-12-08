/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Fernando
 */
public class Time {
    private final HashMap<String, Jogador> time;
    
    public Time(){
        time = new HashMap<>();
    }
    
    public HashMap<String, Jogador> getJogadores(){
        return time;
    }
    
    public void addJogador(String a, Jogador j){
        time.put(a,j);
    }
    
    @Override
    public String toString() {
        String s = "";
        Set<String> chaves = time.keySet();
        s = chaves.stream().map((chave) -> (chave + ": " + time.get(chave)+"\t")).reduce(s, String::concat);
        return s;
    }
}
