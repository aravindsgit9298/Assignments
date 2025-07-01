package assignments;

public class EmpGroups {

	public static void main(String[] args) {
		
		Employees employees = new Employees();
		
		String[] empNames = new String[3];
		int[] empIds = new int[3];
		
		empNames[0] = employees.empName1;
		empNames[1] = employees.empName2;
		empNames[2] = employees.empName3;
		
		empIds[0] = employees.emp1Id;
		empIds[1] = employees.emp2Id;
		empIds[2] = employees.emp3Id;
		
		
		System.out.println("Employee Name: "+ empNames[0] +", Employee ID: " + empIds[0]);
		System.out.println("Employee Name: "+ empNames[1] +", Employee ID: " + empIds[1]);
		System.out.println("Employee Name: "+ empNames[2] +", Employee ID: " + empIds[2]);
		
		

	}

}
