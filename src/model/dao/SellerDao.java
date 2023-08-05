package model.dao;

import java.util.List;

import entities.Department;
import entities.Seller;

public interface SellerDao {

	void insert(Seller seller);
	void update(Seller seller);
	void deleteById(Seller seller);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
	
}
