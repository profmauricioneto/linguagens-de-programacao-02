/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.templatemethod;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author mauricio.moreira
 */
public class ExampleTemplateMethod {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SocialNetwork network = null;
        // username and password
        System.out.print("Nome do Usuário: ");
        String username = scan.next();
        System.out.print("Senha: ");
        String password = scan.next();
        // enter with message
        System.out.print("Coloque o seu Post: ");
        String message = reader.readLine();
        
        System.out.print("Escolha a Rede Social a ser postada: [facebook/twitter] ");
        String socialNet = scan.next();
        
        if (socialNet.equals("facebook")) {
            network = new FacebookNetwork(username, password);
        } else {
            network = new TwitterNetwork(username, password);
        }
        network.postData(message);
    } 
}
