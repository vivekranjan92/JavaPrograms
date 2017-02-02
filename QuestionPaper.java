import java.util.Scanner;

public class QuestionPaper
{
	public static void main(String[] args)
	{
		int count = 0;

		System.out.println("All the best for the quiz");

		
		System.out.println("Q.1) Who is the founder of google?");
		System.out.println("	1) Mark Zukerberg");
		System.out.println("	2) Larry Page");
		System.out.println("	3) Bill Gates");
		System.out.println("	4) none of the above");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your answer : ");

		int myanswer1 = 2;

		int youranswer1 = scan.nextInt();
		
		//for(int count=1;i<=2);i++)
		if (youranswer1 == myanswer1)
		{
			System.out.println("Your answer is correct");
			count++;
		}else{
			System.out.println("Your answer is wrong, founder of google is larry page.");
		}

		//

		System.out.println("Q.2) When was the google founded?");
		System.out.println("	1) 1995");
		System.out.println("	2) 2000");
		System.out.println("	3) 1998");
		System.out.println("	4) none of the above");

		

		int myanswer2 = 3;

		int youranswer2 = scan.nextInt();
		

		if (youranswer2 == myanswer2)
		{
			System.out.println("Your answer is correct");
			count++;
		}else{
			System.out.println("Your answer is wrong, google was founded in 1998");
		}
		//
		System.out.println("Q.3) Who is the CEO of google");
		System.out.println("	1) Sundar Pichai");
		System.out.println("	2) Larry Page");
		System.out.println("	3) Vivek Ranjan");
		System.out.println("	4) none of the above");


		int myanswer3 = 1;

		int youranswer3 = scan.nextInt();
		
		
		if (youranswer3 == myanswer3)
		{
			System.out.println("Your answer is correct");
			count++;
		}else{
			System.out.println("Your answer is wrong");
		}

		
		System.out.println("number of correct answer is :" + count + " And total number of Question is: 3");
		System.out.println("Thanks for participating in this quiz.");

	}
}