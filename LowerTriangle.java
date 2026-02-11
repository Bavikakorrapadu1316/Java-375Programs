package Arrays;
public class LowerTriangle {
    public static void main(String[] args) {
        // Example 3x3 square matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int n = matrix.length;
        int sum = 0;

        // Logic for Lower Triangle Sum
        for (int i = 0; i < n; i++) {
            // j runs from 0 up to the diagonal (i)
            for (int j = 0; j <= i; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of elements in Lower Triangle: " + sum);
    }
}
