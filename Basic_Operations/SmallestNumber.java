public class SmallestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest number in the array is: " + smallest);
    }
}
