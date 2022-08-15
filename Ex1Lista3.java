/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanypedro.lista3;

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class ex1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float nota;
       int i = 0;
        do{
            System.out.println("Informe a Nota: ");
            nota = sc.nextFloat();
            if (nota<=0 || nota>=11){
                
                System.out.println("Numero invalido");
                
            }else {
                System.out.println("Valor Informado valido ");
               
            }
        }while(nota<=0 || nota>=11);
        
    
        
    }
 
}
