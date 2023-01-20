/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Entity.AdminEntity;
import models.Admin;
import views.LoginPage;

public class LoginController {
    
    public void toView () {
        LoginPage loginPage = new LoginPage ();
        loginPage.formLogin();
    }
    
    
    public boolean loginProccess(String username, String password) {
        
        AdminEntity adminEntity = Admin.findUsername(username);
        
        if (adminEntity != null){
            if (adminEntity.getPassword().equals(password)){
                return true;
            }
        }
        
        return false;
    }
}
