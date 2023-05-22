/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author maumneto
 */
public class Controller {
    Model model;
    View view;
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        view.setButtonBehaviorResult(new ButtonBehavior());
    }
    class ButtonBehavior implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String textNumber1 = view.getFirstNumber();
            String textNumber2 = view.getSecondNumber();
            
            double number1 = Double.parseDouble(textNumber1);
            double number2 = Double.parseDouble(textNumber2);
            model.setNumbers(number1, number2);
            switch (view.getOperationSelected()) {
                case View.PLUS : {
                    model.sum();
                    break;
                }
                case View.MINUS: {
                    model.subtraction();
                    break;
                }
                case View.MULT: {
                    model.multiply();
                    break;
                }
                case View.DIV: {
                    model.divide();
                    break;
                }
            }
            double result = model.getResult();
            
            String textResult = String.valueOf(result);
            view.setLabel(textResult);
        }
    }
}
