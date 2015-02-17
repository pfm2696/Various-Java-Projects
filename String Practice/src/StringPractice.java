import java.util.Scanner;
public class StringPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input =new Scanner (System .in);
		System.out.println("Type in your name");
		String name;
		name=input.nextLine();
		if (name.equals("Peter Munzo")){
			System.out.println("Your name is Peter Munzo");
		
		}else{
			System.out.println("Youre name is " +name);
		}
		name=name.toLowerCase();
		System.out.println(name);
		name=name.toUpperCase();
		System.out.println(name);
		name=name.replace('A', 'O');
		System.out.println(name);
		name=name.substring(0,6);
		System.out.println(name);
			

	}

}
