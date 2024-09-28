/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cartaosalario;

import javax.swing.JOptionPane;

/**
 *
 * @author amand
 * 
 * Crie um programa cartão salário, onde finalize o saldo de 1000,00 e escreva "SEM SALDO NO BANCO"
 */
public class CartaoSalario {

    public static void main(String[] args) {
        //While
        double saldo = 1000.00; //saldo da conta
        double gasto;
        
        while(saldo > 0){
            gasto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade a ser gasta.")); //inserir o preço gasto
            saldo -= gasto; //verifica o saldo apenas se o valor estiver positivo
            System.out.println("Gasto: " + gasto + "  |  Saldo atual: " + saldo);
        }
        System.out.println("Sem saldo no banco!");
        
        //Do While
        double saldo2 = 1000.00;
        double gasto2;
        
        do{
            gasto2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade a ser gasta."));
            saldo2 -= gasto2;
            System.out.println("Gasto: " + gasto2 + "  |  Saldo atual: " + saldo2);
        }while(saldo2 > 0);
        System.out.println("Sem saldo no banco!");
        
        //For
        double saldo3 = 1000.00;
        double gasto3;
        
        for(; saldo3 > 0; saldo3--){
            gasto3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade a ser gasta."));
            saldo3 -= gasto3;
            System.out.println("Gasto: " + gasto3 + "  |  Saldo atual: " + saldo3);
        }
        System.out.println("Sem saldo no banco!");
    }
}
