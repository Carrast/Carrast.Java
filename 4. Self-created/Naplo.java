import java.util.*;

class Naplo {
	public static void main(String[] args) {
		String names[] = {"Josh", "Peter", "Francis", "Deborah", "Ripley", "Mark"};

		int student[][] = new int[6][8];

		int josh[]		= {3,4,3,1,2,1,1,1};
		int peter[]		= {5,5,5,3,2,3,5,5};
		int francis[]	= {2,2,3,2,1,5,5,5};
		int deborah[]	= {1,3,4,2,5,1,5,5};
		int ripley[]	= {4,5,3,2,5,4,5,5};
		int mark[]		= {4,5,3,5,5,5,5,5};
		student[0]	= josh;
		student[1]	= peter;
		student[2]	= francis;
		student[3]	= deborah;
		student[4]	= ripley;
		student[5]	= mark;

		float atlag[] = new float[8];
		float osztalyAtlag = 0;

	// cím
	System.out.println("Naplo:");

	// kiíratás
	for (int i = 0; i < 6; i++)	{

		for (int j = 0; j < 8; j++)	{
			atlag[i] = atlag[i] + student[i][j];
			osztalyAtlag = osztalyAtlag + student[i][j];
		}

		System.out.println("Tanulo"+ (i+1) + " - " + names[i] + " : " + atlag[i] / 8);
	}
	
	// osztályátlag
	System.out.println("\nOsztalyatlag : " + osztalyAtlag / 48);
	}
}