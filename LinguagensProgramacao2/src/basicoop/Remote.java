/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicoop;

/**
 *
 * @author maumneto
 */
public class Remote {
    int volume;
    int channel;
    
    public Remote() {
        this.volume = 0;
        this.channel = 100;
    }
    
    public void increaseVolume() {
        this.volume++;
    }
    public void decreaseVolume() {
        this.volume--;
    }
    public void increaseChannel() {
        this.channel++;
    }
    public void decreaseChannel() {
        this.channel--;
    }
    public void changeChannel(int channel) {
        this.channel = channel;
    }
    public void showStatus() {
        System.out.println("Channel: " + this.channel);
        System.out.println("Volume: " + this.volume);
    }
}
