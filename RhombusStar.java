import java.util.*;

public class RhombusStar
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n = sc.nextInt();

		int i,j;

		for (i=1;i<=n;i++) 
		{
			for (j=n;j>i;j--)
			{
				System.out.print("*");
			}
			for (j=1;j<=2*i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for (i=1;i<=n;i++) 
		{
			for (j=1;j<i;j++)
			{
				System.out.print("*");
			}
			for (j=2*n-1;j>=2*i-1;j--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}