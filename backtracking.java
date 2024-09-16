package day37;

//n queen
//there are n queen,the queen can travel at any direction but cannot cross eachother
//place the queen at the place where they wount cross each other in the matrix


public class backtracking {

    public static void main(String[] args) {
        int n = 8; // You can change this value for different board sizes
        solveNQueens(n);
    }

    public static void solveNQueens(int n) {
        int[] queens = new int[n];
        placeQueens(queens, 0, n);
    }

    private static void placeQueens(int[] queens, int row, int n) {
        if (row == n) {
            printQueens(queens);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValid(queens, row, i)) {
                queens[row] = i;
                placeQueens(queens, row + 1, n);
            }
        }
    }

    private static boolean isValid(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || Math.abs(queens[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private static void printQueens(int[] queens) {
        int n = queens.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
