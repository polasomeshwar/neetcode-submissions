class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    String rs = ""+board[i][j]+" at "+i+"row";
                    String cs = ""+board[i][j]+" at "+j+"column";
                    String megaS = ""+board[i][j]+"mega"+i/3+""+j/3;
                    if(set.contains(rs)||set.contains(megaS)||set.contains(cs)){
                        return false;
                    }
                    set.add(rs);
                    set.add(cs);
                    set.add(megaS);
                }
            }
        }
        return true;
    }
}
