import java.util.*;

class Name	{
	public static void main(String[] args) {
		String names[] = { "Peter", "Patricia", "Hunter", "Sarah",
			"Gabe", "Gina", "Robi", "John", "Zoey", "Feri", "Pista",
			"Jóska", "Anna", "Csimar", "Géza", "Noah", "Kathy"};
		System.out.println("The original order:");

		// for ciklus kezdete
		for (int i = 0; i < names.length; i++)	{
			System.out.println((i + 1) + ": " + names[i]);
		}

		// tömb rendezés
		Arrays.sort(names);
		System.out.println("\nThe new order:");

		// for ciklus kezdete
		for (int i = 0; i < names.length; i++)	{
			System.out.println((i + 1) + ": " + names[i]);
		}	

		System.out.println("\nAkit pedig büntetni kell: " + names[14]);	
	}
}