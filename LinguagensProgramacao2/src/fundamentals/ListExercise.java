/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class ListExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtd_nomes;
        String nome;
        List<String> participantes = new ArrayList<>();
        System.out.print("Digite a quantidade de elementos: ");
        qtd_nomes = scan.nextInt();
        for (int i = 0; i < qtd_nomes; i++) {
            System.out.print("Digite o nome: ");
            nome = scan.next();
            participantes.add(nome);
        }
        
        // show the name list 
        for(String p: participantes) {
            System.out.println(p);
        }
    }
}
