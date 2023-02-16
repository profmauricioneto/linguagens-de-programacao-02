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
public class MatrixExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dimension, diagonal = 0;
        System.out.print("Qual a dimensão da matriz? ");
        dimension = scan.nextInt();
        
        int matrix[][] = new int[dimension][dimension];
        
        for(int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.printf("matriz[%d][%d] = ", i, j);
                matrix[i][j] = scan.nextInt();
                if (i == j) {
                    diagonal = diagonal + matrix[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal principal é: " + diagonal);
    }
}
