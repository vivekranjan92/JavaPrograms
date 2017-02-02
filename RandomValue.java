import java.util.*;

public class RandomValue
{
	public static void main(String[] args)
	{
		int i;
		Random scan = new Random();

		for (i=1;i<=20;i++)
		{
			System.out.println(scan.nextInt(50));
		}
	}
}

// Here in this program i<=20 means that how many numbers do we want to display in between 1 and 100.
// also we are incrementing the value coz we want 20 values back to back, untill we get 20 values the loop,
// will keep rotating and later on it will come out of loop and will display us 20 random numbers in between 1-50.

//stack and queue