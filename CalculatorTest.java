import java.util.Scanner;
public class CalculatorTest
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		
			char Operation;
			double number1=0;
			double number2=0;

			
			System.out.println("Enter your first number");
			number1 = Double.parseDouble(scan.nextLine());

			System.out.println("Enter operation");
			String in = scan.nextLine();
			Operation = in.charAt(0);

			System.out.println("Enter your second number");
			number2 = Double.parseDouble(scan.nextLine());


			if (Operation == '+')
			{
				System.out.println("Your Answer is :"+(number1 + number2));
			}

			else if (Operation == '-')
			{
				System.out.println("Your Answer is :"+(number1 - number2));
			}

			else if (Operation == '*')
			{
				System.out.println("Your Answer is :"+(number1 * number2));
			}

			else if (Operation == '/')
			{
				if (number2 !=0 ) {
					System.out.println("Your Answer is :"+(number1 / number2));
				}else{
					System.out.println("can not divide");
				}
			}

			else
			{
				System.out.println("invalid operation");
			}
	}

}