import java.util.Scanner;
public class Userimput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(
				System .in);
		
		System.out.println("How old are you?");
		int age;
		age= input.nextInt();
		
		System.out.println("You are " +age+ " years old");
		
	}
}
