package leetcode.arrays_and_hashing;
import java.util.HashSet;
import java.util.Set;

public class Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer>[] rows = new HashSet[9];
        Set<Integer>[] columns = new HashSet[9];
        Set<Integer>[][] subgrids = new HashSet[3][3];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
        }
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                subgrids[r][c] = new HashSet<>();
            }
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char cell = board[r][c];

                if (cell == '.') continue;
                int num = cell - '0';

                if (rows[r].contains(num)) return false;
                if (columns[c].contains(num)) return false;
                if (subgrids[r / 3][c / 3].contains(num)) return false;

                rows[r].add(num);
                columns[c].add(num);
                subgrids[r / 3][c / 3].add(num);
            }
        }

        return true;
    }
}
