/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo348;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo348 {

    public static void main(String[] args) {
        int L;
        ValoresAlunos Notas = new ValoresAlunos();
        
        for(L = 0; L <= 4; L++){
            Notas.nomes[L] = JOptionPane.showInputDialog("Escreva seu nome " + (L + 1) + ":");
            
            String nota = JOptionPane.showInputDialog("Escreva sua nota " + (L + 1) + ":");
            Notas.pr1[L] = Double.parseDouble(nota);
            
            String nota2 = JOptionPane.showInputDialog("Escreva sua segunda nota " + (L + 1) + ":");
            Notas.pr2[L] = Double.parseDouble(nota);
            
            Notas.media[L] = (Notas.pr1[L] + Notas.pr2[L])/ 2;
        }
        
        for(L = 0; L <= 4; L++){
            System.out.println("Nome " + (L + 1) + ": " + Notas.nomes[L]);
            
            System.out.println("Nota " + (L + 1) + ": " + Notas.pr1[L]);
                
            System.out.println("Nota " + (L + 1) + ": " + Notas.pr2[L]);
            
            System.out.println("Media " + (L + 1) + ": " + Notas.media[L]);
        }
    }
}
