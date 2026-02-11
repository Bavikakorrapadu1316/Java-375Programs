package Arrays;
public class Rowcoloumn {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;

        // Loop through each index
        for (int i = 0; i < n; i++) {
            int rSum = 0, cSum = 0;
            for (int j = 0; j < n; j++) {
                // Summing across the row (i remains constant, j changes)
                rSum += matrix[i][j];
                // Summing down the column (j changes, i remains constant)
                cSum += matrix[j][i];
            }
            System.out.println("Row " + (i + 1) + " Sum: " + rSum);
            System.out.println("Col " + (i + 1) + " Sum: " + cSum);
            System.out.println("-----------------");
        }
    }
}

