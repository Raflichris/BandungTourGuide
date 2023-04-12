package Controller;

import Model.*;
import View.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerHalamanUtama extends MouseAdapter implements ActionListener {
    private ViewHalamanUtama view;
    
    public ControllerHalamanUtama(){
        view = new ViewHalamanUtama();
        view.addActionListener(this);
        view.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnBandungKota())){
            view.dispose();
            new ControllerWisataKotaBdg();
        } else if(source.equals(view.getBtnKabBandung())){
            view.dispose();
            new ControllerWisataKabBdg();
        } else if(source.equals(view.getBtnKabBandungBarat())){
            view.dispose();
            new ControllerWisataKabBdgB();
        } else if(source.equals(view.getBtnCimahi())){
            view.dispose();
            new ControllerWisataKotaCimahi();
        }else if(source.equals(view.getBtnLogOut())){
            view.dispose();
            new ControllerLogIn();           
        }
    }
    
}
