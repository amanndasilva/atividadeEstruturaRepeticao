/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contador;

import javax.swing.JOptionPane;

/**
 *
 * @author amand
 * 
 * Crie um programa que conte até a sua idade e diga quantos anos você tem.
 */
public class Contador {

    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade.")); //inserir a idade
        int contar = 0;
        
        //While
        while(contar <= idade){ //faz a conta da idade até chegar na idade inserida
            System.out.println("Contando: " + contar); //imprime a contagem da idade
            contar++;
        }
        System.out.println("Voce tem " + idade + " anos!");
        
        //Do While
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade."));
        int contar2 = 0;
        
        do{
            System.out.println("Contando: " + contar2);
            contar2++;
        }while(contar2 <= idade);
        System.out.println("Voce tem " + idade2 + " anos!");
        
        //For
        int idade3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade."));
        int contar3 = 0;
        
        for(; contar3 <= idade3; contar3++){
            System.out.println("Contando: " + contar3);
        }
        System.out.println("Voce tem " + idade3 + " anos!");
    }
}
