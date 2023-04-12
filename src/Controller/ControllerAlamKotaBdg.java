/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
import View.ViewAlamKotaBdg;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerAlamKotaBdg extends MouseAdapter implements ActionListener {
    private ViewAlamKotaBdg view;
    private Database db;
    

    public ControllerAlamKotaBdg() {
        view = new ViewAlamKotaBdg();
        db = new Database();
        view.addActionListener(this);
        db.loadWisataAlamBdg();
        view.setVisible(true);
        loadTable();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getBtnKBdgKota())){
            view.dispose();
            new ControllerWisataKotaBdg();
        }
    }
    
    public void loadTable(){
        DefaultTableModel model  = new DefaultTableModel(new String[]{"namaWisata",
            "alamatWisata",
            "noTelpWisata",
            "hargaWisata",
            "jamOperasional"
        },0);
        ArrayList<Wisata> ww = db.getWisata();
        for (Wisata w : ww){
                model.addRow(new Object[]{
                    w.getNamaWisata(),
                    w.getAlamatWisata(),
                    w.getNoTelpWisata(),
                    w.getHargaWisata(), 
                    w.getJamOperasional(),
                });   
        }
    view.settWisataAlamKotaBdg(model);
    }
}
