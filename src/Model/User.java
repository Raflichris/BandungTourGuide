package Model;

import java.io.Serializable;
import java.util.*;

public class User{
    private String nama;
    public String username;
    private String password;
    private String email;
    private String nomorhp;

    public User() {
    }
    
    public User(String nama, String username, String password, String email, String nomorhp) {
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.email = email;
        this.nomorhp = nomorhp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }
    
    
}
