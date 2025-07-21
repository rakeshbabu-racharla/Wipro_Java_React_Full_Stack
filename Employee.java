class Employee {
	
	int employee_id ;
	String employee_name ;
	static String employee_company = "Wipro" ;
	int employee_salary ;

	// Non-static variables are being initialized
	Employee(int employee_id , String employee_name , int employee_salary ) {
		this.employee_id = employee_id ;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;	
	}

	// Method display Employee details
	public void showEmployeeDetails(){
		System.out.println("Employee Id: " + employee_id);
		System.out.println("Employee Name: " + this.employee_name);
		System.out.println("Employee Company : " + employee_company);
	}

	// Method to return employee_salary
	public int getEmployeeSalary(){
		return this.employee_salary ;
	}

	// Method to display employee_company
	public void showEmployeeCompany(){
		System.out.println(employee_company);
	}

	// Main method ( execution starting point)
	public static void main(String[] args){
		// Employee object created with values 101 , "Ram" , 30000
		Employee e1 = new Employee(101,"Ram",30000);
		e1.showEmployeeDetails();
		System.out.println(e1.getEmployeeSalary());
		e1.showEmployeeCompany();
	}

}
