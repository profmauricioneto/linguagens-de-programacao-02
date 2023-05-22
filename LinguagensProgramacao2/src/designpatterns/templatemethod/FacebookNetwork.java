/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.templatemethod;

/**
 *
 * @author mauricio.moreira
 */
public class FacebookNetwork extends SocialNetwork {
    public FacebookNetwork(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean login (String username, String password) {
        System.out.println("Name: " + this.username);
        System.out.print("Senha: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\nLogin realizado com sucesso!");
        return true;
    }
    public boolean sendData (byte[] data) {
        boolean message = true;
        if (message){
            System.out.println("Mensagem: " + new String(data) + " foi postada no facebook!");
            return true;
        } else {
            return false;
        }
    }
    public void logout (){
        System.out.println("Usuário: " + username + " foi desconectado do facebook!");
    } 
}
