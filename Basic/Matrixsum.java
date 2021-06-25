package Basic;

import java.util.Scanner;

public class Matrixsum {

	private static Scanner sc;
	
	public static void main(String[] args) {
		
		int i, j, rows, columns, row_sum, column_sum;	
		
		sc= new Scanner(System.in);
		
		System.out.println("\n Enter Matrix Rows and Columns :  ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][] SumOfRowCols_arr = new int[rows][columns];
		
		System.out.println("\n Please Enter the Matrix Items :  ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				SumOfRowCols_arr[i][j] = sc.nextInt();
			}		
		}
		
		System.out.println("\nThe Sum of Each Row in a Matrix");	
		for(i = 0; i < SumOfRowCols_arr.length; i++)
		{
			row_sum = 0;
			for(j = 0; j < SumOfRowCols_arr[0].length; j++)
			{
				row_sum = row_sum + SumOfRowCols_arr[i][j];
			}
			System.out.println("The Sum of Matrix Items "
					+ "in Row " + i + " = " + row_sum);
		}
		System.out.println("\nThe Sum of Each Column in a Matrix");
		for(i = 0; i < SumOfRowCols_arr.length; i++)
		{
			column_sum = 0;
			for(j = 0; j < SumOfRowCols_arr[0].length; j++)
			{
				column_sum = column_sum + SumOfRowCols_arr[j][i];
			}
			System.out.println("The Sum of Matrix Items "
					+ "in Column " + i + " = " + column_sum);
		}
	}

}
