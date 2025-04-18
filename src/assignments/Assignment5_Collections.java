package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Collections {
	
	public static void main(String[] args) {
		
//StudentDetails		
		HashMap<String,String> student1 = new HashMap<String,String>();
	    student1.put("name", "John Doe");
	    student1.put("Age", "20");
	    student1.put("Gender", "Male");
	    student1.put("Roll Number", "S12345");
	    student1.put("Grade", "1");
	    student1.put("Major", "Computer Science");
	    student1.put("GPA", "3.8");
	    student1.put("Email", "john@example.com");
	    student1.put("Contact", "9876543210");
	    student1.put("Address", "123 Elm St");
	    
	    Map<String,String> student2 = new HashMap<String,String>();
	    student2.put("name", "Jane Smith");
	    student2.put("Age", "21");
	    student2.put("Gender", "Female");
	    student2.put("Roll Number", "S12346");
	    student2.put("Grade", "A");
	    student2.put("Major", "mathematics");
	    student2.put("GPA", "3.5");
	    student2.put("Email", "jane@example.com");
	    student2.put("Contact", "9876543211");
	    student2.put("Address", "456 Oak St"); 
	    
	    Map<String,String> student3 = new HashMap<String,String>();
	    student3.put("name", "Mike Brown");
	    student3.put("Age", "22");
	    student3.put("Gender", "male");
	    student3.put("Roll Number", "S12347");
	    student3.put("Grade", "A");
	    student3.put("Major", "Physics");
	    student3.put("GPA", "3.9");
	    student3.put("Email", "mike@example.com");
	    student3.put("Contact", "9876543213");
	    student3.put("Address", "789 Pine St"); 
	    
	    List<Map<String,String>> studentDetails = new ArrayList<Map<String,String>>();
	    studentDetails.add(student1);
	    studentDetails.add(student2);
	    studentDetails.add(student3);
	    
	//EmployeeDetails
	    
	    HashMap<String,String> employee1 = new HashMap<String,String>();
	    employee1.put("Employee ID", "E001");
	    employee1.put("Name", "Alice Green");
	    employee1.put("Age", "30");
	    employee1.put("Gender", "Female");
	    employee1.put("Department", "Engineering");
	    employee1.put("Position", "Software Engineer");
	    employee1.put("Salary", "75,000");
	    employee1.put("Email", "alice@example.com");
	    employee1.put("Contact Number", "9876543213");
	    
	    HashMap<String,String> employee2 = new HashMap<String,String>();
	    employee2.put("Employee ID", "E002");
	    employee2.put("Name", "Bob Johnson");
	    employee2.put("Age", "35");
	    employee2.put("Gender", "male");
	    employee2.put("Department", "Marketing");
	    employee2.put("Position", "Marketing Manager");
	    employee2.put("Salary", "85,000");
	    employee2.put("Email", "bob@example.com");
	    employee2.put("Contact Number", "9876543214");
	    
	    HashMap<String,String> employee3 = new HashMap<String,String>();
	    employee3.put("Employee ID", "E003");
	    employee3.put("Name", "Carol White");
	    employee3.put("Age", "28");
	    employee3.put("Gender", "Female");
	    employee3.put("Department", "Sales");
	    employee3.put("Position", "Sales Manager");
	    employee3.put("Salary", "65,000");
	    employee3.put("Email", "carol@example.com");
	    employee3.put("Contact Number", "9876543215");
	    
	    List<Map<String,String>> employeeDetails = new ArrayList<Map<String,String>>();
	    employeeDetails.add(employee1);
	    employeeDetails.add(employee2);
	    employeeDetails.add(employee3);
	    
//ProductDetails
	    
	    HashMap<String,String> product1 = new HashMap<String,String>();
	    product1.put("Product ID", "P001");
	    product1.put("Name", "Laptop");
	    product1.put("Category", "Electronics");
	    product1.put("Price", "$1,200");
	    product1.put("Stock Quantity", "50");
	    product1.put("Supplier", "Tech Supplies");
	    product1.put("Warranty", "2years");
	    product1.put("Rating", "4.5");
	    product1.put("Manufacturing Date", "1/15/2023");
	    product1.put("Expiry Date", "1/15/2025");
	    
	    HashMap<String,String> product2 = new HashMap<String,String>();
	    product2.put("Product ID", "P002");
	    product2.put("Name", "Desk Chair");
	    product2.put("Category", "Furniture");
	    product2.put("Price", "$150");
	    product2.put("Stock Quantity", "100");
	    product2.put("Supplier", "Office Depot");   // need to display
	    product2.put("Warranty", "1 years");
	    product2.put("Rating", "4");
	    product2.put("Manufacturing Date", "2/10/2023");
	    product2.put("Expiry Date", null);
	    
	    
	    HashMap<String,String> product3 = new HashMap<String,String>();
	    product3.put("Product ID", "P003");
	    product3.put("Name", "Coffee Maker");
	    product3.put("Category", "Kitchen");
	    product3.put("Price", "$75");
	    product3.put("Stock Quantity", "200");
	    product3.put("Supplier", "KitchenWorld");   
	    product3.put("Warranty", "6 Months");
	    product3.put("Rating", "4.2");
	    product3.put("Manufacturing Date", "3/20/2023");
	    product3.put("Expiry Date", "3/20/2024");
	    
	    List<Map<String,String>> productDetails = new ArrayList<Map<String,String>>();
	    productDetails.add(product1);
	    productDetails.add(product2);
	    productDetails.add(product3);
	    
	   Map<String,List<Map<String,String>>> data = new HashMap<String,List<Map<String,String>>>();
	   
	   data.put("studentData", studentDetails);
	   data.put("employeeData",employeeDetails);
	   data.put("productData", productDetails);
	   
	   
	   System.out.println(data);
       System.out.println("The name of the supplier is-->"+data.get("productData").get(1).get("Supplier"));
	    
	    
	    
	}

		
}
