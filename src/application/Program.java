package application;

import java.util.Date;
import java.util.Locale;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);

		Department department = new Department(1, "GTI");
		
		System.out.println(department);

		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, department);
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

	}

}
