/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojetoensw;
import java.util.Scanner;

//Imprimir somente números ímpares de 1 ate 50

/**
 *
 * @author Rodrigo Buges
 */
public class Ex9Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Valores ímpares:");
for (int i = 0; i < 50; i++) {
    if (i % 2 != 0) {
        System.out.println(i);
    }
}
    }
    
}
