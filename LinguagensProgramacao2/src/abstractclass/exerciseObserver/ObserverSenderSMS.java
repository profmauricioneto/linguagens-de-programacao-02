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
public class ObserverSenderSMS extends Observer {
    private List<String> listPhonesNumbers;
    
    public ObserverSenderSMS(Subject subject) {
        this.subject = subject;
        subject.attach(this);
        listPhonesNumbers = new ArrayList<>();
    }
    
    public void getNumbers() {
        for(String number: listPhonesNumbers) {
            System.out.println(number);
        }
    }
    
    public void addTelNumber(String phoneNumber) {
        listPhonesNumbers.add(phoneNumber);
    }

    @Override
    public void update() {
        System.out.println("A wild event appears");
        System.out.println("Sending SMS to: ");
        getNumbers();
    }
    
    
}
