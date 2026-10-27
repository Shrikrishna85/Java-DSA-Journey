class BinarySearch {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int low = 0;
        int high = numbers.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (numbers[mid] == target) {
                System.out.println("Target found at index: " + mid);
                found = true;
                break;
            }
            else if (numbers[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Target not found");
        }
    }
}