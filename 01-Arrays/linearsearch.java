class linearsearch {
    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 21, 7, 15}; // array of integers
        int target = 21;

        boolean found = false;          // flag to indicate if the target is found

        for (int i = 0; i < arr.length; i++) {      // loop through the array
            if (arr[i] == target) {         // check if the current element is the target
                found = true;               // set found to true if target is found
                System.out.println("Target found at index: " + i);
                return;         // exit the program if target is found
            }
            // else{
            //     found = false;
            // }
        }
         System.out.println("target not found");
    }
}
