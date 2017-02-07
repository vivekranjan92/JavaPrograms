import java.util.Scanner;

public class BinToHexa
{
	public static void main(String[] args)
	{
		int binarynumber, remainder;
		String hexadecimalnumber ="";

		char hexadecimal[] = {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		Scanner scan = new Scanner(System.in);

		while (binarynumber>0)
		{
			remainder=binarynumber%16;
			hexadecimalnumber = hexadecimal[remainder] + hexadecimalnumber;
			binarynumber = binarynumber/16;
		}

		System.out.print(Equivalent Hexadecimal Value Of " +binarynumber+ " Is :\n);
		System.out.print(hexadecimalnumber);
	}
}