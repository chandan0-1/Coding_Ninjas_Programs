import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int length(int n){
        int l=0;
        while(n>0){
            l++;
            n/=10;
        }
        return l;
    }
	public static int[] ItoArr(int n,int l){
        
        int arr[]=new int[l];
        for (int i=l-1;i>=0;i--){
            arr[i]=n%10;
            n/=10;
        }
        return arr;
        
    }
    
    public static void Successor(int[] arr,int l){
        if (l==1){
            return;
        }
        
        int i=l-2;
        while(i>=0){
            if(arr[i]<arr[i+1]){
                break;
            }
            i--;
        }
        if (i!=-1){
            int k=i+1;
            for (int j=i+1;j<l;j++){
                if (arr[j]>arr[i] && arr[j] <arr[k]){
                    k=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k] = temp;
            
        }
        Arrays.sort(arr,i+1,l);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=length(n);
        int[] arr=ItoArr(n,l);
        Successor(arr,l);
	for(int i=0;i<l;i++){
	System.out.print(arr[i]);
	}
    }

}
