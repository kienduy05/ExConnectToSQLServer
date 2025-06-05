package Controller;

import Model.LoginModel;
import View.LoginView;

public class LoginController {
    private LoginView view;
    private LoginModel model;
    public LoginController(){
        view = new LoginView();
        model = new LoginModel();
    }
    public LoginController(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;
    }
    public boolean Login(){
        LoginModel newAcc = view.Login();
        if(newAcc.getTk().equals("admin") && newAcc.getMk().equals("123")){
            model = newAcc;
            return true;
        }
        return false;
    }
}
