class Reduce{
	public static void main(String[] args) {
		int iq = 140;

		for (int reduce = 0; reduce <=139; reduce++)	{
			iq = iq - 1;
		}
		System.out.println("Your mental skills has been reduced! " + 
			"Your IQ is now: " +
			iq);
	}
}