public class Day_5_Container_With_Most_Water {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
     int n=arr.length;
     int left=0;
     int right=n-1;
     int ans=0;
     for(int i=0;i<n;i++){
        ans=Math.max(ans, Math.min(arr[left], arr[right])*(right-left));
        if (arr[left]<arr[right]) {
            left++;
        }else{
            right--;
        }
     }
     System.out.println(ans);
    }
}
