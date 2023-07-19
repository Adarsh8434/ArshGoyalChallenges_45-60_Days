import java.util.Scanner;
import java.util.Arrays;

public class Day_2_chocolateDistribution {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no of student");
        int m=scn.nextInt();
        // int m=7;
        int arr[]={12, 4, 7, 9, 2, 23, 25, 41,
           30, 40, 28, 42, 30, 44, 48,
           43, 50};
           int n=arr.length;
           if(m==0 || n==0){
            System.out.println("We don`t having chocolate and students");
                }
             Arrays.sort(arr);
            //  int min_diff=Integer.MAX_VALUE;
                      int min_diff=1000;
             int diff;

             for(int i=0;i+m-1<n;i++){
               diff=arr[i+m-1]-arr[i];
               if(min_diff>diff )
               {
                         min_diff=diff;
               }
               
             }
            
             System.out.println(min_diff);

        
    }
    
}
