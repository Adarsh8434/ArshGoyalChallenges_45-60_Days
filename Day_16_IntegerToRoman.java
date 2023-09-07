public class Day_16_IntegerToRoman {
    public static void main(String[] args) {
        int num=1222;

        int Value[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String romanValue[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman=new StringBuilder();
        for(int i=0;i<Value.length;i++){
            while(num>=Value[i]){
                num=num-Value[i];
                roman.append(romanValue[i]);
            }
        }
        String s=roman.toString();
         System.out.println(s);
    }
}
