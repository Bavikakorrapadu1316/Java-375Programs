package Introduction;
public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
