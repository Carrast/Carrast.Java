class TestModems	{
	public static void main(String[] args) {
		CableModem roadRunner = new CableModem();
		DSLModem bellSouth = new DSLModem();

		roadRunner.speed = 445000;
		bellSouth.speed = 1220000;

		System.out.println("Trying the cable modem:");
		roadRunner.displaySpeed();
		roadRunner.connect();

		System.out.println("\n" + "Trying the DSL modem:");
		bellSouth.displaySpeed();
		bellSouth.connect();	
	}
}
