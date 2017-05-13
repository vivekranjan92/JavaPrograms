/*
* Reverse an array without affecting special characters
* created by Vivek Ranjan on 05/13/2017
*/
class ReverseString
{
    public boolean isAlphabet(char ch)
    {
        if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            return true;
            return false;
    }
    public String reverse(StringBuilder str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(!isAlphabet(ch1))
            {   
                i++;
            }
            else if (!isAlphabet(ch2))
            {
                j--;    
            }
            else
            {
                str.setCharAt(i, ch2);
                str.setCharAt(j, ch1);
                i++;
                j--;
            }
        }
        return str.toString();
    }
}
public class ReverseArray
{
    public static void main(String[] args)
    {
        ReverseString rs = new ReverseString();

        String test = rs.reverse(new StringBuilder("viv,ek,ran%jan"));
        System.out.println(test);
    }
}