import java.util.Scanner;
class Inverse
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter order of matrix:");
        int n = scan.nextInt();                    
        int matrix[][] = new int[n][n]; // asgning the number of rows and columns
        
        // user input for matrix elements
        System.out.println("Enter matrix elements:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = scan.nextInt();
            }
        }
        // below we are displaying the value of the matix which user has given;
        System.out.println("Input Matrix:");
        print_matrix(matrix,n);
        
        // now finding the determinant of the matrix and if the determinant == 0 then cant proceed further and the program will terminate there only.

        double det = determinant(matrix,n);        
        System.out.println("Determinant " + det); 
        if(det==0)
        {
            System.out.println("Inverse is not possible");
            System.exit(0);
        }
        // printing transpose matrix
        int transpose_matrix[][] = transpose(matrix,n);
        print_matrix(transpose_matrix,n);
        System.out.println("Cofactor of the matrix is :");
        
        //printing adjacent matrix
        int adjacent_matrix[][] = adjacent(transpose_matrix,n);
        print_matrix(adjacent_matrix,n);
        
        // printing inverse matrix
        System.out.println("Inverse Matrix:");
        double inverse_matrix[][] = inverse(adjacent_matrix,n,det);
        print_matrix2(inverse_matrix,n);
    }
    // defining function to print a matrix
    static void print_matrix(int a[][], int m)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
 
    }
    static void print_matrix2(double a[][], int m)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
 
    }
    
    // defining function to calculate transpose of a matrix
    static int[][] transpose(int a[][],int m)
    {
        int b[][] = new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }
    
    // defining function to calculat inverse of a matrix
    static double[][] inverse(int a[][],int m,double det)
    {
        double output[][] = new double[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                output[i][j] = a[i][j]/det;
            }
        }
        return output;
    }
    
    // defining function to calculate adjacent matrix
    static int[][] adjacent(int a[][],int m)
    {
        int output[][] = new int[m][m];
        int det = 0,s=0,t=0;
        for (int z=0;z<m;z++)
        {
            for (int i=0;i<m;i++)
            {
                int b[][] = new int[m-1][m-1];
                for(int j=0;j<m;j++)
                {
                    if(j!=z)
                    {
                        for(int k=0;k<m;k++)
                        {
                            if(k!=i)
                            {
                                b[s][t] = a[j][k];    
                                t++;
                            }
                        }
                        s++;
                    }
                    t = 0;
                }
                s = 0;
                output[z][i] = (int)Math.pow(-1,i+z)*determinant(b,m-1);
            } 
        }
        return output;
    }
    
    // defining function to calculate determinant of a matrix of order of M
    static int determinant(int a[][],int m)
    {
        if(m==1)
        {
            return a[0][0];
        }
        else if(m==2)
        {
            return a[0][0]*a[1][1]-a[0][1]*a[1][0];
        }
        else
        {
            int det = 0,s=0,t=0;
            for (int i=0;i<m;i++)
            {
                int b[][] = new int[m-1][m-1];
                for(int j=0;j<m;j++)
                {
                    if(j!=0)
                    {
                        for(int k=0;k<m;k++)
                        {
                            if(k!=i)
                            {
                                b[s][t] = a[j][k];    
                                t++;
                            }
                        }
                        s++;
                    }
                    t = 0;
                }
                s = 0;
                det = det+(int)Math.pow(-1,i)*a[0][i]*determinant(b,m-1);
            } 
            return det;
        }
    }
    
}
