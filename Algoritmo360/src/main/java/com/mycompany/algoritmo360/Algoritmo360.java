/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo360;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo360 {

    public static void main(String[] args) {
        int data, i, dia, mes;
        
        ValoresSignos Signos = new ValoresSignos();
        
        for (i = 0; i < 12; i++){
            Signos.signo[i] = JOptionPane.showInputDialog("Digite o signo:");
            
            String ultimodia = JOptionPane.showInputDialog("Digite o ultimo dia:");
            Signos.ultdia[i] = Integer.parseInt(ultimodia);
        }
        
        data = Integer.parseInt( JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar; "));
        
        while (data != 9999){
            dia = data / 100;
            mes = data % 100;
            mes--;
        if (dia > Signos.ultdia[mes]){
            mes = (mes + 1) % 12;
        }
        
        System.out.println("Signo: " + Signos.signo[mes] + "\n");
        data = Integer.parseInt(JOptionPane.showInputDialog("\nDigite a data no formato ddmm ou 9999 para terminar: "));
        }
    }
}