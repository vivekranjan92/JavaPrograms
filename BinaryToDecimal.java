import java.util.*;

public class BinaryToDecimal
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Binary Number:-");
        int number = scan.nextInt();

        if (number < 0)
        {
            System.out.println("number that you have entered is not valid");
        }
        else
        {
            System.out.println("Your conversion from Binary to Decimal is:-");
        }

        int dec = BinToDec(number);
        System.out.println(dec);
    }

    public static int BinToDec(int binaryNumber){
 
    int decimal = 0;
    int p = 0;
    while(true){
      if(binaryNumber == 0){
        break;
      } else {
          int temp = binaryNumber%10;
          decimal += temp*Math.pow(2, p);
          binaryNumber = binaryNumber/10;
          p++;
       }
    }
    return decimal;
  }

}