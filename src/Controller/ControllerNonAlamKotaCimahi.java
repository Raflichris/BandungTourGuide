/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewNonAlamKotaCimahi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerNonAlamKotaCimahi extends MouseAdapter implements ActionListener {
    private ViewNonAlamKotaCimahi view;

    public ControllerNonAlamKotaCimahi() {
        view = new ViewNonAlamKotaCimahi();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnKNonAlamKotaCimahi())){
            view.dispose();
            new ControllerWisataKotaCimahi();
        }
    }
}
