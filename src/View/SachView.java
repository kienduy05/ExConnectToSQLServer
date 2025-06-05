package View;

import Model.SachModel;

import java.util.ArrayList;
import java.util.Scanner;

public class SachView {
    private Scanner sc = new Scanner(System.in);

    public int Menu(){
        int choice;
        System.out.println("MENU----");
        System.out.println("1. Xuat danh sach sach");
        System.out.println("0. Thoat");

        try {
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Vui long nhap dung dinh dang so");
            choice=0;
        }
        return choice;
    }
    public void XuatDanhSach(ArrayList<SachModel> ds){
        for(SachModel sach:ds){
            System.out.println(sach);
        }
    }
}
