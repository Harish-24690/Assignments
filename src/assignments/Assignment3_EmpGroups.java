package assignments;

public class Assignment3_EmpGroups extends Assignment3_Employees {
	
	
	
	public static void main(String[] args) {
		Object[][] empData = new Object[2][3];
		
		Assignment3_EmpGroups data = new Assignment3_EmpGroups();
		empData[0][0]= data.employeeName1;
	    empData[0][1]= data.employeeName2;
	    empData[0][2]= data.employeeName3;
	    
	    empData[1][0]=data.employeeId1;
	    empData[1][1]=data.employeeId2;
	    empData[1][2]=data.employeeId3;
	    
	    System.out.println("First Employee is-->"+empData[0][0]+ " and id is-->"+empData[1][0]);
	    System.out.println("First Employee is-->"+empData[0][1]+ " and id is-->"+empData[1][1]);
	    System.out.println("First Employee is-->"+empData[0][2]+ " and id is-->"+empData[1][2]);
	}
}
