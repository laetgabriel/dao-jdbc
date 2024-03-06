package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();
        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);
        System.out.println("\n=== TEST 2: seller findById ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDAO.findByDepartment(department);
        for(Seller obj : sellers){
            System.out.println(obj);
        }
        System.out.println("\n=== TEST 3: seller findById ===");
        sellers = sellerDAO.findAll();
        for(Seller obj : sellers){
            System.out.println(obj);
        }
    }
}
