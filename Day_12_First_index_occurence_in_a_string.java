public class Day_12_First_index_occurence_in_a_string {
    public static int strStr(String haystack, String needle) {
        int n=haystack.length();
        int k=needle.length();
        for(int i=0;i<=n-k;i++){
            if(haystack.substring(i,i+k).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s="rohitadarsh";
        String f="arsh";
        int ans=strStr(s,f);
        System.out.println(ans);
    }
}
