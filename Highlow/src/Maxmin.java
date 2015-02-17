import java.util.Scanner;
public class Maxmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input =new Scanner (System .in);
		
		int total;
		
		System.out.println("How many numbers would you like to input");
		total=input.nextInt();
		int[]number =new int [total];
		
		for(int x=0;x<total;x++){
			System.out.println("Type in more numbers");
			number [x]=input.nextInt();
		}
		int high=number[0];
		int low=number[0];
		
		for(int x=0;x<total;x++){
			if (number[x]>high){
				high=number[x];
			}
			if (number[x]<low){
				low=number[x];
			}
		}
			System.out.println("Your highest number was " +high+ " and your lowest number was " +low);
			
		}
		
		
	}
