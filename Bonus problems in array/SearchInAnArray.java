import java.util.Scanner;

public class Main {
    public static int BinarySearch(int[] arr,int start,int end,int x){
        while(start<=end){
            int mid = ((start+end)/2);
            if (arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

	public static int findpivot(int[] arr,int n){
        int start=0;
        int end = n-1;
        if (start==end && arr[start]<arr[end]){
            return start;
        }
        if (end<start){
            return -1;
        }
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid]>arr[mid+1]){
                return mid+1;
            }
            else if (arr[start]<arr[mid]){
                start=mid +1;
            }
            else{
                end=mid-1;
            }
        }
        return 0;
        
        
        
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        
        int pivotindex=findpivot(arr,n);
        // System.out.println(pivotindex);
        if (arr[pivotindex]==x){
            System.out.println(pivotindex);
        }
        // System.out.println(pivotindex);
        else if (x<arr[pivotindex]){
            int ans = BinarySearch(arr,0,pivotindex-1,x);
            System.out.println(ans);
        }
        else{
            int ans = BinarySearch(arr,pivotindex+1,arr.length-1,x);
            System.out.println(ans);
        }
        
	}

}
