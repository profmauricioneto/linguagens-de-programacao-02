package designpatterns.singleton.firstexample;

/**
 *
 * @author maumneto
 */
public class SingletonExample {
    private static SingletonExample instance = null;
    
    private SingletonExample(){}
    
    public static synchronized SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        } return instance;
    }
}
