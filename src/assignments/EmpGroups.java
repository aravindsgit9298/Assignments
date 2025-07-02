package assignments;

public class EmpGroups {

	public static void main(String[] args) {
		
		//Copy Employees class details by creating Object
		Employees employees = new Employees();

		//Create an Array to store employee details
		String[] empNames = new String[3];
		int[] empIds = new int[3];

		//Store employee names from retrived data
		empNames[0] = employees.empName1;
		empNames[1] = employees.empName2;
		empNames[2] = employees.empName3;

		//Store employee IDs from retrived data
		empIds[0] = employees.emp1Id;
		empIds[1] = employees.emp2Id;
		empIds[2] = employees.emp3Id;
		
		//print each employee's name along with their corresponding ID
		System.out.println("Employee Name: "+ empNames[0] +", Employee ID: " + empIds[0]);
		System.out.println("Employee Name: "+ empNames[1] +", Employee ID: " + empIds[1]);
		System.out.println("Employee Name: "+ empNames[2] +", Employee ID: " + empIds[2]);
		
		

	}

}
