package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		list.add(new Department(null,"Books" ));
		list.add(new Department(null,"Computers" ));
		list.add(new Department(null,"Electronics" ));
		
		return list;
	}
}
