/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author maumneto
 */
public final class View extends JFrame {
    public static final int PLUS = 1;
    public static final int MINUS = 2;
    public static final int MULT = 3;
    public static final int DIV = 4;

    JTextField textEnter1, textEnter2;
    JButton button, plusButton, minusButton, multButton, divButton;
    JLabel label;
    
    private int operationSelected = 0;

    public int getOperationSelected() {
        return operationSelected;
    }
    
    public View() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        textEnter1 = new JTextField(5);
        add(textEnter1);
        plusButton = new JButton("+");
        add(plusButton);
        minusButton = new JButton("-");
        add(minusButton);
        multButton = new JButton("*");
        add(multButton);
        divButton = new JButton("/");
        add(divButton);
        textEnter2 = new JTextField(5);
        add(textEnter2);
        label = new JLabel(" Result: -");
        add(label);

        button = new JButton("run");
        add(button);

        setOperationButtonBehavior();
        pack();
        setSize(300, 300);
        setVisible(true);      
    }
    
    public String getFirstNumber() {
        return textEnter1.getText();
    }

    public String getSecondNumber() {
        return textEnter2.getText();
    }

    public void setButtonBehaviorResult(ActionListener buttonBehavior) {
        button.addActionListener(buttonBehavior);
    }
    
    private void setOperationSelected(int operationSelected) {
        this.operationSelected = operationSelected;
    }

    public void setOperationButtonBehavior() {
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperationSelected(PLUS);
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperationSelected(MINUS);
            }
        });

        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperationSelected(MULT);
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperationSelected(DIV);
            }
        });
    }

    public void setLabel(String result) {
        label.setText("result: "+ result);
    }
}
