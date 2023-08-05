package application;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

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
		Seller seller2 = new Seller(null, "Daniel", "dan@gmail.com", new Date(), 4250.00, department);
        sellerDao.insert(seller2);
        System.out.println("Inserted. New ID = " + seller2.getId());
        
        System.out.println();
        
        System.out.println("### Teste 5 - Seller Update ###");
        seller = sellerDao.findById(11);
        seller.setName("Martha Campos");
        seller.setEmail("martha@hotmail.com");
        sellerDao.update(seller);
        System.out.println("Update completed.");
        
        System.out.println();
        System.out.println("### Teste 6 - Seller Delete ###");
        System.out.print("Enter seller id: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Deleted.");
        
        sc.close();
		
	}

}
