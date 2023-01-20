/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Karyawan;

import java.util.Scanner;
import controllers.KaryawanController;
import Entity.KaryawanEntity;

public class HapusDataKryPage {
    private Scanner input = new Scanner(System.in);
    private KaryawanController _karyawanC = new KaryawanController();
    
    public void hapusData() {
        String Nama ;
        
        System.out.println("/n===========Hapus Data Mahasiswa========");
        
        System.out.print("Masukan Nama yang ingin dihapus :");
        Nama = input.nextLine();
        
        KaryawanEntity kryCari = _karyawanC.cariData(Nama);
        if (kryCari != null) {
            _karyawanC.removeData(Nama);
            System.out.println("Berhasil Menghapus Data");
            
        } else {
            System.out.println("Nama" + Nama + "Tidak Ditemukan !");
    }
    } 
}
