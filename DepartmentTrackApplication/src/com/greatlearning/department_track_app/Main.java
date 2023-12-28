package com.greatlearning.department_track_app;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodayWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.println(" ");
		
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodayWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println(" ");
		
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodayWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		
		System.out.println(" ");
	}

}
