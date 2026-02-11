package Arrays;
public class SaddlePoint {
    public static void findSaddlePoint(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            // Step 1: Find the minimum element in the current row
            int rowMin = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Step 2: Check if this rowMin is the maximum in its column
            boolean isSaddle = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    isSaddle = false;
                    break;
                }
            }

            // Step 3: Print result if it's a saddle point
            if (isSaddle) {
                System.out.println("Saddle Point found: " + rowMin + " at [" + i + "][" + colIndex + "]");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point found in the matrix.");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        findSaddlePoint(matrix);
    }
}
