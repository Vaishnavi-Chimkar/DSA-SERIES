class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }

                int row = i;
                int col = j;
                int digit = board[i][j];

                //row
                for(int c = 0 ; c<board.length;c++){
                    if(c!=col && board[row][c]==digit){
                        return false;
                    }
                }

                //col
                for(int r = 0;r<board.length;r++){
                    if(r!=row && board[r][col]==digit){
                        return false;
                    }
                }

                //grid
                int sr = (row/3)*3;
                int sc = (col/3)*3;
                for(int r = sr;r<sr+3;r++){
                    for(int c =sc;c<sc+3;c++){
                        if((r!=row || c!=col) && board[r][c]==digit){
                            return false;
                        }
                    }
                }
            }
        }
        return true;  
    }
}