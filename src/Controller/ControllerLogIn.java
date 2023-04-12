package Controller;

import Model.Database;
import Model.*;
import View.ViewLogIn;
import java.awt.HeadlessException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.event.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ControllerLogIn extends MouseAdapter implements ActionListener {
    private ViewLogIn view;
    private Database db;
    private User u;
    private static String username;

    public ControllerLogIn() {
        view = new ViewLogIn();
        db = new Database();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // Login
        if (source.equals(view.getBtnLogIn())){
            btnLogInActionPerformed();
        }
        // SignUp
        else if (source.equals(view.getBtnSignUp())){
//            view.dispose();
//            try {
//                new ControllerSignUp();
//            } catch (Exception ex) {
//                Logger.getLogger(ControllerLogIn.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        // LupaPass
        else if (source.equals(view.getBtnLupaPass())){
            view.dispose();
            //new ControllerLupaPass();
        }
    }

    private void btnLogInActionPerformed() {
        String username = view.getTfUsername();
        String password = view.getTfPassword();
        if (username.isEmpty() && password.isEmpty()){
            view.showMessage("Anda Belum memasukkan Username dan Password", "Error", 0);
        }else if (username.isEmpty() ){
                view.showMessage("Anda Belum memasukkan Username", "Error", 0);
        }else if ( password.isEmpty() ){
                view.showMessage("Anda Belum memasukkan Password", "Error", 0);
        }else{
            if (!db.cekDuplikatUsername(username)){
                view.showMessage("Username Salah atau Belum Terdaftar","Error", 0);
            }else{
                if(!db.cekDuplikatPassword(username,password)){
                view.showMessage("Password Salah atau Belum Terdaftar","Error", 0);
                }else {
                    ControllerLogIn.username = username;
                    view.dispose();
                    new ControllerHalamanUtama();
                }
            }
        }  
    }  
}