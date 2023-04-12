package Controller;

import View.ViewWisataKabBdg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerWisataKabBdg extends MouseAdapter implements ActionListener{
    private ViewWisataKabBdg view;
    
    public ControllerWisataKabBdg(){
        view = new ViewWisataKabBdg();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnKulinerKabBdg())){
            view.dispose();
            new ControllerKulinerKabBdg();
        } else if(source.equals(view.getBtnNonAlamKabBdg())){
            view.dispose();
            new ControllerAlamKabBdg();
        } else if(source.equals(view.getBtnAlamKabBdg())){
            view.dispose();
            new ControllerNonAlamKabBdg();
        } else if(source.equals(view.getBtnKWisataKabBdg())){
            view.dispose();
            new ControllerHalamanUtama();
        }
    }
}
