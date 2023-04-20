/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exerciseObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class ObserverSenderEmail extends Observer {
    private List<String> listEmails;

    public ObserverSenderEmail(Subject subject) {
        this.subject = subject;
        subject.attach(this);
        listEmails = new ArrayList<>();
    }
    
    public void getEmails() {
        for(String email: listEmails) {
            System.out.println(email);
        }
    }
    
    public void addEmail(String email) {
        listEmails.add(email);
    }
    
    @Override
    public void update() {
        System.out.println("A wild event appears");
        System.out.println("Sending email to: ");
        getEmails();
    }
    
    
}
