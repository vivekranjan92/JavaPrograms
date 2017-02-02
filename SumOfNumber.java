import java.util.Scanner;
public class SumOfNumber {
	public static void main(String [] args){
		int [] number= new int[10]; 
		int sum =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 number : ");
		for(int i=0;i<10;i++){
			number[i]=scan.nextInt();
				sum = sum+number[i];
			}
		System.out.println("Sum of the number is :" +sum);
	}	
}
