public class Day_2_SortColor {
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int arr[]={2,0,1,2,0,1,2};
        int left=0;
        int mid=0;
        int right=arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
                swap(arr,left++,mid++);
            }
            else if(arr[mid]==2){
                swap(arr,right--,mid);
            }
            else{
                mid++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
