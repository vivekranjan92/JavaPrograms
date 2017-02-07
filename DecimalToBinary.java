import java.util.Scanner;

public class DecimalToBinary{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = scan.nextInt();

        if (number < 0) {
            System.out.println("Error: Not a positive integer");
        }else{ 
            System.out.print("Your conversion from binary to decimal is : ");
        }
    
        //Function call sysntax 
        // ReturnedValue =MethodName(parameter);

        String bin = dectobin(number);
        System.out.println(bin);
    }

    public static String dectobin(int num){

        String abc = "";
        while(num>0){
            abc = num%2 + abc;
            num = num/2;
        }
        return abc;
    }
}