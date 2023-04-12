package Controller;

import View.ViewWisataKotaBdg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerWisataKotaBdg extends MouseAdapter implements ActionListener {
    private ViewWisataKotaBdg view;
    
    public ControllerWisataKotaBdg(){
        view = new ViewWisataKotaBdg();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnKulinerBdgKota())){
            view.dispose();
            new ControllerKulinerKotaBdg();
        } else if(source.equals(view.getBtnNonAlamBdgKota())){
            view.dispose();
            new ControllerNonAlamKotaBdg();
        } else if(source.equals(view.getBtnAlamBdgKota())){
            view.dispose();
            new ControllerAlamKotaBdg();
        } else if(source.equals(view.getBtnKWisataKotaBdg())){
            view.dispose();
            new ControllerHalamanUtama();
        }
    }
}
