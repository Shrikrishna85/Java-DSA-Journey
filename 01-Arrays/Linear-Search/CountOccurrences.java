class CountOccurrences {
    public static void main(String[] args) {
        int[] prices = {250, 450, 120, 450, 300, 450};
        int target = 450;
        int count = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == target) {
                System.out.println("Found at index " + i);
                count++;
            }
        }

        System.out.println("Total occurrences: " + count);
    }
}
