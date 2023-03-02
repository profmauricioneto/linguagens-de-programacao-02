/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicoop;

/**
 *
 * @author maumneto
 */
public class Television {
    public static void main(String[] args) {
        Remote remote = new Remote();
        remote.increaseChannel();
        for(int i = 0; i < 10; i++) {
            remote.increaseVolume();
        }
        remote.showStatus();
        remote.changeChannel(143);
        remote.showStatus();
    }
}
