package com.greatlearning;

public class Driver {

	public static void main(String[] args) {
		
		AdminDepartment admin = new AdminDepartment();
		String adminDepartmentName = admin.departmentName();
		System.out.println("Welcome to " +adminDepartmentName);
		String adminTodaysWork = admin.getTodaysWork();
		System.out.println(adminTodaysWork);
		String adminWorkDeadline = admin.getWorkDeadline();
		System.out.println(adminWorkDeadline);
		String adminHoliday = admin.isTodayAHoliday();
		System.out.println(adminHoliday);
		System.out.println();
		HrDepartment hr = new HrDepartment();
		String hrDepartmentName=hr.departmentName();
		System.out.println("Welcome to " +hrDepartmentName);
		String hrActivity=hr.doActivity();
		System.out.println(hrActivity);
		String hrTodaysWork = hr.getTodaysWork();
		System.out.println(hrTodaysWork);
		String hrWorkDeadline=hr.getWorkDeadline();
		System.out.println(hrWorkDeadline);
		String hrHoliday=hr.isTodayAHoliday();
		System.out.println(hrHoliday);
		System.out.println();
		TechDepartment tech = new TechDepartment();
		String techDepartmentName = tech.departmentName();
		System.out.println("Welcome to " +techDepartmentName);
		String techTodaysWork =tech.getTodaysWork();
		System.out.println(techTodaysWork);
		String techWorkDeadline=tech.getWorkDeadline();
		System.out.println(techWorkDeadline);
		String techStackInformation = tech.getTechStackInformation();
		System.out.println(techStackInformation);
		String techHoliday = tech.isTodayAHoliday();
		System.out.println(techHoliday);
		

	}

}
