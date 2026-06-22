package codepractise;
import java.util.*;
public class Matrix {
	private int[][] matrix;
	private int n;

	public Matrix(int[][] inputmatrix) {
		if(inputmatrix.length==0||inputmatrix.length!=inputmatrix[0].length) {
			throw new IllegalArgumentException("Matrix must be nom empty squares pls check");
		}
		this.matrix=inputmatrix;
		this.n=inputmatrix.length;
	}
	public void printMatrix() {
		for(int i=0;i<n;i++) {
			System.out.print("[");
		for(int j=0;j<n;j++) {
			System.out.printf("%-4d",matrix[i][j]);
		}
		System.out.println("]");
		}
	}
	public void rotate90Degrees() {
		int [][] rotated=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				rotated[j][n-1-i]=matrix[i][j];
			}
		}
		this.matrix=rotated;
	}
	public int calculateDet() {
		return determinRec(this.matrix);
	}
	private int determinRec(int [][]mat) {
		int size=mat.length;
		if(size==1) {
			return mat[0][0];
		}
		if(size==2) {
			return (mat[0][0]*mat[1][1])-(mat[0][1]*mat[1][0]);
		}
		int determinent=0;
		for(int col=0;col<size;col++) {
			int submat[][]=createsubmatrix(mat,0,col);
			int sign=(col%2==0)?1:-1;
			determinent+=sign*mat[0][col]*determinRec(submat);
		}
		return determinent;
	}
	private int[][] createsubmatrix(int[][]mat,int excludeR,int excludeC) {
		int size=mat.length;
		int sub[][]=new int[size-1][size-1];
		int r=0,c=0;
		for(int i=0;i<size;i++) {
			if(i==excludeR) continue;
			c=0;
			for(int j=0;j<size;j++) {
				if(j==excludeC) continue;
				sub[r][c]=mat[i][j];
				c++;
			}
			r++;
		}
		return sub;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array for N*N:");
		int n=sc.nextInt(); 
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter the element in ["+i+","+j+"]:");
				arr[i][j]=sc.nextInt();
			}
		}
		Matrix m=new Matrix(arr);
		System.out.println("The "+n+"X"+n+" matrix you entered:");
		m.printMatrix();
		System.out.println("The determinent for the "+n+"X"+n+" is:"+m.calculateDet());
		System.out.println("The 90 Degree rotation of your "+n+"X"+n+" is:");
		m.rotate90Degrees();
		m.printMatrix();
		
		sc.close();
	}
	

}
