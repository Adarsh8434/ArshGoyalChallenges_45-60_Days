public class Day_6_Sum_count_k {

    public static void main(String[] args) {
        int nums[]={1,1,1};
        int k=2;
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){

                     sum=sum+nums[j];
                    if(sum==k){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}