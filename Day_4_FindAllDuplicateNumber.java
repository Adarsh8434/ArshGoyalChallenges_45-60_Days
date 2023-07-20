import java.util.ArrayList;
import java.util.Arrays;

public class Day_4_FindAllDuplicateNumber {
    public static void main(String[] args) {
        int arr[]={3,4,1,3,6,4,7,9,7};
        int n=arr.length;
         ArrayList<Integer> li = new ArrayList<Integer>();
       Arrays.sort(arr);
        for(int i=1;i<n;i++){
                if(arr[i-1]==arr[i]){
                     li.add(arr[i]);
                }
                 }
                 System.out.println(li);
    }
}
