import java.util.Scanner;
import javax.swing.JOptionPane;
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input =new Scanner (System .in);
		String playagain;
		do{
		JOptionPane.showMessageDialog(null,"Hello and welcome to the Advanced Calculator. " +
				"Type your calculations to get started");
		double Number1;
		System.out.println("Please enter your first number");
		Number1=input.nextInt();
		double Number2;
		System.out.println("PLease enter your second number.");
		Number2=input.nextDouble();
		input.nextLine();
		String operation;
		System.out.println("Please enter the operation +,-,*,or / you would like to use between these two numbers");
		operation=input.nextLine();
		if(operation.equals ("+")){
			add(Number1, Number2);
		}
		else if (operation.equals("-")){
			subtract(Number1, Number2);
		}
		else if (operation.equals("*")){
			multiply(Number1, Number2);;
		}else if (operation.equals("/")){
			divide(Number1, Number2);

		}
			
		System.out.println("If you would like to do a new calculation type either yes or no.");
		playagain=input.nextLine();
		}while(playagain.equals ("yes"));
		
	}
	public static void add(double Number1, double Number2){
		System.out.println("answer is "+(Number1 +Number2));
	
}
	public static void subtract(double Number1, double Number2){
		System.out.println("answer is "+(Number1 -Number2));
	}
	public static void multiply (double Number1, double Number2){
		System.out.println ("answer is "+(Number1 *Number2));
		
	}
	public static void divide (double Number1, double Number2){
		System.out.println ("answer is "+(Number1 /Number2));
		
	}
	

}
