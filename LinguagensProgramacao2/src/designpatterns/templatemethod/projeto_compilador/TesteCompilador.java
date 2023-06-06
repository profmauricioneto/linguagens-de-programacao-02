package designpatterns.templatemethod.projeto_compilador;

import java.util.Scanner;


/**
 *
 * @author maumneto
 */
public class TesteCompilador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        Compilador compilador;
        String lang;
        System.out.println("Escolha o compilador [ios/android]");
        lang = scan.next();
        lang = lang.toLowerCase();
        if (lang.equals("ios")) {
            compilador = new IOSCompilador();
        } else if (lang.equals("android")) {
            compilador = new AndroidCompilador();
        } else {
            System.out.println("Compilador não identificado.");
        }
        scan.close();
    }
}
