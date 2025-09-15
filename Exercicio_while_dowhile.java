/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_while_dowhile;

/**
 *
 * @author caio novaes
 */
import java.util.Scanner;
public class Exercicio_while_dowhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //execicio 1
        int i1 = 2; // comeca no dois por conta do primeiro numero ser par
        while (i1 <= 20) { // vai repetir ate 20
            System.out.println(i1);
            i1 += 2; // vai pilar os numeros de dois em dois para so mostra os numeros pares 
        }
        
        // exercico 2
        System.out.println("digite um numero para voce quer ele na tabuada");
        int num = sc.nextInt();
        int i2 = 1; // para começar no 1
        while (i2 <= 10) { // vai ir ate 10
           System.out.println(num + " x " + i2 + " = " + (num * i2));
           i2++; //vai aumentar o contador
        }
           // exercicio 3
           int inicio3 = 100;
           int fim3 = 125;
           int contador = 0; // e a variavel que ira contar
           int i3 = inicio3; // ira comecar no 100
           while (i3 <= fim3){ // e ira ate 125
               contador++; // vai somar de 1 em 1
           i3++; 
           }
        System.out.println("quantidade de números entre 100 e 125: " + contador);
        
        // exercicio 4
        System.out.println("digite o primeiro valor");
        int inicio4 = sc.nextInt();
        System.out.println("digite o ultimo valor");
        int fim4 = sc.nextInt();
        while (inicio4 > fim4) {
            int tpm = inicio4;
            inicio4 = fim4;
            fim4 = tpm;
        }
        inicio4 += ((inicio4 & 1) ^ 1);
        inicio4 = inicio4 + (inicio4 % 2);
        int soma = 0;
        int i4 = inicio4;
        while (i4 <= fim4) {
            soma += i4;
            i4 += 2;
        }
        System.out.println("soma dos impares entre os valores: " + soma);
        sc.close();
    }
}

    

