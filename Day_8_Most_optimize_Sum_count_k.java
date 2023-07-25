public class Day_8_Most_optimize_Sum_count_k {
    public static void main(String[] args) {
        
                int arr[]={4,1,1,1,2,2,3,5};;
                int k=5;
                int i=0;
                int j=0;
                int sum=0;
                int ans=0;
                while(j<arr.length){
                   sum=sum+arr[j];
                    while(sum>k){
                        sum=sum-arr[i];
                        i++;
                    }
                   if(sum<k){
                    j++;
                   }
               
                   else if(sum==k){
                    ans++;
                    j++;
                   }
                }
                System.out.println(ans);
            }
        }
        
 
