/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author maumneto
 */
class FrontEndCode {
    public void typescript() {
        System.out.println("Developing with typescript code.");
    }
}

class BackEndCode {
    public void node() {
        System.out.println("Developing with node code.");
    }
}

class FrameworkFront {
    public void react() {
        System.out.println("Developing front with React");
    }
}


class Coder {
    FrontEndCode front;
    BackEndCode back;
    FrameworkFront framework;
    public Coder() {
        front = new FrontEndCode();
        back = new BackEndCode();
        framework = new FrameworkFront();
    }
    public void devCode() {
        front.typescript();
        back.node();
        framework.react();
    }
}

class WebProject {
    Coder coder;
    public WebProject() {
        coder = new Coder();
    }
    public void developApp() {
        coder.devCode();
        System.out.println("Application Developed!");
    }
}

public class GoodDIPExample {
    public static void main(String[] args) {
        WebProject web = new WebProject();
        web.developApp();
    }
}
