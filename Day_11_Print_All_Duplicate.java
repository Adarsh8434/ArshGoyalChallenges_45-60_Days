import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Day_11_Print_All_Duplicate {
    public static void main(String[] args) {
        String s="aabbcdd";
        HashMap<Character,Integer> mp=new HashMap<>();
        ArrayList<Character> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }else{
                mp.put(ch, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry:mp.entrySet()){
            char c=entry.getKey();
            int x=entry.getValue();
            if(x>1){
                li.add(c);
            }
        }
        System.out.println(li);
    }
}
