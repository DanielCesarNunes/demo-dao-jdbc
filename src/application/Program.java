package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		/*
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
        
		*/
		
		System.out.println();
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("### Teste 7 - Department Insert ###");
		Department dep = new Department(null, "Financeiro");
        //departmentDao.insert(dep);
        System.out.println("Inserted. New ID = " + dep.getId());
        
        System.out.println();
        
       
		System.out.println("### Teste 8 - Department findBYId ###");
		Department dept = departmentDao.findById(3);
		System.out.println(dept);
		
		System.out.println();
		
		System.out.println("### Teste 9 - Department findAll ###");
		List<Department> listd = departmentDao.findAll();
		for(Department d: listd) {
			System.out.println(d);
		}
		
		System.out.println();
		
        
        System.out.println("### Teste 10 - Department Update ###");
        dept = departmentDao.findById(4);
        dept.setName("Protocolo");
        departmentDao.update(dept);
        System.out.println("Update completed.");
        
        System.out.println();
        
        System.out.println("### Teste 11 - Department Delete ###");
        System.out.print("Enter department id: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Deleted.");
	
        
        sc.close();
		
	}

}
