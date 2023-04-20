/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exerciseObserver;

/**
 *
 * @author maumneto
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject observado = new Subject();
        
        ObserverSenderEmail observador1 = new ObserverSenderEmail(observado);
        observador1.addEmail("mauricio.moreira@email.com");
        observador1.addEmail("gean_breno@email.com");
        
        
        ObserverSenderSMS observador2 = new ObserverSenderSMS(observado);
        observador2.addTelNumber("08511223344");
        observador2.addTelNumber("08511223344");
        
//        observado.attach(observador1);
//        observado.attach(observador2);
        
        for (int i = 1; i <= 5; i++) {
            if (observado.isEven(i)) {
                observado.notifyAllAttached();
                System.out.println(" =========== ");
            }
        }
    }
}
