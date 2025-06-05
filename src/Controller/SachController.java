package Controller;

import Model.SachModel;
import View.SachView;
import dao.SachDAO;

import java.util.ArrayList;

public class SachController {
    private SachView view;
    private SachDAO dao;
    public SachController(){
        view = new SachView();
        dao = SachDAO.getInstance();
    }
    public void run(){
        while (true){
            int choice = view.Menu();
            switch (choice){
                case 1:
                    ArrayList<SachModel> danhsach = dao.selectAll();
                    view.XuatDanhSach(danhsach);
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh");
                    return;
                default:
                    System.out.println("Khong hop le!!!");
            }
        }
    }
}
