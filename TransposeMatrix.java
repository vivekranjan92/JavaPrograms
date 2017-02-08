import java.util.Scanner;

public class TransposeMatrix
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int inverse = 0;

        System.out.println("Enter the number of rows : ");
        int a = scan.nextInt();

        System.out.println("Enter the number of columns : ");
        int b = scan.nextInt(); 

        int matrix[][] = new int[a][b];

        System.out.println("Enter your number :");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("inverse of the matrix that you have entered is :-");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
               System.out.print(matrix[j][i] + " ");     
            }
            System.out.println("");
        }
    }
}