
package abstractclass.exerciseObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Subject {
    public List<Observer> observers = new ArrayList<>();
    
    public boolean isEven(int number) {
        boolean flag = false;
        if (number % 2 == 0) {
            flag = true;
        }
        return flag;
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyAllAttached() {
        for(Observer observer: observers) {
            observer.update();
        }
    }
}
