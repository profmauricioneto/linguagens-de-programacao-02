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
public abstract class SocialNetwork {
    public String username;
    public String password;
    public SocialNetwork(){}
    // template method
    public boolean postData(String message) {
        if (login(this.username, this.password)) {
            boolean res = sendData(message.getBytes());
            logout();
            return res;
        }
        return false;
    }
    // abstract methods (subclasses will implement them)
    public abstract boolean login (String username, String password);
    public abstract boolean sendData (byte[] data);
    public abstract void logout ();
}
