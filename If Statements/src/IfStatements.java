import java.util.Scanner;
public class IfStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(
				System .in);
		System.out.println("How old are you");
		int old;
		old =input.nextInt();
		
		if (old > 15) {
		System.out.println("You are old enough to drive");
		} else {
			System.out.println("You are not old enough to drive");
		}
	}
	}


