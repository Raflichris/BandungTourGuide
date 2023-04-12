package Controller;

import Model.Database;
import Model.*;
import View.*;
import java.awt.HeadlessException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ControllerSignUp extends MouseAdapter implements ActionListener{
    private ViewSignUp view;
    private Database db;

    public ControllerSignUp() throws Exception {
        view = new ViewSignUp();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       Object source = ae.getSource();
        if (source.equals(view.getBtnSignUp())){
           try {
               btnSignUpActionPerformed();
           } catch (Exception ex) {
               Logger.getLogger(ControllerSignUp.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }
    
    public void btnSignUpActionPerformed() throws Exception{
        String nama = view.getTfNama();
        String username = view.getTfUsername();
        String password = view.getTfPassword();
        String email = view.getTfEmail();
        String nomorhp = view.getTfNomorHP();
        
        if(nama.isEmpty() || username.isEmpty() || password.isEmpty() ||  
            email.isEmpty() || nomorhp.isEmpty()){
            view.showMessage("Semua Data Masih Kosong ", "Error", 0);
        }else if (username.isEmpty()){
                view.showMessage("Username Masih Kosong ", "Error", 0);
        }else if (password.isEmpty()){
                view.showMessage("Password Masih Kosong ", "Error", 0);
        }else if (email.isEmpty()){
                view.showMessage("Email Masih Kosong ", "Error", 0);
        }else if (nomorhp.isEmpty()){
                view.showMessage("Nomor HP Masih Kosong ", "Error", 0);
        }else{
            if (db.cekDuplikatUsername(username)){
                view.showMessage("Username Sudah Terdaftar", "Error", 0); 
            }else {
                db.addUser(new User(nama, username, password, email, nomorhp));
                view.reset();
                view.showMessage("Username Terdaftar", "Success", 1);
                view.dispose();
                new ControllerLogIn(); 
            }
        }
    }
}
