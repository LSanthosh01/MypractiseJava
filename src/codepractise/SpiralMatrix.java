package codepractise;
import java.util.*;
public class SpiralMatrix {
	public static int[] spiralPrint(int [][] matrix) {
		if(matrix==null||matrix.length==0||matrix[0].length==0) {
			return new int[0];
		}
		int rows=matrix.length;
		int col=matrix[0].length;
		int index=0;
		int res[]=new int[rows*col];
		int top=0,bottom=rows-1,left=0,right=col-1;
		while(top<=bottom&&left<=right) {
			for(int j=left;j<=right;j++) {
				res[index++]=matrix[top][j];
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				res[index++]=matrix[i][right];
			}
			right--;
			if(top<=bottom) {
				for(int j=right;j>=left;j--) {
					res[index++]=matrix[bottom][j];
				}
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					res[index++]=matrix[i][left];
				}
				left++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the no. of columns:");
		int cols=sc.nextInt();
		int mat[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the element at ["+i+","+j+"]:");
				mat[i][j]=sc.nextInt();
			}
		}
		int spiral[]= spiralPrint(mat);
		System.out.println("The Spiral matrix is:");
		System.out.print("[");
		for(int i=0;i<spiral.length;i++) {
				System.out.print(spiral[i]);
				if(i<spiral.length-1) {
					System.out.print(", ");
				}
		}
		System.out.println("]");


	}

}
