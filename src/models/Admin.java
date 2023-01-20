/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

import Entity.AdminEntity;

public class Admin {
    private static ArrayList<AdminEntity> KaryawanList = new ArrayList<>();
    
    public static void iniData() {
        AdminEntity admin = new AdminEntity("luki", "luki", "budi");
        KaryawanList.add(admin);

    }
    public static AdminEntity findUsername(String username) {
        for (AdminEntity adminEntity : KaryawanList) {
            if (adminEntity.getusername().equals(username)) {
                return adminEntity;
            }
        }
        return null;
    }
    
}
