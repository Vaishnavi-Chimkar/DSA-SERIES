class Solution {
    public static boolean isSafe(char[][] board, int row, int col) {

        // Vertical Up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Left Diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Right Diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][],int row){
        //base
        if(row == board.length){
            count++;
            return;
        }

        //column loop
        for(int j = 0 ; j < board.length ; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);//function call
                board[row][j] = '.';//backtracking step
            }
        }
    }
    
    static int count = 0;
    public int totalNQueens(int n) {
        count = 0;
        char Board[][] = new char[n][n];
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                Board[i][j] = '.';
            }
        } 

        nQueens(Board,0);
        
        return count;        
    }
}