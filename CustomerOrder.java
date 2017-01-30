import java.util.*;  
import java.text.*;

public class CustomerOrder{  

	// AlcoholTest at = new AlcoholTest();
	// at.main();
	// at.DisplayMenu();

	// AlcoholTest.main();
	//Constructor
	// public CustomerOrder(int i)
	// {

	// }

 public static void main(String args[]) throws ParseException{ 

	   Scanner sc=new Scanner(System.in);  
       
   		System.out.println("Enter your name: ");
    	String name = sc.nextLine();

    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

    	System.out.println("Enter your DOB: yyyy-mm-dd ");

    	Date DOB = sdf.parse(sc.nextLine());
    	Date DOB2 = sdf.parse("1991-01-25");

		    if(DOB.compareTo(DOB2)<0){ 

		    System.out.println("Welcome "+ name +" to foom");		    

		    //1) Display the menu

		    //2) Take the input and calculate the cost

		    //3)Ask if he wants another dring 

		    //4) if yes then Go to step 1 else print the calculated Cost and exit the loop
		    double Totalprice = 0.0;
		    boolean IsNextDrink = true;
		   while(IsNextDrink)
		   {
		   	    Totalprice = DisplayMenu(Totalprice);

		   	    System.out.println("Do you want to select Another Drink? Press Y to Continue, N to exit with Current selection");
				Scanner s= new Scanner(System.in);
				char Choice = s.next().charAt(0);
				//System.out.println(Choice);
				if(Choice == 'Y' || Choice =='y')
				{
					IsNextDrink = true;
				}
				else
				{
					IsNextDrink = false;
				}
			    
			}
		    System.out.println("Please pay Rs "+Totalprice);
		 }
		 else
		 {
		   	System.out.println(name+" We are sorry, but your age should be minimum 18 Years!!");
		 }	
	}

	//public static void main(String[] args) {
  //       Scanner s = new Scanner(System.in);
		// String str = s.nextLine();
		// System.out.println(str);
		// char c = (char) System.in.read();
		// System.out.println(c);

		//Scanner s= new Scanner(System.in);
		//char x = s.next().charAt(1);
		//System.out.println(x);

    //}

	public static double DisplayMenu(double d)
	{
			double Totalprice = d;
			int small = 10;
		    int medium = 20;
		    int large = 30;
		    int beer = 40;
		    int rum = 50;

		 	System.out.println("1. samll 10");
		    System.out.println("2. medium 20");
		    System.out.println("3. large 30");
		    System.out.println("4. beer 40");
		    System.out.println("5. rum 50");



		    System.out.println("Enter your menu choice name: ");
			    Scanner input = new Scanner(System.in);
			    int orderNumber = input.nextInt();

			    System.out.println("how many drink do you want?: ");
			    input = new Scanner(System.in);
			    int orderAmount = input.nextInt();

			    double price = 0.0;

			    switch (orderNumber) {
			    	case 1: price = small;
			    			break;
			    	case 2: price = medium;
			    			break;
			    	case 3: price = large;
			    			break;
			    	case 4: price = beer;
			    			break;
			    	case 5: price = rum;
			    			break;
				} 
				
				Totalprice += price * orderAmount;
				return Totalprice;
		    
	}
}  
