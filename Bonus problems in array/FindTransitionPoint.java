# def fun(arr,n):
#     i=0
#     end=n-1
#     while i<=end:
#         mid= (i+end)//2
#         if arr[mid]==0:
#             i=mid+1
#         elif arr[mid]==1 and (arr[mid-1]==0 or mid==0):
#             return mid
#         else:
#             end=mid-1
#     return -1

# n=int(input())
# if n>0:
#     l=[int(x) for x in input().split()]
#     print(fun(l,n))
# else:
#     print(fun([],n))

import java.util.Scanner;

public class Main {

    public static int fun(int[] arr,int n){
        int i=0;
        int end=n-1;
        while (i<=end){
            int mid = (i+end)/2;
            if (arr[mid]==0){
                i=mid +1;
            }
            else if (arr[mid]==1 && (mid==0 || arr[mid-1]==0 )){
                return mid;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(fun(arr,n));

    }

}