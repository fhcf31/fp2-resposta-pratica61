/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
import java.util.Iterator;
import utfpr.dainf.if62c.pratica.Time;
import utfpr.dainf.if62c.pratica.Jogador;

public class Pratica61 {
    
    public static void main(String args[]){
        Time t1 = new Time();
        Time t2 = new Time();
        
        //Criando time 1:
        t1.addJogador("Zagueiro", new Jogador(03,"Roberto"));
        t1.addJogador("Atacante", new Jogador(10,"Carlos"));
        t1.addJogador("Meio Campo", new Jogador(11,"Ricardinho"));
        
        //Criando time 2:
        t2.addJogador("Zagueiro", new Jogador(02,"Lúcio"));
        t2.addJogador("Atacante", new Jogador(10,"Robinho"));
        t2.addJogador("Meio Campo", new Jogador(07,"Kaka"));
        
        //percorrer os time e exibir:
        System.out.println("Escalação:");
        System.out.println("Posição:\tTime1:\t\t\tTime2:");
        
        Iterator<String> it = t1.getJogadores().keySet().iterator();
        while(it.hasNext()){
            String chave = it.next();
            
            Jogador j1 = t1.getJogadores().get(chave);
            Jogador j2 = t2.getJogadores().get(chave);
            System.out.println(chave+"\t"+j1+"\t\t"+j2);
        }
    }
    
}
