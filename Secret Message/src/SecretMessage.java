import java.util.Scanner;
public class SecretMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input =new Scanner (System .in);
		int x=0;{
			System.out.println("Type in your message now");
		String message=input.nextLine();
		System.out.println("How would you like to change your message?");
		int change=input.nextInt();
		char[]messageArray=new char [message.length()];
		messageArray=message.toCharArray();
		
		for(x=0;x<message.length();x++){
			messageArray[x]+=change;
		}
		for(x=0;x<message.length();x++){
		System.out.print(messageArray[x]);
		}
		
	
	}
	
	}
}
