package com.Snake_And_Ladder_Problem;

public class Snake_And_Ladder_Problem {

	
	public static void main(String[] args) {
	
		System.out.println( "Welcome to Snake And Ladder Problem" );
		int startPosition = 0;
		int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        System.out.println("Die Rolled:" + dieRoll);
        int checkOption = (int) Math.floor(Math.random() * 10) % 3;
        if (checkOption == 0) {
            System.out.println("No Play");
        } else if (checkOption == 1) {
            System.out.println("Ladder Comes");
            startPosition += dieRoll;
        } else {
            System.out.println("Snake Comes");
            startPosition -= dieRoll;
        }

}
}