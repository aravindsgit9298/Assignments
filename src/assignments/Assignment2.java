package assignments;

public class Assignment2 {	


	public static void main(String[] args) {


		String[][][] semResult = new String[5][2][6];

		//Sem1 - Subject
		semResult[0][0][0] = "Mathematics I";
		semResult[0][0][1] = "Physics";
		semResult[0][0][2] = "Chemistry";
		semResult[0][0][3] = "Computer Programming";
		semResult[0][0][4] = "Engineering Drawing";
		semResult[0][0][5] = "Basic Electrical Eng.";	

		//Sem1 - Mark
		semResult[0][1][0] = "Pass(78)";
		semResult[0][1][1] = "Pass(85)";
		semResult[0][1][2] = "Fail(21)";
		semResult[0][1][3] = "Pass(74)";
		semResult[0][1][4] = "Pass(88)";
		semResult[0][1][5] = "Pass(79)";

		//Sem2 - Subject
		semResult[1][0][0] = "Mathematics II";
		semResult[1][0][1] = "Mechanics";
		semResult[1][0][2] = "Environmental Sci.";
		semResult[1][0][3] = "Basic Electronics";
		semResult[1][0][4] = "Engineering Physics";
		semResult[1][0][5] = "Engineering Graphics";	

		//Sem2 - Mark
		semResult[1][1][0] = "Pass(82)";
		semResult[1][1][1] = "Pass(77)";
		semResult[1][1][2] = "Pass(93)";
		semResult[1][1][3] = "Fail(19)";
		semResult[1][1][4] = "Fail(24)";
		semResult[1][1][5] = "Pass(90)";

		//Sem3 - Subject
		semResult[2][0][0] = "Data Structures";
		semResult[2][0][1] = "Discrete Mathematics";
		semResult[2][0][2] = "Digital Electronics";
		semResult[2][0][3] = "Operating Systems";
		semResult[2][0][4] = "Signals and Systems";
		semResult[2][0][5] = "Object-Oriented Prog.";	

		//Sem3 - Mark
		semResult[2][1][0] = "Pass(88)";
		semResult[2][1][1] = "Pass(81)";
		semResult[2][1][2] = "Pass(76)";
		semResult[2][1][3] = "Fail(32)";
		semResult[2][1][4] = "Pass(85)";
		semResult[2][1][5] = "Pass(78)";

		//Sem4 - Subject
		semResult[3][0][0] = "Algorithms";
		semResult[3][0][1] = "Computer Networks";
		semResult[3][0][2] = "Database Systems";
		semResult[3][0][3] = "Microprocessors";
		semResult[3][0][4] = "Communication Eng.";
		semResult[3][0][5] = "Software Engineering";	

		//Sem4 - Mark
		semResult[3][1][0] = "Pass(91)";
		semResult[3][1][1] = "Pass(73)";
		semResult[3][1][2] = "Fail(19)";
		semResult[3][1][3] = "Pass(80)";
		semResult[3][1][4] = "Pass(76)";
		semResult[3][1][5] = "Pass(87)";

		//Sem5 - Subject
		semResult[4][0][0] = "Probability Stats";
		semResult[4][0][1] = "Machine Learning";
		semResult[4][0][2] = "Compiler Design";
		semResult[4][0][3] = "Theory of Computation";
		semResult[4][0][4] = "Embedded Systems";
		semResult[4][0][5] = "Computer Graphics";	

		//Sem5 - Mark
		semResult[4][1][0] = "Pass(86)";
		semResult[4][1][1] = "Pass(88)";
		semResult[4][1][2] = "Pass(84)";
		semResult[4][1][3] = "Pass(95)";
		semResult[4][1][4] = "Pass(73)";
		semResult[4][1][5] = "Pass(90)";
		
		//Print Semester 2 Subject 4 and Subject 5 names.
		
		System.out.println("Semester 2 Subject 4 name is " + semResult[1][0][3]);
		System.out.println("Semester 2 Subject 5 name is " + semResult[1][0][4]);
		
		//Print the Status/Marks of Semester 4 Subject 3 and Subject 6
		
		System.out.println("Status/Marks of Semester 4 Subject 3 is " + semResult[3][1][2]);
		System.out.println("Status/Marks of Semester 4 Subject 6 is " + semResult[3][1][5]);




	}

}
