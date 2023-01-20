/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Scanner;

import controllers.DashboardController;
import controllers.LoginController;
public class LoginPage {
    private Scanner input = new Scanner(System.in);
    private LoginController _loginC = new LoginController();
    
    public void formLogin() {
        while (true) {
            String username, password;
            
            System.out.println("--------Login Admin-------");
            System.out.println("Masukan Username: ");
            username = input.nextLine();
            
            System.out.println("Masukan Password:");
            password = input.nextLine();
            
            boolean status = _loginC.loginProccess(username, password);
            
            if (status) {
                
                new DashboardController().toView();
                
            } else {
                loginError("username atau Password SALAH !");
                System.out.println();
            }
        }
    }
    
    private void loginError(String error) {
        System.out.println("Login Failed:" + error);
    }
    
}
