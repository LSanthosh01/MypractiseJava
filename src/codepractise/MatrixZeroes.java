package codepractise;
import java.util.*;
public class MatrixZeroes {
	public static void makeZeroes(int [][] matrix) {
		int rows=matrix.length;
		int cols=matrix[0].length;
		boolean firstrowzero=false,firstcolzero=false;
		for(int j=0;j<cols;j++) {
			if(matrix[0][j]==0) firstrowzero=true;
		}
		for(int i=0;i<rows;i++) {
			if(matrix[i][0]==0) firstcolzero=true;
		}
		for(int i=1;i<rows;i++) {
			for(int j=1;j<cols;j++) {
				if(matrix[i][j]==0) {
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		for(int i=1;i<rows;i++) {
			for(int j=1;j<cols;j++) {
				if(matrix[i][0]==0||matrix[0][j]==0) {
					matrix[i][j]=0;
				}
			}
		}
		if(firstrowzero) {
			for(int j=0;j<cols;j++) matrix[0][j]=0;
		}
		if(firstcolzero) {
			for(int i=0;i<rows;i++) matrix[i][0]=0;
		}
	}
	public static void printMatrix(int [][]matrix) {
		for(int i=0;i<matrix.length;i++) {
			System.out.print("[");
			for(int j=0;j<matrix[i].length;j++) {
				System.out.printf("%-4d",matrix[i][j]);
			}
			System.out.println("]");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int cols=sc.nextInt();
		int mat[][]=new int [rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the element at ["+i+","+j+"]:");
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix created is:");
		printMatrix(mat);
		makeZeroes(mat);
		System.out.println("Matrix after setting zeroes:");
		printMatrix(mat);
		sc.close();
		

	}

}
