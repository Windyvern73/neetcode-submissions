class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] rows = new HashSet[9];
        HashSet<Integer>[] cols = new HashSet[9];
        HashSet<Integer>[] boxes = new HashSet[9];
        for(int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Integer>();
            cols[i] = new HashSet<Integer>();
            boxes[i] = new HashSet<Integer>();
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                char c = board[i][j];
                if(c == '.') {
                    continue;
                }
                int n = c - '0';
                if(!rows[i].add(n) || !cols[j].add(n) || !boxes[3*(i/3) + j/3].add(n)) {
                    return false;
                }
            }
        }
        return true;
    }
}
