class Wheel	{
	public static void main(String[] args) {
		// tömb meghatározása
		String phrase[] = {
			"A STITCH IN TIME SAVES NINE",
			"DON'T EAT YELLOW SNOW",
			"JUST DO IT",
			"EVERY GOOD BOY DOES FINE",
			"I WANT MY MTV",
			"HOW ABOUT THEM COWBOYS",
			"PLAY IT AGAIN, SAM",
			"FROSTY THE SNOWMAN",
			"ONE MORE FOR THE ROAD",
			"HOME FRIEND ADVANTAGE",
			"VALENTINE'S DAY MASSACRE",
			"GROVER CLEVELAND OHIO",
			"WONDERFUL WORLD OF DISNEY",
			"COAL MINER'S DAUGTHER",
			"WILL IT PLAY TOMORROW"
		};

		int[] letterCount = new int[26];

		for (int count = 0; count < phrase.length; count++)	{
			String current = phrase[count];
			char[] letters = current.toCharArray();
			for (int count2 = 0; count2 < letters.length; count2++)	{;
				char lett = letters[count2];
				if ( (lett >= 'A') & (lett <= 'Z') )	{
					letterCount[lett - 'A']++;
				}
			}
		}

		for (char count = 'A'; count <= 'Z'; count++)	{
			System.out.println(count + ": " +
				letterCount[count - 'A'] +
				"\t");
		}
		System.out.println();
	}
}