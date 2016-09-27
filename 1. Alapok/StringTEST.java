class StringTEST {
	public static void main(String[] args) {
	
		System.out.println("\n");

		// első
		int length = 121;
		char rating = 'R';

		System.out.println("Running time: " + length + " minutes");
		System.out.println("Rated " + rating);

	// --- eltolás --- 
	System.out.println("--------------------------------------------------------------------------------------");
	// --- eltolás --- 

		// összehasonlítás
		String favorite = "piano";
		String guess = "guitar";
		System.out.println("Is Ada's favourite instrument a " + guess + "?");
		System.out.println("Answer: " + favorite.equals(guess));

	// --- eltolás --- 
	System.out.println("--------------------------------------------------------------------------------------");
	// --- eltolás --- 

		// kis vagy nagybetűssé tétel
		String baines = "Harvey Keitel";
		String change = baines.toUpperCase();
		System.out.println(baines);
		System.out.println(change);

	// --- eltolás --- 
	System.out.println("--------------------------------------------------------------------------------------");
	// --- eltolás --- 

		// karakterlánc hossza
		String cinematographer = "Stuart Shit";
		System.out.println(cinematographer);
		int nameLength = cinematographer.length();
		System.out.println(nameLength);

	// --- eltolás --- 
	System.out.println("--------------------------------------------------------------------------------------");
	// --- eltolás --- 



	}

}