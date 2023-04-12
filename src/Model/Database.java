package Model;

import java.sql.*;
import Model.*;
import java.text.ParseException;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<User> user = new ArrayList<>();
    private ArrayList<Wisata> wisata = new ArrayList<>();
    private ArrayList<WisataAlam> wisataalam = new ArrayList<>();
    private ArrayList<KotaBdg> kotabdg = new ArrayList<>();
    
    public Database() {
        loadUser();
    }
    
    public void clearDataArray(){
        user.clear();
        wisata.clear();
        
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/db_bdgtourguide";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadUser() {
        connect();
        try {
            String query = "SELECT * FROM user";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                user.add(new User(rs.getString("nama"), 
                    rs.getString("username"),
                    rs.getString("password"), 
                    rs.getString("email"), 
                    rs.getString("nomorhp"))
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<User> getUser() {
        return user;
    }
    
    public void addUser(User u) {
        
        connect();
            
        /*String query = "INSERT INTO user VALUES (";
            query += "'" + u.getNama() + "',";
            query += "'" + u.getUsername() + "',";
            query += "'" + u.getPassword() + "',";
            query += "'" + u.getEmail() + "',";
            query += "'" + u.getNomorhp() + "',";
            query += "" + "0" + "";
            query += ")";*/
            
        /*String query = "INSERT INTO user (`nama`, `username`, `password`, `email`, `nomorHP`) VALUES "
                + "('" + u.getNama() + "', "
                + "'" + u.getUsername() + "', "
                + "'" + u.getPassword() + "', "
                + "'" + u.getEmail() + "', "
                + "'" + u.getNomorhp() + "', "
                + "'0');";*/
        
        /*"INSERT INTO users (`username`, `rank`, `xoins`) VALUES ('" + pname + "', '0');");*/
        
        int users = 0;
        
        String sql = "INSERT INTO user(nama,username,password,email,nomorhp) "
                    + "VALUES(?,?,?,?,?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
            
            // set parameters for statement
            pstmt.setString(1, u.getNama());
            pstmt.setString(2, u.getUsername());
            pstmt.setString(3, u.getPassword());
            pstmt.setString(4, u.getEmail());
            pstmt.setString(5, u.getNomorhp());
 
            int rowAffected = pstmt.executeUpdate();
            if(rowAffected == 1)
            {
                // Get users
                rs = pstmt.getGeneratedKeys();
                if(rs.next())
                    users = rs.getInt(1);
                    user.add(u);
 
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(rs != null)  rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        
        
        //if (manipulate(sql)) user.add(u);
        disconnect();
    }
    
    public boolean cekDuplikatUsername(String username){
        boolean cek = false;
        for (User usr : user) {
            if (usr.getUsername().equals(username)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public boolean cekDuplikatPassword(String username,String password){
        boolean cek = false;
        for (User usr : user) {
            if (usr.getPassword().equals(password) && usr.getUsername().equals(username)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public void loadWisataAlamBdg(){
        connect();
        try {
            String query = "SELECT * FROM wisataalamkotabdg;";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                wisata.add(new Wisata(rs.getString("namaWisata"), 
                    rs.getString("alamatWisata"), 
                    rs.getString("noTelpWisata"), 
                    rs.getInt("hargaWisata"), 
                    rs.getString("jamOperasional")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void forgetPassword(String username) throws Exception{
        connect();
        String query = "UPDATE user SET password = 'passwordBaru' WHERE username ='"+username+"';";
        manipulate(query);
        disconnect();
    }

    public ArrayList<Wisata> getWisata() {
        return wisata;
    }
}

