public class Day_1_MoveZero {
    public static void main(String[] args) {
        int arr[]={8,9,0,1,0,5,1};
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[temp++]=arr[i];
            }
            
        }
        while(temp<n){
            arr[temp++]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print("{"+arr[i]+" }");
        }
    }
}
