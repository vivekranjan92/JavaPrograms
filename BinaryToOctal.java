import java.util.Scanner;

public class BinaryToOctal
{
	public static void main(String[] args)
	{
		
		int binarynumber, remainder, quotient, i=1, j;
		int octalnumber[] = new int[100];
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Your Binary Number: ");
		binarynumber = scan.nextInt();

		quotient = binarynumber;

		while(quotient !=0)
		{
			octalnumber[i++] = quotient%8;
			quotient =quotient/8;
		}

		System.out.print("Equivalent Octal Value Of " +binarynumber+" Is :\n");
		for (j=i-1;j>0;j--)
		{
			System.out.print(octalnumber[j]);	
		}
		System.out.println();
	}
}