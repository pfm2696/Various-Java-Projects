import java.util.Scanner;

public class SelfQuiz {

	/*This is a quiz that is scored and the last question you must type the name. Each question is worth one
	*point except for the bonus question which is worth 2 points. Good Luck and Have Fun!*/
	
	 
	public static void main(String[] args) {
	Scanner input =new Scanner (
			System .in);
	System.out.println("What is my favorite movie. Type in number");
	System.out.println("1.Shutter \n2.Insidious \n3.Madagascar 3\n");
	int movie;
	int score = 0;
	movie= input.nextInt();
		if (movie == 2) {
			System.out.println("Congrats");
			score=score+1;
			
		}else {
			System.out.println("sorry you are incorrect");
			
			
		
		}
		System.out.println("What language can I speak. Type in number");
		System.out.println("1.Spanish \n2.French \n3.English");
		int language;
		language =input.nextInt();
		if (language == 3){
			System.out.println("Your right");
			score++;
		}else{
			System.out.println("Sorry that is wrong");
		
		}
		System.out.println("Next Question, What is my favorite number");
		System.out.println("1.15 \n2.1 \n3.56");
		int number = input.nextInt();
		if (number == 1) {
			System.out.println("thats right");
			score=score+1;
		}else{
			System.out.println("Sorry its wrong");
		
		}
		System.out.println("Bonus Question. What instrument do I play");
		System.out.println("1.Guitar \n2.Trumpet \n3.Clarinet \n4.Nothing");
		int instrument = input.nextInt();
		if (instrument == 1) {
			System.out.println("You were right");
			score=score+2;
		}else{
			System.out.println("Sorry you got the bonus wrong");
			
				System.out.println("Last question. What is your mothers maiden name?Type it out this time.");
				System.out.println("1.White \n2.Jackson \n3.Brown \n4.Villa");
				String maiden = input.next();
				if (maiden == "Villa")
				{
					System.out.println("You are excellent");
					score++;
			}else{ 
				System.out.println("I can't believe you got that wrong");
			
				
				
				
			}
		}
			
		
		
		System.out.println("Your score is "+score);
		if (score == 5){
			System.out.println("You were perfect");
		}else if (score == 4){
			System.out.println("Ooo you were close");
		}else if (score == 3){ 
			System.out.println("You wern't that close");
		}else{ 
			System.out.println("Sorry you failed");
			
		
		}
		}
		
	
	
		

	}
