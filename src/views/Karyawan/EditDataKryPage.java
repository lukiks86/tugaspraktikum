/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Karyawan;
import java.util.Scanner;
import controllers.KaryawanController;
import Entity.KaryawanEntity;
        


public class EditDataKryPage {
    private Scanner input = new Scanner (System.in);
    private KaryawanController _karyawanC = new KaryawanController();
    
    public void editData() {
        String Nama;
        
        System.out.println("\n===========Edit Data Mahasiswa==========:");
        System.out.println("Masukan Nama yang ingin diubah : ");
        Nama = input.nextLine();
        
        KaryawanEntity kryCari = _karyawanC.cariData(Nama);
        if (kryCari != null){
        } else {
            System.out.println("nama" + Nama+ "Tidak Ditemukan !");
        }
    }
    
    private void inputData(KaryawanEntity kryCari){
        String nama;
        String alamat;
        String NoHP;
        int TglLahir;
        int Umur;
        
        System.out.println("Nama lama : " + kryCari.getnama());
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        
        System.out.println();
        
        System.out.println("Alamat lama : " + kryCari.getalamat());
        System.out.print("Masukan Alamat :");
        alamat = input.nextLine();
        
        System.out.println();
        
        System.out.println("NoHp lama : " + kryCari.getnohp());
        System.out.print("Masukan NoHP :");
        NoHP = input.nextLine();
        
        System.out.println();
        
        System.out.println("TglLahir Lama : " + kryCari.getTglLahir());
        System.out.println("Masukan TglLahir :");
        TglLahir = input.nextInt();
        
        System.out.println();
        
        System.out.println("Umur Lama : " + kryCari.getumur());
        System.out.println("Masukan Umur :");
        Umur = input.nextInt();
        
        boolean status = _karyawanC.updateData(kryCari.getnama(), alamat, NoHP , TglLahir, Umur);
        
        if(status){
            System.out.println("Berhasil Mengubah Data");
        }        
    }
}
