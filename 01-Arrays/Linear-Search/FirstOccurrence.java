class FirstOccurrence {
    public static void main(String[] args) {
        int[] prices = {250, 450, 120, 450, 300, 450};
        int target = 450;
        boolean search = false;
        for(int i=0;i<prices.length;i++){
            if(prices[i]==target){
                search=true;
                System.out.println("is the occurance"+" "+i);
                break;
            }
        }
        System.out.println(search);
    }
}