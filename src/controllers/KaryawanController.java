/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Entity.KaryawanEntity;
import models.Karyawan;

 
public class KaryawanController {
    
    public void ambilData(){
        
    }
    
public boolean tambahData(String nama, String alamat,String noHP, int TglLahir,int umur) {
    
    // cek apakah nama sudah terdaftar atau belum
    if (Karyawan.findNama(nama)== null) {
        //jika belum terdaftar maka lanjutkan proses INSERT
        
        // buat Object Entitas
        KaryawanEntity kryBaru = new KaryawanEntity(nama, alamat, noHP, TglLahir, umur);
        
        //kirim ke model
        Karyawan.insert(kryBaru);
        
        return true;
    }
    
    return false;
}

public KaryawanEntity cariData(String nama){
    return Karyawan.findNama(nama);
}

public boolean updateData(String NamaLama, String NoHP, String alamat, int TglLahir, int umur){
    
    // buat Object Entitas
    KaryawanEntity kryBaru = new KaryawanEntity(NamaLama, NoHP, alamat, TglLahir, umur);
    
    // kirim ke model
    Karyawan.update(kryBaru);
    
    return true;
    
}

public void removeData(String nama){
    Karyawan.findNama(nama);
}


}

    
