
public class Main {
    public static void main(String[] args) {
        long[] sales = new long[2];
        sales[0] = 1680;
        sales[1] = 2260;
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
