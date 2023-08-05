package application;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);

		System.out.println("### Teste 1 - Seller findBYId ###");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("### Teste 2 - Seller findBYDepartment ###");
		Department department = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller s: list) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("### Teste 3 - Seller findAll ###");
		list = sellerDao.findAll();
		for(Seller s: list) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("### Teste 4 - Seller Insert ###");
		Seller seller2 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4275.23, department);
        sellerDao.insert(seller2);
        System.out.println("Inserted. New ID = " + seller2.getId());
		
	}

}
