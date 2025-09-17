/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeromisterioso;

/**
 *
 * @author Victor Yudi 1ºDS/AMS
 */

import java.util.Scanner;
import java.util.Random;

public class NumeroMisterioso {

    public static void main(String[] args) {
        Scanner inUser = new Scanner(System.in);
        Random random = new Random();
        
        int numero = random.nextInt(1,6); 
        int numUser;
        int tentativas = 0;
        
        do {
            System.out.println("Digite um numero de 1 a 5:");
            numUser = inUser.nextInt();
            tentativas++;
            
            
                if (numUser != numero) {
            
                System.out.println("Valor deve ser entre 1 a 10.");
            
        }
                        
            if (numUser > numero) {
                System.out.println("O numero secreto e mais baixo.");

            } else if (numUser < numero) {
                System.out.println("O número secreto é mais alto.");
 
            }
            
        
            
        } while (numUser != numero);
        
        System.out.println("Parabens! Voce acertou!");
        System.out.println("Tentativas: " + tentativas);
        
        inUser.close();
    }
}
