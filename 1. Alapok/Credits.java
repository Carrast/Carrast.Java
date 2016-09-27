class Credits {
	public static void main(String[] args) {
		// a film adatainak beállítása
		String title = "The Piano";
		int year = 1985;
		String director = "Steven Speilberg";
		String role1 = "Ada";
		String actor1 ="Eva Green";
		String role2 = "Ross";
		String actor2 ="Steven Tyler";
		String role3 = "Stewart";
		String actor3 ="Hugh Jackman";
		String role4 = "Flora";
		String actor4 ="Anna Paquin";

		// adatok megjelenítése

		System.out.println(title + " (" + year + ")\n"	+
			"A " + director + " film.\n\n" +
			role1 + "\t" + actor1 + "\n" +
			role2 + "\t" + actor2 + "\n" +
			role3 + "\t" + actor3 + "\n" +
			role4 + "\t" + actor4 + "\n");
	}
}