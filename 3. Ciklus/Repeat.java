import java.util.*;

class Repeat	{
	public static void main(String[] args) {
		String sentence = "Thorium 230 is not a toy.";
		int count = 10;
		Calendar start = Calendar.getInstance();
		int StartMinute = start.get(Calendar.MINUTE);
		int StartSecond = start.get(Calendar.SECOND);
		start.roll(Calendar.MINUTE, true);

		int nextMinute = start.get(Calendar.MINUTE);
		int nextSecond = start.get(Calendar.SECOND);

		while (count < 100000000) {
			System.out.println(sentence);
			GregorianCalendar now = new GregorianCalendar();
			if (now.get(Calendar.MINUTE) >= nextMinute) {
				if (now.get(Calendar.SECOND) >= nextSecond) {
					break;
				}
			}
			count++;
		}
		System.out.println("\nI wrote the sentence " + count
			+ " times.");
		System.out.println("I have learned my lesson");
	}
}