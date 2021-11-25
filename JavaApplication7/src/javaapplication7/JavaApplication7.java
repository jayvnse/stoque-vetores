/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author jacks
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crie um vetor A com 5 elementos inteiros.
        Após criado o vetor A faça A[i]=B[i] */
        Scanner scan = new Scanner(System.in);
        
        //int[] arrayA = new int[5];
        int[] arrayA = new int[5];
        int[] arrayB = new int[arrayA.length];
        
        for (int i=0; i<arrayA.length; i++){
            System.out.println("Entre com um número:");
            arrayA[i] =  scan.nextInt();
            
            arrayB[i] = arrayA[i];
        }
        
        System.out.print("Vetor A / Array A = ");
        for (int i=0; i<arrayA.length; i++){
            System.out.print(arrayA[i] + ", ");
        }
        
        System.out.println(" ");
        
        System.out.print("Vetor B / Array B = ");
        for (int i=0; i<arrayB.length; i++){
            System.out.print(arrayB[i] + ", ");
        }
    }
    
}
