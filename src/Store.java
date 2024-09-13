public class Store {
    final static int price1 = 15;
    final static int price2 = price1 - 5;
    final static int price3 = price2 -5;
    final static int p1 = price1 * 2;
    final static int p2 = price2 * 3;
    final static int p3 = price3 * 4;
    final static int totalSales = p1 + p2 + p3;
    public static void main(String[] args) {
       if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
