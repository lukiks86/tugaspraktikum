package Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDWOS
 */
public class AdminEntity {
    private String nama;
    private String username,password;
    
    public AdminEntity(String nama, String username, String password){
        this.nama = nama;
        this.username = username;
        this.password = password;
        
    }
    
    public String getNama() {
        return nama;
    }
    public String getusername () {
        return username;       
    }
    public String getPassword() {
        return password;
    }
    public void setNama(String nama) {
        this.nama =nama;
    }
    public void setusername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password =password;
    }
    
    
}
