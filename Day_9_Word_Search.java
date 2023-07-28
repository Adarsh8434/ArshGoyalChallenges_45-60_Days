public class Day_9_Word_Search {
     public static boolean search(char[][] board,String word,int row,int col,int index){
            int m = board.length;
            int n = board[0].length;
            if(index==word.length()) return true;
            if(row<0 || col<0 || row==m || col==n || board[row][col]!=word.charAt(index) || board[row][col]=='!'){
                return false;
            }
         char ch=board[row][col];
         board[row][col]='!';
        boolean top=search(board,word,row-1,col,index+1);
         boolean right=search(board,word,row,col+1,index+1);
         boolean left=search(board,word,row,col-1,index+1);
         boolean down=search(board,word,row+1,col,index+1);
         board[row][col]=ch;
         return top||left||right||down;
        }
           public static boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            int index=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]==word.charAt(index)){
                        if(search(board,word,i,j,index)){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    public static void main(String[] args) {
       char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SaEE"  ;
        boolean ans=exist(board,word);
        System.out.println(ans);

     
    }
}
