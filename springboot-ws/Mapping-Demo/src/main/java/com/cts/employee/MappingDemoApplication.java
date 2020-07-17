package com.cts.employee;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.dao.DepartmentDao;
import com.cts.employee.entity.Department;
import com.cts.employee.entity.Employee;

@SpringBootApplication
public class MappingDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MappingDemoApplication.class, args);
		DepartmentDao dao = ac.getBean(DepartmentDao.class);

		Employee e1 = new Employee("E1", 1000);
		Employee e2 = new Employee("E2", 2000);
		Employee e3 = new Employee("E3", 3000);
		Employee e4 = new Employee("E4", 4000);
		Employee e5 = new Employee("E5", 5000);
		

		Department d1 = new Department("D1", "L1");
		Department d2 = new Department("D2", "L2");
		Department d3 = new Department("D3", "L3");

		d1.getEmps().add(e1);
		d1.getEmps().add(e2);
		d1.getEmps().add(e3);

		d2.getEmps().add(e4);
		d3.getEmps().add(e5);
		
		d1.setProjId(100000);
		d1.setProjName("P1");
		d2.setProjId(200000);
		d2.setProjName("P2");
		d3.setProjId(300000);
		d3.setProjName("P3");
		
		

		
		

		 dao.saveAll(Arrays.asList(d1,d2,d3));

		
		Department dept = dao.findById(1).orElse(null);
		
		/*
		
		System.out.println(dept.getDeptId());
		System.out.println(dept.getDeptName());
		System.out.println("-----------------------");
		for(Employee emp:dept.getEmps()) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
		}
		
		*/
		
		
		
		
		
		

	}

}
