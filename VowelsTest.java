import java.util.*;
public class VowelsTest {
	
	public static void main(String []args){
		System.out.println("enter the paragraph :-");
		Scanner scanner = new Scanner(System.in);
		String sentence =scanner.nextLine();
		int count=0;
		int A_count=0;
		int E_count=0;
		int I_count=0;
		int O_count=0;
		int U_count =0;
		
		
		for(int i=0;i<sentence.length();i++){
			if(sentence.charAt(i)=='a'|| sentence.charAt(i)=='A'){
				count++;
				A_count++;
			}
			if(sentence.charAt(i)=='e'|| sentence.charAt(i)=='E'){
				count++;
				E_count++;
			}
			if(sentence.charAt(i)=='I'|| sentence.charAt(i)=='i'){
				count++;
				I_count++;
			}
			if(sentence.charAt(i)=='o'|| sentence.charAt(i)=='O'){
				count++;
				O_count++;
			}
			if(sentence.charAt(i)=='u'|| sentence.charAt(i)=='U'){
				count++;
				U_count++;
			}
		}
		System.out.println("the total number of vovels are" +count);
		System.out.println("total number of a"+A_count);
		System.out.println("total number of e"+E_count);
		System.out.println("total number of i"+I_count);
		System.out.println("total number of o"+O_count);
		System.out.println("total number of u"+U_count);
		
		
		
	}
	
}