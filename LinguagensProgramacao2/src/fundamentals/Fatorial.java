/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentals;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor, fat = 1;
        System.out.print("Valor: ");
        valor = scan.nextInt();
        
        for(int i = 1; i <= valor; i++) {
            fat = fat * i;
            System.out.println(fat);
        }
        scan.close();
    }
}















