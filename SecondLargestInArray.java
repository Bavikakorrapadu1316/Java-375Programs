package Introduction;
public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 30, 40, 50};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest && j != largest) {
                secondLargest = j;
            }
        }
        System.out.println("The second largest element in the array is: " + secondLargest);
    }
}
