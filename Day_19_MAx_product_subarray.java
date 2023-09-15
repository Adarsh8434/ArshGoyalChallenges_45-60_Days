public class Day_19_MAx_product_subarray {
    public static int maxProduct(int nums[]) {
        int n=nums.length;     
        int ans=Integer.MIN_VALUE;
        int suff=1;
        int pre=1;
  for(int i=0;i<n;i++){
        if(pre==0){
            pre=1;
        }
        if(suff==0){
            suff=1;
        }
        pre=pre*nums[i];
        suff=suff*nums[n-1-i];

        ans=Math.max(ans,Math.max(pre,suff));
  }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,3,0,7};
        int ans=maxProduct(arr);
        System.out.println(ans);
        
    }
}
