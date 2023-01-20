/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author WINDWOS
 */
public class KaryawanEntity {
    private String nama,alamat,noHP;
    private int TglLahir,umur;
    
    public KaryawanEntity(String nama, String alamat, String noHP, int TglLahir, int umur ){
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.TglLahir = TglLahir;
        this.umur = umur;
                
    }
    
    public String getnama() {
        return nama;
    }
    
    public String getalamat() {
        return alamat;
    }
    
    public String getnohp () {
        return noHP;
    }
    
    public int getTglLahir () {
        return TglLahir;
    }
    
    public int getumur () {
        return umur;
    }
    
    public void setnama (String nama){
        this.nama = nama;
    }
    
    public void setalamat (String alamat){
        this.alamat = alamat;
    }
    
    public void setnoHP (String noHP){
        this.noHP = noHP;
    }
    
    public void setTglLahir (int TglLahir){
        this.TglLahir = TglLahir ;
    }
    
    public void setumur (int umur){ 
        this.umur = umur;
    }      
    
}
