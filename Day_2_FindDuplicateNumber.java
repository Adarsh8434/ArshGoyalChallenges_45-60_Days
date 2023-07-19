public class Day_2_FindDuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {9,1,9,4,0};
        int n = arr.length;
        int ans=0;
       
        for (int i=0;i<n;i++) {
            
          for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                ans=arr[i];
            }
          }
        }
       
        System.out.println(ans);
    }
}
