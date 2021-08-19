package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
if ( Win.horizonta( board, i) == Win.vertical( board, i)){
    rsl = false;
}
            }
        }
        return rsl;
    }

    private   static  boolean horizonta( int [][] board, int index){
        boolean rst = true;
        for (int i = 0; i < board[index].length; i++) {
            if (board[index][i] == 0) {
                rst = false;
            break;
            }
        }
        return  rst;
    }
private   static  boolean vertical (int [][] board, int index){
        boolean rsl = true;
    for (int i = 0; i <board.length ; i++) {
        if (board[i][index] == 0) {
            rsl = false;
        break;
        }
    }
    return  rsl;
    }
}
