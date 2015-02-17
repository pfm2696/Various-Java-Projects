import java.util.Scanner;
import java.util.Random;
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner (System .in);
		Random r =new Random ();
		int playagain=0;
		do {
			
			System.out.println("How many animals would you like to put?");
			int high=input.nextInt();
			String[] animal=new String [high];
			System.out.println("Please type your animals");
			for (int x=0;x<high;x++){
			animal[x] =input.nextLine();
			
			}
			System.out.println("The " +animal [r.nextInt(high)]+" is the worlds smartest animal");
			System.out.println("The " +animal [r.nextInt(high)]+" is the worlds dumbest animal");
			System.out.println("The " +animal [r.nextInt(high)]+" is the worlds fastestanimal");
			System.out.println("The " +animal [r.nextInt(high)]+" is the worlds slowest animal");
			System.out.println("The " +animal [r.nextInt(high)]+" is the worlds fattest animal");
		System.out.println("\nIf you like to name more animals press 1 to play again or 2 to quit");
		playagain=input.nextInt();
	}		while (playagain==1);
	}
	}
