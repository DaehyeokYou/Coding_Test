package com.ydh.problem;

// https://leetcode.com/problems/word-search/description/
public class Solution79 {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(search(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean search(char[][] board, String word, int m, int n, int index) {
        if(index == word.length()) {
            return true;
        }

        if(m < 0 || board.length <= m || n < 0 || board[0].length <= n)
            return false;

        char findChar = word.charAt(index);
        if(board[m][n] != findChar)
            return false;

        board[m][n] = '#';  // check
        boolean found =
                search(board, word, m+1, n, index+1) ||
                search(board, word, m-1, n, index+1) ||
                search(board, word, m, n+1, index+1) ||
                search(board, word, m, n-1, index+1);

        board[m][n] = findChar; // backtrack
        return found;
    }


}
