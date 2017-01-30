import java.util.Scanner;

class PalinDrom{  
 


 public static void main(String args[]){ 
       System.out.print("Enter Number: ");
       Scanner read = new Scanner(System.in);
       int num = read.nextInt();
       int n = number;
       
       int rev=0,rmd; 
       while(num > 0) 
       { 
         rmd = num % 10; 
         rev = rev * 10 + rmd; 
         number = number / 10; 
       } 
       if(rev == n) 
         System.out.println(n+" you have entered is palindrom Number!"); 
       else 
         System.out.println(n+" you have not entered a Palindrome Number!"); 
}  
}  