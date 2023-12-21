import java.util.*;
public class Day16_Postfix_Evaluation {
    public static void main(String[] args) {
        String S = "231*+9-";
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            int ascii=(int) ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }else{
                int s1=st.pop();
                int s2=st.pop();
                if(ch=='*') st.push(s2*s1);
                else if(ch=='+') st.push(s2+s1);
                else if(ch=='/') st.push(s2/s1);
                else st.push(s2-s1);
            }
        }
        int ans=st.pop();
       System.out.println(ans);
    }
}
