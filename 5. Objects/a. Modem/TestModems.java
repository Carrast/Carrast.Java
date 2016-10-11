class TestModems	{
	public static void main(String[] args) {
		CableModem roadRunner = new CableModem();
		DSLModem bellSouth = new DSLModem();
		AcousticModem rampRunner = new AcousticModem();

		roadRunner.speed = 445000;
		bellSouth.speed = 1220000;
		rampRunner.speed = 350;

		System.out.println("Trying the cable modem:");
		roadRunner.displaySpeed();
		roadRunner.connect();
		roadRunner.disconnect();

		System.out.println("\n" + "Trying the DSL modem:");
		bellSouth.displaySpeed();
		bellSouth.connect();	
		bellSouth.disconnect();

		System.out.println("\n" + "Trying the Acoustic modem:");
		rampRunner.displaySpeed();
		rampRunner.connect();
		rampRunner.disconnect();
	}
}
