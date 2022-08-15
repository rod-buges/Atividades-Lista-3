/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojetoensw;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Buges
 */
public class Ex10Lista3 {
    public static void main(String[] args) {

 Scanner scan = new Scanner(System.in);


 System.out.print("Digite dois numeros inteiros: ");


 int primeiroNumero = scan.nextInt();

 int segundoNumero = scan.nextInt();


 int menorNumero = 0;


 if (primeiroNumero < segundoNumero)

  menorNumero = primeiroNumero;

 else

  menorNumero = segundoNumero;


 int diferenca = Math.abs(primeiroNumero - segundoNumero);


 for (int i = 1; i < diferenca; i++)

  System.out.print(menorNumero + i + " ");


}

}
    

