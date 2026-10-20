public class ProductSearch {

    public static void main(String[] args) {

        int[] productIds = {104, 205, 118, 309, 412, 225};
        int searchId = 309;

        boolean found = false;

        for (int i = 0; i < productIds.length; i++) {

            if (productIds[i] == searchId) {
                found = true;
                System.out.println(
                    "Product " + searchId +
                    " found at index: " + i
                );
                break;
            }
        }

        if (!found) {
            System.out.println("Product " + searchId + " not found");
        }
    }
}