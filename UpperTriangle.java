package Arrays;
public class UpperTriangle {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;
        int sum = 0;

        // Nested loops for upper triangle traversal
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of elements in Upper Triangle: " + sum);
    }
}
