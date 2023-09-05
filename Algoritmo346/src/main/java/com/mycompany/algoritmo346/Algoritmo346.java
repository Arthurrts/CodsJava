/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo346;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo346 {

    public static void main(String[] args) {
        String frase;
        int op, x, tam;
        
        do{
            System.out.println("MENU");
            System.out.println("\n1 - Imprime o comprimento da frase");
            System.out.println("\n2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("\n3 - Imprime a frase espelhada");
            System.out.println("\n3 - Termina o algoritmo");
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção"));
            
            if(op == 1){
                frase = JOptionPane.showInputDialog("Digite uma frase:");
                tam = frase.length();
                System.out.println("Numero de caracteres da frase:" + tam);
            } else {
                if (op == 2){
                    frase = JOptionPane.showInputDialog("Digite uma frase:");
                    System.out.println("Os dois primeiros caracteres: " + frase.substring(0, 2));
                    tam = frase.length();
                    System.out.println("Os dois últimos caracteres: " + frase.substring(tam - 2));
                }
                else {
                    if (op == 3){
                        frase = JOptionPane.showInputDialog("Digite uma frase:");
                        String fraseInvertida = "";
                        for(x = frase.length() - 1; x >= 0; x--){
                            fraseInvertida += frase.charAt(x);
                        }
                            System.out.println(fraseInvertida);
                    } else {
                        if (op == 4){
                            System.out.println("Fim do algoritmo");
                        } else {
                            System.out.println("Opcao nao disponivel");
                        } 
                    } 
                }
            }
        } while (op != 4);
    }
}
