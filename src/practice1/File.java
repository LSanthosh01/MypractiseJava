package practice1;
import java.util.*;

public class File {
    static boolean ispossible(int[] arr,int n,int m,int maxpages){
        int students=1; //12 34 67 90    maxpages=146
        int sum=0;

        for(int i=0;i<n;i++){ //i=0 1 2 3
            if(arr[i]>maxpages){
                return false;
            }
            if(sum+arr[i]>maxpages){
                students++; 
                sum=arr[i];
                if(students>m)
                    return false;

            }
            else{
                sum+=arr[i]; //12 + 34 + 67
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //n=4
        int m=sc.nextInt(); //m=3
        
        int[] arr=new int[n]; // 12 34 67 90
        int sum=0,max=0;

        for(int i=0;i<n;i++){//i=0 i=1 i=2 i=3
            arr[i]=sc.nextInt();
            sum+=arr[i]; //0+12=12+34=46+67=113+90=203
            max=Math.max(max,arr[i]); //12/ 34 / 67/ 90
        }

        int low=max,high=sum;
        int res=-1;

        while(low<=high){
            int mid=low+(high-low)/2; //
            if(ispossible(arr,n,m,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(res);
    }
}