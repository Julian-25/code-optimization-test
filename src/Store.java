public class Store {
    //ELIMINACION DE VALORES MAGICOS MEDIANTE LA HERRAMIENTA FINAL STATIC.
    final static int PRICE1 = 15;
    final static int PRICE2 = 10;
    final static int PRICE3 = 5;
    final static int TOTAL1 = PRICE1 * 2;
    final static int TOTAL2 = PRICE2 * 3;
    final static int TOTAL3 = PRICE3 * 4;
    final static int totalSales = PRICE1 + PRICE2 + PRICE3;
    final static int VENTASSUPERIORES = 50;
    public static void main(String[] args) {
        int []Precios = {TOTAL1,TOTAL2,TOTAL3}

       if (totalSales > VENTASSUPERIORES) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
