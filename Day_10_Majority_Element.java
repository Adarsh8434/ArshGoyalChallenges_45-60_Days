import java.util.HashMap;
import java.util.Map;

public class Day_10_Majority_Element {
    public static void main(String[] args) {
        int arr[]={3,2,3};
        int n=arr.length-1;
        int ans=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<=n;i++){
            int n1=arr[i];
            if(mp.containsKey(n1)){
                mp.put(n1, mp.get(n1)+1);
            }else{
                mp.put(n1,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
             int n2=entry.getKey();
             int n3=entry.getValue();
             if(n3>=n/2+1){
                ans=n2;
             }
        }
        System.out.println(ans);
    }
}
