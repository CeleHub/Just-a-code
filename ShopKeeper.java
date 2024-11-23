public class ShopKeeper {
    public static void main(String[] args) {
        int numBags = 10;
        int pricePerBag = 500;
        double discountRate = 0.05;

        double totalSales = numBags * pricePerBag;
        double discountAmount = totalSales * discountRate;
        double finalAmount = totalSales - discountAmount;

        System.out.printf("The buyer paid: %.2f Naira", finalAmount);
    }
}