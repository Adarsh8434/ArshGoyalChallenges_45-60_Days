public class Day_18_ClimbingStairs {
    public static int climbStairs(int n) {
        int t[]=new int[n+1];
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        t[0]=1;
        t[1]=1;
        for(int i=2;i<=n;i++){
            t[i]=t[i-1]+t[i-2];
        }
        
  return t[n];

    }
    public static void main(String[] args) {
        int n=4;
        int ans=climbStairs(n);
        System.out.println(ans);

    }
}
