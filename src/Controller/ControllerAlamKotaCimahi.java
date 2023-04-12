/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewAlamKotaCimahi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerAlamKotaCimahi extends MouseAdapter implements ActionListener {
    private ViewAlamKotaCimahi view;
    
    public ControllerAlamKotaCimahi(){
        view = new ViewAlamKotaCimahi();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnKAlamKotaCimahi())){
            view.dispose();
            new ControllerWisataKotaCimahi();
        }
    }
}
