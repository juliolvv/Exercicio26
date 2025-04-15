
package com.mycompany.exercicio26;

import javax.swing.JOptionPane;

public class Exercicio26 {

    public static void main(String[] args) {
        int qtde = 3;
        int vetor[] = new int[qtde]; 
        for (int i = 0; i < qtde; i++) {
            vetor[i] =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
        }
         
        for (int i = 0; i <qtde-1; i++) {
            for(int j = i+1; j <qtde; j++){
                if(vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
            }
        }          
    }
        for(int i = 0; i <qtde; i++) {
            JOptionPane.showMessageDialog(null, + vetor[i]);
        }
    }
}