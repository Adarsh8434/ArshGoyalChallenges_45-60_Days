public class Day_3_TwoSum{
    public static void main(String[] args) {
        int  nums []= {2,7,11,15};
        int n=nums.length;
        int target=9;
        int temp=0;
        int r[]=new int[2];
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    r[temp++]=i;
                    r[temp]=j;
                }
            }
        }
        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
    }
}