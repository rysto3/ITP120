public class MPL20931 {
    public static void main(String[]args){
        int freeBooks = 0;
        boolean isPremiumCustomer = false;
        int nBooksPurchased = 0;
        if (isPremiumCustomer){
            if (nBooksPurchased >= 5 && nBooksPurchased < 8) {
                freeBooks = 1;
            }else if (nBooksPurchased >= 8){
                freeBooks = 2;
            }
        }else if (!isPremiumCustomer){
            if (nBooksPurchased >= 7 && nBooksPurchased < 12) {
                freeBooks = 1;
            }else if (nBooksPurchased >= 12){
                freeBooks = 2;
            }
        }
    }
}
