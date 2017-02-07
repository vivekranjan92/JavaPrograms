import java.util.Scanner;
public class Recursion
{
	// public static long factorial(int n)
	// {
	// 	if (n==1)
	// 	return 1;
	// 	else
	// 	return n*(n-1);	
	// }

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to get factorial of:-");
        int number = scan.nextInt();
			if (number<1){
				System.out.println("You have entered an invalid number");	
			}else{
				System.out.println("factorial of the number that you have entered is: ");
			}
			System.out.println(factorial(number));

	}



	public static long factorial(int n){
		if (n==1) // if the user will give input as 1 then it will return 1 as factorial 1=1
		return 1;
		else
		return (n*factorial(n-1)); //if user input number 5 then the flow will go like 5*factorial(4),
		//4*factorial(3),	3*factorial(2) then 2*factorial(1), 1 =5*4*3*2*1=120	
		
		}
}