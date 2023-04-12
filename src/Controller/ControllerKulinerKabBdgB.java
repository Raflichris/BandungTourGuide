/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewKulinerKabBdgB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerKulinerKabBdgB extends MouseAdapter implements ActionListener {
    private ViewKulinerKabBdgB view;

    public ControllerKulinerKabBdgB() {
        view = new ViewKulinerKabBdgB();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnKKulinerKabBdgB())){
            view.dispose();
            new ControllerWisataKabBdgB();
        }
    }
}
