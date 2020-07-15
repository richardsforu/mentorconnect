package com.cts.pss;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.pss.dao.FlightDao;
import com.cts.pss.entity.Fare;
import com.cts.pss.entity.Flight;
import com.cts.pss.entity.Inventory;

@SpringBootApplication
public class FlightAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(FlightAppApplication.class, args);
		
		FlightDao dao = ac.getBean(FlightDao.class);
		
		Flight f1=new Flight("AI-100", "Hyderabad", "Chennai", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(2, 45), new Fare("INT", 4500), new Inventory(150));
		Flight f2=new Flight("AI-150", "Delhi", "Chennai", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(2, 45), new Fare("INT", 1200), new Inventory(150));
		Flight f3=new Flight("6E-250", "Delhi", "Chennai", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(17, 15), new Fare("INT", 4500), new Inventory(150));
		Flight f4=new Flight("6E-400", "Mumbai", "Delhi", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(2, 45), new Fare("INT", 9500), new Inventory(150));
		Flight f5=new Flight("AI-200", "Delhi", "Pune", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(12, 45), new Fare("INT", 4200), new Inventory(150));
		Flight f6=new Flight("AI-500", "Delhi", "Kolkata", "2 Hours 15 Mins", LocalDate.of(2020, 8, 21), LocalTime.of(8, 45), new Fare("INT", 3500), new Inventory(150));

		dao.saveAll(Arrays.asList(f1,f2,f3,f4,f5,f6));
		
		
		
		
		
	}

}
