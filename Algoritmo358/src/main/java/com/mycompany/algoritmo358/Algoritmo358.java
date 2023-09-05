/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo358;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo358 {

    public static void main(String[] args) {
        float lucro;
        int totlucromenor10, totlucromenor20, totlucromaior20, A;
        totlucromenor10 = 0;
        totlucromenor20 = 0;
        totlucromaior20 = 0;
        
        Precos Compras = new Precos();
        
        for(A = 0; A < 100; A++){
            String precoC = JOptionPane.showInputDialog("Preco de compra:");
            Compras.precocompra[A] = Float.parseFloat(precoC);
            
            String precoV = JOptionPane.showInputDialog("Preco de venda:");
            Compras.precovenda[A] = Float.parseFloat(precoV);
        }
        
        for(A = 0; A < 100; A++){
            lucro = Compras.precovenda[A] - Compras.precocompra[A];
            
            if(lucro<10.0){
                totlucromenor10++;
            } else{
                if(lucro <= 20.0){
                    totlucromenor20++;
                } else{
                    totlucromaior20++;
                }
            }
            System.out.println("Total de mercadores com lucro < 10%" + totlucromenor10);
            System.out.println("Total de mercadores com lucro 10% <= lucro <= 20%" + totlucromenor20);
            System.out.println("Total de mercadores com lucro > 20%" + totlucromaior20);
        }
    }
}
