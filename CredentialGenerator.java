package com.gl.emailapp.service;

import com.gl.emailapp.ui.Credential;
import com.gl.emailapp.ui.Employee;
import com.gl.emailapp.ui.Strig;
import com.gl.emailapp.ui.bound;
import com.gl.emailapp.ui.getDepartment;
import com.gl.emailapp.ui.to;

public class CredentialGenerator {

}
private Employee buildEmployeeDetails() {
	ScanneruserInput=newScanner(System.in);
	
	System.out.println("Enter employee's last name:");
	String lastNmae=userInput.nextLine();
	
	System.out.println("Employee's department: ");
	
	System.out.println("1.Technical");
	System.out.println("2.Admin");
	System.out.println("3.Human Resource");
	System.out.println("4.Legal");
	
	System.out.println("select 1/2/3/4 for employee's department");
	
	int departmentID= userInput.nextInt();
	String departmentName=getDepartmentName(departmentID);
	
	Employee employee=new Employee (firstName,lastName,departmentName);
	
	userInput.close();
	return employee;
}

private String getDepartmentName(int departmentID) {
	if(departmentID==1) {
		return"Technical";
		
	}else if (departmentID==2) {
		return"Admin";
	}else if (departmentID==3) {
		return "HumanResource";
	}else if (department ID ==4) {
		return "Legal";
	}else {
		return " ";
	}
}

private void callservice(Employee employee)
{
	CredentialsGenerator generator=new
			CredentialsGenrator(employee);
	
	public void setdepartment (String department) {
		this.getdepartmentName=department;
		
	}
	private Strig firstName:
		private String lastName;
	private String department;
	
	public Employee (String firstName,String lastName,String Department) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=department;
	}
}
public Credential Generator(Employee employee) {
	this.employee=employee;
	
}

public void generate EmailID() {
	String department ShortName=getDepartment ShortName();
	String emailID =employee.getFirstName()to Lowercase()
			+"."+employee.getLastName().toLowercase()
			+"@" + department ShotName + "gl.com";
	this.generatedEmailID=emailID;
}
public void generatedEmailID=emailID;
}
public void generatedPassword() {
}

else if (departmentName.equals("Human Resource"))
{
	return "hr";
}else if (departmentName.equals("Legal")) {
	return"lgl";
}
return " ";
}

public void generatePassword() {
	
	String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters="abcdefghijklmnopqrstuvwxyz";
	String numbers="0123456789";
	String special characters="!@#$%^&*_=+-/.?<>)";
	
	String allvalues=capitalLetters +smallLetters+numbers+special characters
			
			Random random obj=new Random();
	//int random IndexForNumber=newRandom().nextInt(10);
	//number.charAt(randomIndex For Number);
	for (int i=0;i<8;i++) {
		
		int boundValue= allValues.Length();
		int randomIndex =randomObj.nextInt(bound Value);
		char randomchar=allValues.charAt(randomIndex);
		this.generatedPassword[i]=randomchar;
		
	}
	}

public void show Credentials() {
	
	System.out.print("Dear"+employee.getFirstName()+",");
	System.out.println("Your generated credentials are as follows");
	System.out.print("Password:");
	System.out.println(generatedPassword);
}
}
