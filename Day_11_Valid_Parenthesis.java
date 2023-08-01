import java.util.Stack;

public class Day_11_Valid_Parenthesis {
   
      public static boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<>(); 
           for(int i=0;i<s.length();i++){
               char ch=s.charAt(i);
                    if(ch=='(' || ch=='{' || ch=='[')
                    {
                           stack.push(ch);
                    }
           else{
               if(stack.isEmpty())
               {
                   return false;
               }
               char top=stack.pop();
            if(ch==')' && top!='(' || ch==']' && top!='[' || ch=='}' && top!='{')               {                   
                            return false;
                 }
           }
           }
           return stack.isEmpty() && s.length()%2==0;
   }
   public static void main(String[] args) {
            String s="[[[]]]";
            boolean ans=isValid(s);
            System.out.println(ans);

   }
}