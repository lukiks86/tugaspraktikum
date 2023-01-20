/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Karyawan;

import java.util.Scanner;

import controllers.KaryawanController;

public class TambahDataKryPage {
    private Scanner input = new Scanner(System.in);
    private KaryawanController _karyawanC = new KaryawanController();
    
    public void inputData() {
        String nama, alamat, NoHP; 
        int TglLahir, umur;
        
        System.out.println("\n=============Tambah Data Karyawan=========");
        
        System.out.println("Masukan Nama :");
        nama = input.nextLine();
        
        System.out.println("Masukan Alamat :");
        alamat = input.nextLine();
        
        System.out.println("Masukan NoHp");
        NoHP = input.nextLine();
        
        System.out.println("Masukan TglLahir :");
        TglLahir = input.nextLine().indexOf("0"
                + "0");
        
        System.out.println("Masukan Umur ");
        umur = input.nextLine().indexOf("0"
                + "0");
        
        boolean status = _karyawanC.tambahData(nama, alamat, NoHP, TglLahir, umur);
        
        if (status) {
            System.out.println("Berhasil Menambahkan Data");
        }else {
            System.out.println("Gagal Menambahkan Data");
            System.out.println("Nama" + nama + "Sudah Terdaftar") ;
        }
    }
}
