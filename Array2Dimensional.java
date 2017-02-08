//package 2_dimensional_array
public class Array2Dimensional
{
	public static void main(String[] args)
	{
		int studentsmarks[][];
		studentsmarks = new int[3][3];

		studentsmarks[0][0] = 10;
		studentsmarks[0][1] = 20;
		studentsmarks[0][2] = 30;
		studentsmarks[1][0] = 40;
		studentsmarks[1][1] = 50;
		studentsmarks[1][2] = 60;
		studentsmarks[2][0] = 70;
		studentsmarks[2][1] = 80;
		studentsmarks[2][2] = 90;


		System.out.println(studentsmarks[0][0]);
		System.out.println(studentsmarks[0][1]);
		System.out.println(studentsmarks[0][2]);
		System.out.println(studentsmarks[1][0]);
		System.out.println(studentsmarks[1][1]);
		System.out.println(studentsmarks[1][2]);
		System.out.println(studentsmarks[2][0]);
		System.out.println(studentsmarks[2][1]);
		System.out.println(studentsmarks[2][2]);

	}
}