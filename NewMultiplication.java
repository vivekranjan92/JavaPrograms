import java.util.Scanner;

public class NewMultiplication
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the numbers of rows for matrix 1 ");
        int a = scan.nextInt();

        System.out.println("Enter the numbers of column for matrix 1 ");
        int b = scan.nextInt();

        int matrix1[][] = new int[a][b];

        System.out.println("Enter the value of Matrix1");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<b;j++)
            {
                matrix1[i][j] = scan.nextInt();  
            }  
        }

        System.out.print("Enter the number of row of matrix 2 ");
        int c = scan.nextInt();

        System.out.print("Enter the number of column of matrix 2 ");
        int d = scan.nextInt();

         int r[][] = new int[a][d];

        if (b!=c)
        {
            System.out.println("invalid matrix size entered ");
        }

        else
        {
                int matrix2[][] = new int [c][d];
                System.out.println("Enter the value for matrix2");
                for (int i=0;i<c;i++)
                {
                    for (int j=0;j<d;j++)
                    {
                        matrix2[i][j] = scan.nextInt();       
                    }   
                }

            for (int i=0;i<a;i++)
            {
                for (int j=0;j<d;j++)
                {
                    for (int k=0;k<b;k++)
                    {
                       sum = sum + matrix1[i][k]*matrix2[k][j];         
                    }
                    r[i][j] = sum;
                    sum = 0;  
                }    
            }
        }
        System.out.println("Your product of the matrix is : ");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<d;j++)
            {
                System.out.print(r[i][j] + "\t");    
            }
            System.out.println();
        }
    }
}