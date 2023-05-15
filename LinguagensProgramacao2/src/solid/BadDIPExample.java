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

class WebProject {
    public FrontEndCode frontend;
    public BackEndCode backend;
    public FrameworkFront react;
    public WebProject() {
        frontend = new FrontEndCode();
        backend = new BackEndCode();
        react = new FrameworkFront();
    }
    public void developApp() {
        frontend.typescript();
        react.react();
        backend.node();
        System.out.println("Application Developed!");
    }
}


public class BadDIPExample {
    public static void main(String[] args) {
        WebProject webproject = new WebProject();
        webproject.developApp();
    }
}
