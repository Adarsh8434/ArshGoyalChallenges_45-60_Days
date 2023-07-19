public class Day_3_RemovedDuplicate{
    public static void main(String[] args) {
    int nums[]={1,2,1,3,4,2};
    
 int temp=0;
      for(int i=0;i<nums.length;i++){
          int count=0;
          for(int j=i+1;j<nums.length;j++){
              if(nums[i]==nums[j]){
                  count++;
              }
             
          }
           if(count==0){
                  nums[temp++]=nums[i];
              }
      } 
     System.out.println(temp);
     
    }
}