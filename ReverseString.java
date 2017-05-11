public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "vivek ranjan singh";

        // using recursive method

        System.out.println(recursiveMethod(str));
    }

    static String recursiveMethod(String str)
    {
        if((str== null) || str.length() <= 1)
        {
            return str;
        }
        else
        {
            return recursiveMethod(str.substring(1)) + str.charAt(0);
        }
        System.out.println();

    //using string buffer method
        System.out.println();
        StringBuffer stb = new StringBuffer(str);
        System.out.println(stb.reverse());
        System.out.println();

    //using iterative method
        System.out.println();
        char[] strArray = str.toCharArray();

        for (int i=strArray.length-1;i>=0;i--)
        {
            System.out.print(strArray[i]);    
        }
        System.out.println();
        System.out.println();
    }
}
