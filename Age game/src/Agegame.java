import java.util.Scanner;
public class Agegame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner (
				System .in);
		System.out.println("How old are you");
		int age = input.nextInt();
		
		
		if (age>65) {
		System.out.println("Wow you're really old");
		}else if (age>45){
			System.out.println("Your halfway there bud");
		}else if (age>20){ 
			System.out.println("You are just hitting the prime of your life");
		}else{ 
			System.out.println("You are youngin");
			
			}
			}
			}
