/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewKulinerKotaCimahi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerKulinerKotaCimahi extends MouseAdapter implements ActionListener  {
    private ViewKulinerKotaCimahi view;

    public ControllerKulinerKotaCimahi() {
        view = new ViewKulinerKotaCimahi();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnKKulinerKotaCimahi())){
            view.dispose();
            new ControllerWisataKotaCimahi();
        }
    }
    
}
