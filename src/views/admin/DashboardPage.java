/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.admin;

import java.util.ArrayList;
import java.util.Scanner;
import Entity.KaryawanEntity;
import models.Karyawan;
import views.Karyawan.*;

public class DashboardPage {
    private Scanner input = new Scanner(System.in);
    
    public void menu (){
        int pilihMenu = -1;
        
        do {
            System.out.println("\n=============DATA KARYAWAN========");
            
            System.out.print ("""
                              1. Cetak Data
                              2.Tambah Data
                              3.Ubah Data
                              4.Hapus Data
                              5.Keluar
                              Masukan Menu :""");
            
            pilihMenu = input.nextInt();
            input.nextLine();
            
            switchMenu(pilihMenu);
            
        }while (pilihMenu != 0);
    }
    
    private void switchMenu(int menu){
        switch (menu) {
            case 1:
                cetakData();
                break;
            case 2:
                // pindah view : langusng tembak ke class view
                new TambahDataKryPage().inputData();
                break;
            case 3:
                // pindah view : langsung tembak ke class view
                new EditDataKryPage().editData();
                break;
            case 4:
                //pindah view : langusng tembak ke class view
                new HapusDataKryPage().hapusData();
                break;
            case 0:
                System.out.println("bye...");
                break;
            default :
                System.out.println("Menu Tidak Valid !");
                break;
                
        }
    }
    
    private void cetakData() {
        ArrayList<KaryawanEntity> KryList = Karyawan.all();
        
        System.out.println("\n=================Cetak Data Karyawan=========");
        for (KaryawanEntity kry : KryList) {
            System.out.println("=======================");
            System.out.println("Nama        : " + kry.getnama());
            System.out.println("Alamat      : " + kry.getalamat());
            System.out.println("NoHP        : " + kry.getnohp());
            System.out.println("TglLahir    : " + kry.getTglLahir());
            System.out.println("umur        : " + kry.getumur());
            System.out.println("===========================================");
                   
        }
    }
    
}
