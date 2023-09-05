/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo351;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo351 {

    public static void main(String[] args) {
        int L, num;
        String nomes[] = new String[5];
        
        for(L = 0; L <= 4; L++){
            nomes[L] = JOptionPane.showInputDialog("Escreva seu nome " + (L + 1) + ":");
        }
        
        String pessoa;
        do{
            pessoa = JOptionPane.showInputDialog("Digite o numero da pessoa (entre 1 a 5)");
            num = Integer.parseInt(pessoa);
            System.out.println(num);
            
            if (num < 1 || num > 5){
                System.out.println("Numero fora do intervalo");
            }
        } while (num < 1 || num > 5);
        
        System.out.println(nomes[num - 1]);
    }
}
