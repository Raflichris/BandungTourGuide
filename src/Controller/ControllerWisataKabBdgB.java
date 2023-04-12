
package Controller;

import View.ViewWisataKabBdgB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerWisataKabBdgB extends MouseAdapter implements ActionListener{
    private ViewWisataKabBdgB view;
    
    public ControllerWisataKabBdgB(){
        view = new ViewWisataKabBdgB();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnKulinerKabBdgB())){
            view.dispose();
            new ControllerKulinerKabBdgB();
        } else if(source.equals(view.getBtnNonAlamKabBdgB())){
            view.dispose();
            new ControllerNonAlamKabBdgB();
        } else if(source.equals(view.getBtnAlamKabBdgB())){
            view.dispose();
            new ControllerAlamKabBdgB();
        }else if(source.equals(view.getBtnKWisataKabBdgB())){
            view.dispose();
            new ControllerHalamanUtama();
        }
    }
}