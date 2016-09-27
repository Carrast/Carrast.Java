class ifelseTEST {
	public static void main(String[] args) {
		
	// első
	short account = 0;
	if (account <= 0)
		System.out.println("Szegény vagy mint a templom egere");

	// --- eltolás --- 
	System.out.println("--------------------------------------------------------------------------------------");
	// --- eltolás --- 

	// összehasonlítások és if-else
	int studentGrade = 0;
	String answer = "Szar";
	String rightAnswer = "Patent";

	if (answer == rightAnswer) {
		studentGrade += 10;
	}
	else {
		studentGrade -= 5;
	}

	System.out.println(studentGrade);

	// --- eltolás --- 
	System.out.println("--------------------------------------------------------------------------------------");
	// --- eltolás --- 

	// if-else
	char grade = 'D';

	if (grade == 'A')
		System.out.println("Great Job");
	else if (grade == 'B')
		System.out.println("Intermediate");
	else if (grade == 'C')
		System.out.println("Shit");	
	else
		System.out.println("The worst...");	

	// --- eltolás --- 
	System.out.println("--------------------------------------------------------------------------------------");
	// --- eltolás --- 

	// Switchek
	char grade2 = 'B';
	switch (grade2) {

		case 'A':
			System.out.println("Great Job");
			break;
		case 'B':
			System.out.println("Intermediate");
			break;
		case 'C':
			System.out.println("Shit");	
			break;
		default:
			System.out.println("The worst...");			
	}

	// --- eltolás --- 
	System.out.println("--------------------------------------------------------------------------------------");
	// --- eltolás --- 

	// háromtényezős elágazás
	String gender = "male";

	System.out.println( (gender.equals("male")) ? "Mr." : "Ms." );
	System.out.println("\n");

	// még egy veerzió
	short skilLevel = 6;
	int numberofEnemies = 0;
	numberofEnemies = (skilLevel > 5) ? 10 : 3;
	System.out.println("Your skill is " + skilLevel + " !");
	System.out.println("You must fight " + numberofEnemies + " enemies now!");

	// --- eltolás --- 
	System.out.println("--------------------------------------------------------------------------------------");
	// --- eltolás --- 





	// --- eltolás --- 
	System.out.println("--------------------------------------------------------------------------------------");
	// --- eltolás --- 



	}

}