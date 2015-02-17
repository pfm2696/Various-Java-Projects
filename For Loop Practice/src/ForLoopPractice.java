import java.util.Scanner;
public class ForLoopPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner (System .in);
		System.out.println ("How many asterisks would you like typed for you in triangle form?");
		int user =input.nextInt();
		for (int x=0; x<user+1; x++) {
			
			{
			for (int y=0; y<user+1;y++){
				System.out.print("*");
			
			}System.out.println();
		}
	}}
}
