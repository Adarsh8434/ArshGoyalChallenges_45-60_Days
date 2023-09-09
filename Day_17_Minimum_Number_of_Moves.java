public class Day_17_Minimum_Number_of_Moves{
    public static void main(String[] args) {
        String x="leetcode";
        StringBuilder str=new StringBuilder(x).reverse();
        String y=str.toString();
        int m=x.length();
        int ans=MinimumNumOfInsertion(x,y,m);
        System.out.println(ans);
    }

    private static int MinimumNumOfInsertion(String x, String y, int m) {
       int t[][]=new int [m+1][m+1];
       for(int i=0;i<m+1;i++){
        for(int j=0;j<m+1;j++){
            if(i==0 || j==0){
                t[i][j]=0;
            }
        }
       }
       for(int i=1;i<m+1;i++){
        for(int j=1;j<m+1;j++){
          if(x.charAt(i-1)==y.charAt(j-1) ){
            t[i][j]=1+t[i-1][j-1];
          }else{
            t[i][j]=Math.max(t[i-1][j], t[i][j-1]);
          }
        }
       }
       return m-t[m][m];
    }
}