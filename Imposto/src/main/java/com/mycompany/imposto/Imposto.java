/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imposto;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author amand
 * 
 * Crie um programa que receba os 6 valores de salários e calcule o imposto a ser pago no total dos seis salários recebidos.
 * Pesquise na Web a tabela de imposto, e utilizar o percentual de acordo com os valores de salários.
 */
public class Imposto {

    public static void main(String[] args) {
        //While
        float[] salario = new float[6]; //criando um array para armazenar os 6 salários
        float impostoSalario = 0; //armazena o total de impostos
        int contador = 0; //contador do loop
        DecimalFormat df = new DecimalFormat("#.00");
        
        while(contador < 6){
            salario[contador] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu salário.")); //inserir o salário
            float imposto = calcularImposto(salario[contador]); //calcula o imposto sob o salário
            impostoSalario += imposto; //adiciona ao total do imposto
            float totalRecebido = salario[contador] - imposto; //calcular total recebido salário + imposto
            System.out.println("Seu salario: " + df.format(salario[contador]) + " | Imposto: " + df.format(imposto) + " | Total recebido: " + df.format(totalRecebido));
            contador++;
        }
        System.out.println("Imposto a ser pago: R$" + df.format(impostoSalario));
        
        //Do While
        float[] salario2 = new float[6];
        float impostoSalario2 = 0;
        int contador2 = 0;
        
        do{
            salario2[contador2] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu salário."));
            float imposto = calcularImposto(salario2[contador2]); //calcula o imposto sobre o salário
            impostoSalario2 += imposto; //adiciona ao total do imposto
            float totalRecebido2 = salario2[contador2] - imposto;
            System.out.println("Seu salario: " + df.format(salario2[contador2]) + " | Imposto: " + df.format(imposto) + " | Total recebido: " + df.format(totalRecebido2));
            contador2++;
        }while(contador2 < 6);
        System.out.println("Imposto a ser pago: R$" + df.format(impostoSalario2));
        
        //For
        float[] salario3 = new float[6];
        float impostoSalario3 = 0;
        
        for(int contador3 = 0; contador3 < 6; contador3++){
            salario3[contador3] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu salário."));
            float imposto = calcularImposto(salario3[contador3]); //calcula o imposto sobre o salário
            impostoSalario3 += imposto; //adiciona ao total do imposto
            float totalRecebido3 = salario3[contador3] - imposto;
            System.out.println("Seu salario: " + df.format(salario3[contador3]) + " | Imposto: " + df.format(imposto) + " | Total recebido: " + df.format(totalRecebido3));
        }
        System.out.println("Imposto de renda a ser pago: R$" + df.format(impostoSalario3));
    }
        
    public static float calcularImposto(float salario){
        float imposto = 0;

        if(salario <= 1903.98){
            imposto = 0; //isenção
        }else if(salario <= 2826.65){
            imposto = (salario - 1903.98f) * 0.075f; //7,5%
        }else if(salario <= 3751.05){
            imposto = (salario - 2826.65f) * 0.15f + (2826.65f - 1903.98f) * 0.075f; //15%
        }else if(salario <= 4664.68){
            imposto = (salario - 3751.05f) * 0.225f + (3751.05f - 2826.65f) * 0.15f + (2826.65f - 1903.98f) * 0.075f; //22,5%
        }else{
            imposto = (salario - 4664.68f) * 0.275f + (4664.68f - 3751.05f) * 0.225f + (3751.05f - 2826.65f) * 0.15f + (2826.65f - 1903.98f) * 0.075f; //27,5%
        }

        return imposto;
    }
}
