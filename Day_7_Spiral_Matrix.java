import java.util.ArrayList;

public class Day_7_Spiral_Matrix{
    public static void main(String[] args) {
        int arr[][]={{11,12,13,50},{14,15,16,51},{17,18,19,53},{10,11,12,55},{13,14,15,54}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        ArrayList <Integer> li=new ArrayList<>();
        int top=0;
        int left=0;
        int right=arr[0].length-1;  //3
        int bottom=arr.length-1;  //4
        System.out.println(right);
        while(left<=right && top<=bottom){

            for(int i=left;i<=right;i++) {
                li.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                li.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                li.add(arr[bottom][i]);
            }
            bottom--;
        }
        if(left<=right)
        {
            for(int i=bottom;i>=top;i--){
                li.add(arr[i][left]);
            }
            left++;
        }
        }
        System.out.println(li);
    }
}