import controllers.LoginController;
import models.Admin;
import models.Karyawan;


public class App {
    
    private void run() {
        LoginController loginController = new LoginController();
        
        loginController.toView();
    }
        
        private static void initialDataDummy() {
            Admin.iniData();
            Karyawan.initialData();
        }
        
        public static void main(String[] args){
           initialDataDummy();
            
            new App().run();
            
        }
}
        
    
    

