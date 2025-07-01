package assignments;

public class Assignment1 {


	/***Assignment 1 – Data Types***/

	//1. Temperature of a city in degrees Celsius: 25.5
	float tempDegree = 25.5f;

	//2. Whether a customer has placed an order: true or false
	boolean customerOrderYes = true;
	boolean customerOrderNo = false;

	//3. Person's phone number: "123-456-7890"
	String phnNumber = "123-456-7890";

	//4. Amount of money in a customer's bank account: 1000.50
	float bankBalance = 1000.50f;

	//5. Person's email address: "john.doe@example.com"
	String emailId = "john.doe@example.com";

	//6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
	float[] Coordinates = {37.7749f,-122.4194f};


	//7. Person's marital status: true or false
	boolean[] maritalStatus = {true,false};

	//8. Person's occupation: "Software Engineer"
	String occupation = "Software Engineer";

	//9. Person's favourite colour: "Blue"
	String favColour = "Blue";

	//10.Current year: 2023
	int currentYear = 2023;

	//11.Number of followers on a social media platform: 1,000,000
	String followers = "1,000,00";


	//12.Rating of a movie: 7.5
	float movieRating = 7.5f;

	//13.Person's blood type: 'A'
	char bloodType = 'A';

	//14.Title of a book: "To Kill a Mockingbird"
	String bookTitle = "To Kill a Mockingbird";

	//15.Number of employees in a company: 500
	int noOfEmployees = 500;

	//16.Time of an event: 2:30 PM
	String time = "2:30 PM";

	//17.Name of a country: "United States"
	String country = "United States";		

	//18.Person's eye color: "Brown"
	String eyeColor = "Brown";

	//19.Person's birthplace: "New York City"
	String birthplace = "New York City";

	//20.Distance between two cities: 200.5
	float distance = 200.5f;


	public static void main(String[] args) {

		Assignment1 assignment = new Assignment1();

		System.out.println("1. Temperature of a city in degrees Celsius: "+ assignment.tempDegree);
		System.out.println("2. Whether a customer has placed an order: "+ assignment.customerOrderYes +" or " + assignment.customerOrderNo);
		System.out.println("3. Person's phone number: "+"\""+ assignment.phnNumber+"\"");
		System.out.printf("4. Amount of money in a customer's bank account: %.2f%n", assignment.bankBalance);
		System.out.println("5. Person's email address: "+"\""+ assignment.emailId+"\"");
		System.out.printf("6. Coordinates of a location (latitude, longitude): %.4f, %.4f%n", assignment.Coordinates[0], assignment.Coordinates[1]);
		System.out.println("7. Person's marital status: "+ assignment.maritalStatus[0]+" or "+ assignment.maritalStatus[1]);
		System.out.println("8. Person's occupation: "+"\""+ assignment.occupation+"\"");
		System.out.println("9. Person's favourite colour: "+"\""+ assignment.favColour+"\"");
		System.out.println("10. Current year: "+ assignment.currentYear); 
		System.out.println("11. Number of followers on a social media platform: "+ assignment.followers);
		System.out.println("12. Rating of a movie: "+ assignment.movieRating);
		System.out.println("13. Person's blood type: "+"\'"+ assignment.bloodType+"\'");
		System.out.println("14. Title of a book: "+"\""+ assignment.bookTitle+"\"");
		System.out.println("15. Number of employees in a company: "+ assignment.noOfEmployees);
		System.out.println("16. Time of an event: "+"\""+ assignment.time+"\"");
		System.out.println("17. Name of a country: "+"\""+ assignment.country+"\"");
		System.out.println("18. Person's eye color: "+"\""+ assignment.eyeColor+"\"");
		System.out.println("19. Person's birthplace: "+"\""+ assignment.birthplace+"\"");
		System.out.println("20. Distance between two cities: "+ assignment.distance);

	}

}
