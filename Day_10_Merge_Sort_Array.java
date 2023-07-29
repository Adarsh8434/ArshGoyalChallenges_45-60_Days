import java.util.ArrayList;

public class Day_10_Merge_Sort_Array{
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int n=3;
        int nums2[]={2,5,6};
        int m=3;
          search(nums1,m,nums2,n);
       for(int k=0;k<nums1.length;k++){
           System.out.println(nums1[k]);
       }
    }


    
    public static void search(int[] nums1,int m,int[] nums2,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
             nums1[k--]=nums2[j--];   
            }
        }
        while(j>=0){
        nums1[k--]=nums2[j--];
        }
         while(i>=0){
        nums1[k--]=nums1[i--];
        }
    }
}