class Counter	{
	public static void main(String[] args) {
		
		int numberFound[] = new int[400];
		int counter = 0;

		// számítás
		int number = 1;
		while (counter < 400)	{
			if (number % 13 == 0)	{
				numberFound[counter] = number;
				counter++;
			}
			number++;
		}

		// kiíratás
		for (int i = 0; i < 400; i++)	{
			System.out.println("\t" + (i+1) + ": " + numberFound[i]);
		} 
	}
}