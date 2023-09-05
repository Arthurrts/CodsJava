/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo356;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo356 {

    public static void main(String[] args) {
        int L, C, T;
        
        ValoresBoletim Boletim = new ValoresBoletim();
        
        for(L = 0; L <= 14; L++){
            Boletim.nomes[L] = JOptionPane.showInputDialog("Digite o nome" + (L + 1) + ":");
            
            while (Boletim.nomes[L].length() > 30){
                System.out.println("Sao permitidos apenas nomes com ate 30 caracteres. Por favor, digite novamente.");
                Boletim.nomes[L] = JOptionPane.showInputDialog("Digite o nome" + (L + 1) + ":");
            }
            
            T = 30 - Boletim.nomes[L].length();
            
            for (C = 1; C <= T; C++){
                Boletim.nomes[L] += " ";
            }
            
            String nota1 = JOptionPane.showInputDialog("Digite a primeira nota:");
            Boletim.pr1[L] = Float.parseFloat(nota1);
            
            String nota2 = JOptionPane.showInputDialog("Digite a segunda nota:");
            Boletim.pr2[L] = Float.parseFloat(nota2);
            
            Boletim.media[L] = (int) ((Boletim.pr1[L] + Boletim.pr2[L]) / 2 + 0.0001);
            
            if (Boletim.media[L] >= 5){
                Boletim.sit[L] = "AP";
            }
            else{
                Boletim.sit[L] = "RP";
            }
        }
        
            System.out.println("\n\n\n\t\t\tRELACAO FINAL\n");
            
            for (L = 0; L <=14; L++){
                System.out.println("\n" + (L + 1) + "- " + Boletim.nomes[L] + "\t" + Boletim.pr1[L] + "\t" + Boletim.pr2[L] + "\t" + Boletim.media[L] + "\t" + Boletim.sit[L]);
            }
    }
}
