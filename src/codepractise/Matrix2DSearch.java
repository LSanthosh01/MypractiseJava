package codepractise;
import java.util.*;
public class Matrix2DSearch {
	public static boolean isSorted(int[][] matrix) {
		int rows=matrix.length;
		int cols=matrix[0].length;
		int totalelements=rows*cols;
		for(int i=0;i<totalelements-1;i++) {
			int r1=i/cols;
			int c1=i%cols;
			int r2=(i+1)/cols;
			int c2=(i+1)%cols;
			if(matrix[r1][c1]>matrix[r2][c2]) {
				return false;
			}
		}
		return true;
	}
	public static List<int[]> matrixSearch(int[][] matrix,int target) {
		List<int[]>result=new ArrayList<>();
		int rows=matrix.length;
		int cols=matrix[0].length;
		int low=0;
		int high=(rows*cols)-1;
		int foundindex=-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			int trow=mid/cols;
			int tcol=mid%cols;
			int midval= matrix[trow][tcol];
			if(midval==target) {
				foundindex=mid;
				break;
			}else if(midval<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if(foundindex!=-1) {
			int left=foundindex;
			while(left>=0 && matrix[left/cols][left%cols]==target) {
				result.add(0,new int[] {left/cols,left%cols});
				left--;
			}
			int right=foundindex+1;
			while((right<rows*cols) && matrix[right/cols][right%cols]==target) {
				result.add(new int[] {right/cols,right%cols});
				right++;
			}
		}
		return result;
		
	
	}
	public static List<int[]> matrixLinearSearch(int[][] matrix,int target) {
		int rows=matrix.length;
		int cols=matrix[0].length;
		List<int[]>result=new ArrayList<>();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(matrix[i][j]==target) {
					result.add(new int[] {i,j});
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int cols=sc.nextInt();
		int mat[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the element in ["+i+","+j+"]:");
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix you created:");
		for(int i=0;i<rows;i++) {
			System.out.print("[");
			for(int j=0;j<cols;j++) {
				System.out.printf("%-4d",mat[i][j]);
			}
			System.out.println("]");
		}
		if(mat==null||mat.length==0||mat[0]==null||mat[0].length==0) {
			System.out.println("Enpty matrix provided");;
		}
		System.out.println();
		System.out.println("Enter the element to search:");
		int n=sc.nextInt();
		List<int[]> result;
		if(isSorted(mat)) {
			System.out.println("The matrix is sorted so applying binary search to find target element");
			result=matrixSearch(mat,n);
		}else {
			System.out.println("The matrix is not sorted so applying linear search");
			result=matrixLinearSearch(mat,n);
		}
		if(!result.isEmpty()) {
			System.out.println("The target "+n+" found at "+result.size()+" locations:");
			for(int i=0;i<result.size();i++) {
				int coords[]= result.get(i);
				if(i==0) {
					System.out.println("Primary location: ["+coords[0]+","+coords[1]+"]");
				}else {
					System.out.println("Duplicate location "+i+":["+coords[0]+","+coords[1]+"]");
				}
			}
		}else {
			System.out.println("element not found!!!!");
		}

	}

}
