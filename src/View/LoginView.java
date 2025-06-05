package View;

import Model.LoginModel;

import java.util.Scanner;

public class LoginView {
    private Scanner sc = new Scanner(System.in);

    public LoginModel Login(){
        System.out.println("Nhap tk: ");
        String tk = sc.nextLine();
        System.out.println("Nhap mk: ");
        String mk = sc.nextLine();
        LoginModel acc = new LoginModel(tk,mk);
        return acc;
    }


}
