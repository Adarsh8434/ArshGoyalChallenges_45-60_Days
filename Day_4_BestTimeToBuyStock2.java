public class Day_4_BestTimeToBuyStock2 {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int n=arr.length;
        int profit=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1])
            profit=profit+(arr[i]-arr[i-1]);
        }
    System.out.println(profit);
    }

}
