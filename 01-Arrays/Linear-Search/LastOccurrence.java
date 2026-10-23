class LastOccurrence {
    public static void main(String[] args) {
        int[] prices = {250, 450, 120, 450, 300, 450};
        int target = 450;
        int lastIndex = -1;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == target) {
                lastIndex = i;
            }
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence found at index " + lastIndex);
        } else {
            System.out.println("Target not found");
        }
    }
}
