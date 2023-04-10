import java.util.*;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
	{
		Scanner in=new Scanner(System.in);
		int number=1+(int)(100*Math.random());
		int n=5;
		int i,guess;
        System.out.println("***Welcome to Number Guessing Game!***\n");
		System.out.println("Instructions to play: A number is chosen between 1 to 100. You will have to guess the number in 5 trials.\n");
        System.out.print("Press 1 to start the game: ");
        int start=in.nextInt();
        if(start==1) 
        {
		for(i=0;i<n;i++) {
			System.out.println("Guess the number between 1 to 100");
			guess=in.nextInt();
			if (number==guess) {
				System.out.println("Congratulations! You guessed the number.");
				break;
			}
			else if(number>guess && i!=n-1) {
				System.out.println("The number is greater than "+guess);
			}
			else if(number<guess && i!=n-1) {
				System.out.println("The number is less than "+guess);
			}
		}
		 
			if (i==n) {
                System.out.println("Bad luck! The number was "+number);
				System.out.println("You are out of trials!. Better luck next time!");				
			}
        }
			
	}

}
}