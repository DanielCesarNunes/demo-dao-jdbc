package application;

<<<<<<< HEAD
import java.util.Date;
import java.util.Locale;

import entities.Department;
import entities.Seller;
=======
import java.util.Locale;

import entities.Department;
>>>>>>> 079cf3056dc1c63ade5c94aec992d05928d76ac5

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);

		Department department = new Department(1, "GTI");
		
		System.out.println(department);
<<<<<<< HEAD
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, department);
		System.out.println(seller);
=======
>>>>>>> 079cf3056dc1c63ade5c94aec992d05928d76ac5
	}

}
