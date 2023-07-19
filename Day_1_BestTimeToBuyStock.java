public class Day_1_BestTimeToBuyStock {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int n=arr.length;
        int min=arr[0];
        int max=0;
        int profit=0;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            profit=arr[i]-min;
            max=Math.max(max, profit);
        }
        System.out.println("The maximun profit is "+ max);
    }
}
