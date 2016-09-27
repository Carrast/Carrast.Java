class Game {
    public static void main(String[] arguments) {
        int total = 30;
        int score = 0;

        // számláló
        for (score = 0; score < 31; score++) {
            if (score == 3) {
                System.out.println("You are at 3 now!");
            }
            if (score == 17) {
                System.out.println("Your score is 17");
            }
        }

        // kiírás ha több
        if (score > total) {
            System.out.println("Total score: " + score);
        }
    }
}
