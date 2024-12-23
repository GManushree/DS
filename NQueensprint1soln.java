//print only 1 solution

public class NQueensprint1soln {
    static int count=0;
    public static void main(String args[]) {
        int n = 4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        
        if(nQueens(board,0)){
            System.out.println("SOLN IS POSSIBLE");
            printBoard(board);
        }
        else{
            System.out.println("soln not possible");
        }
        System.out.println("no of ways to solve nqueens problem is:"+count);
    }
    public static boolean nQueens(char board[][],int row){
        if(row==board.length){//base
            //printBoard(board);
            count++;
            return true;
        }


        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            if(nQueens(board,row+1)){
                return true;
            }
            board[row][j]='x';//backtracking
        }
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("--------chess board---------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //vertically left
        for(int i=row-1,j=col-1 ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1 ; i>=0 && j<board.length ; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }    
}


