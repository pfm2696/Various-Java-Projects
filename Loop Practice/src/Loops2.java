import java.util.Random;
import java.util.Scanner;
public class Loops2 {

	/*Number Guessing Game
	 * 
	 */
	
	public static void main(String[] args) {
		int playagain=0;
		do{
		Random r = new Random (); 
		Scanner input =new Scanner(System .in);
		System.out.println("What number would you like to guess up too?");
		int high=input.nextInt();
		int number = r.nextInt(high)+1;
		System.out.println("Guess any number");
		int guess =input.nextInt();
		int tries=1;
		while (guess != number){
		if (guess > number) {
			System.out.println("Your too high. Go lower");
		}else if(guess < number ){ System.out.println("Your too low. Go higher");
		} guess=input.nextInt();
		tries++;
		}System.out.println("You got it.It took you "+tries+" tries. Congrats");
		System.out.println("If you would like to play again press either 1 for play again or 2 to quit"); 
		playagain=input.nextInt();
		}while(playagain == 1);
				
		}
		}
