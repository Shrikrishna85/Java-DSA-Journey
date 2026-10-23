
class BooleanSearch {
    public static void main(String[] args) {
        int[] prices = {250, 450, 120, 450, 300, 450};
        int target = 700;
        boolean found = false;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == target) {
                found = true;
                break;
            }
        }

        System.out.println("Target exists: " + found);
    }
}
