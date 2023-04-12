/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewNonAlamKotaBdg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerNonAlamKotaBdg extends MouseAdapter implements ActionListener {
    private ViewNonAlamKotaBdg view;

    public ControllerNonAlamKotaBdg() {
        view = new ViewNonAlamKotaBdg();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnKNonAlamKotaBdg())){
            view.dispose();
            new ControllerWisataKotaBdg();
        }
    }
    
}
