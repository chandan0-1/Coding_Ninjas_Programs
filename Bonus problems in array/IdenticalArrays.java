import java.util.Scanner;

public class Main {

    public static int CheckMyArray(int Array1[],int Array2[])
    {

        int count=0;
        for(int i=0;i<Array1.length;i++)
        {
            if (Array1[i]==Array2[i])
            {
                continue;
            }
            else{
                for(int j=i+1;j<Array1.length;j++)
                {
                    if (Array2[j]==Array1[i])
                    {
                        int temp=Array2[i];
                        Array2[i]=Array2[j];
                        Array2[j]=temp;
                        count=count+1;
                    }
                }
                
            }
        }
 return count;
        
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int Array1size=scan.nextInt();
        int Array1[]=new int[Array1size];
        for(int i=0;i<Array1size;i++)
        {
            Array1[i]=scan.nextInt();

        }
        int Array2[]=new int [Array1size];
        for(int i=0;i<Array1size;i++)
        {
            Array2[i]=scan.nextInt();

        }
        System.out.println(CheckMyArray(Array1,Array2));

    }

}
