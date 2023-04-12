/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewWisataKotaCimahi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerWisataKotaCimahi extends MouseAdapter implements ActionListener {
    private ViewWisataKotaCimahi view;
    
    public ControllerWisataKotaCimahi(){
        view = new ViewWisataKotaCimahi();
        view.addActionListener(this);
        view.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnKWisataKotaCimahi())){
            view.dispose();
            new ControllerHalamanUtama();
        }else if(source.equals(view.getBtnAlamKotaCimahi())){
            view.dispose();
            new ControllerAlamKotaCimahi();
        }else if(source.equals(view.getBtnKulinerKotaCimahi())){
            view.dispose();
            new ControllerKulinerKotaCimahi();
        }else if(source.equals(view.getBtnNonAlamKotaCimahi())){
            view.dispose();
            new ControllerNonAlamKotaCimahi();
        }
    }
}
