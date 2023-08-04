package application;

import java.util.Locale;

import entities.Department;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);

		Department department = new Department(1, "GTI");
		
		System.out.println(department);
	}

}
