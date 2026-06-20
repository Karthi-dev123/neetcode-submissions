class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        Set<Character>[] rows = new HashSet[board.length];
        Set<Character>[] cols = new HashSet[board[0].length];
        Set<Character>[] boxs = new HashSet[board.length];

        for(int i = 0 ; i < board.length ; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxs[i] = new HashSet<>();
        }

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j <col ; j++){
                
                char ch = board[i][j];

                if (ch == '.') continue;

                // lets calc the box it lies in - to validate the cell 
                int box = ((i/3) * 3) + (j/3);

                // declare the array of sets 
                // row , col , box 


                // check condition 
                if( !(rows[i].add(ch))  || !(cols[j].add(ch)) || !(boxs[box].add(ch)) ) return false;
                // if( !(cols[j].add(ch)) ) return false;
                // if( !(boxs[box].add(ch)) ) return false;
            }
        }
        return true;
    }
}
