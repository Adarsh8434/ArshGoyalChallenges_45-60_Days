public class Day_5_Max_point_obtain_card {
    public static void main(String[] args) {
        int sum=0;
        int k=3;
        int cardPoints[]={3,2,5,3,7,8,06,34};

        int n=cardPoints.length;
       if(k==n){
           for(int i=0;i<n;i++){
           sum=sum+cardPoints[i];
           }
           System.out.println(sum);
       }
       int max=0;
       int left=0;
       int right=0;
       for(int i=0;i<k;i++){
           left=left+cardPoints[i];
       }
      max=left;
      for(int i=0;i<k;i++){
          left=left-cardPoints[k-i-1];
          right=right+cardPoints[n-i-1];
          max=Math.max(max,right+left);
      }
System.out.println(max);
    }
}
