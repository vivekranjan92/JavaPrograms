import java.util.Scanner;

public class MatrixSubstraction
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows = scan.nextInt();

        System.out.println("Enter the number of columns :");
        int columns = scan.nextInt();

        int a[][] = new int [rows][columns];
        int b[][] = new int [rows][columns];
        int c[][] = new int [rows][columns];
        
        System.out.println("Enter the value of the matrix1 :");

        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                a [i][j] = scan.nextInt();                            
            }            
        }

        System.out.println("Enter the value the matrix2 :");
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                b [i][j] = scan.nextInt();
            }
        }

        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                c[i][j] = a[i][j]-b[i][j];            
            }    
        }


        System.out.println("sum of the matrix entered is :-");
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.print(c[i][j] + "\t");
            }    
            System.out.println();
        }


    }
}