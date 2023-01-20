/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.admin.DashboardPage;

public class DashboardController {
    
    public void toView() {
        DashboardPage dashboardPage = new DashboardPage();
        
        dashboardPage.menu();
    }
    
}
