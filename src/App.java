import Controller.LoginController;
import Controller.SachController;

public class App {
    private LoginController loginController = new LoginController();
    private SachController sachController= new SachController();
    public void Run(){
        int i=0;
        while(i<3){
            if(loginController.Login()){
                sachController.run();
                return;
            }
            else{
                System.out.println("Sai tk mk!!!");
                i++;
            }
        }
        System.out.println("Ban da nhap qua 3 lan!! Thoat chuong trinh");
    }
}
