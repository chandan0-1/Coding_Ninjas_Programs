// # n=int(input())
// # l=list(map(int,input().split()))
// # x=int(input())
// # l.sort()
// # diff=0
// # for i in range(len(l)-x+1):
// #     d=l[i+x-1]-l[i]
// #     if diff==0:
// #         diff=d
// #     elif d<diff:
// #         diff=d
// # print(diff)


# ----------------------Java Imlementation____________________________

import java.util.Scanner;

public class Main {

	public static void Sorting(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
        for (int j=0;j<n-1-i;j++){
            if (arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
        }
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        Sorting(arr);
        int temp=0;
        for (int j=0;j<n-x+1;j++){
            if (temp==0){
                temp=arr[j+x-1]-arr[j];
                
            }
            else if (temp>arr[j+x-1]-arr[j]){
             temp=arr[j+x-1]-arr[j];   
            }
                
                
            }
		System.out.println(temp);
	}

}