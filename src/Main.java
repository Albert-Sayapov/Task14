
public class Main {
    public static void main(String[] args) {

        long[] sales = new long[5];
        sales[0] = 1680;
        sales[1] = 2260;
        sales[2] = 1000;
        sales[3] = 45663;
        sales[4] = 1000;
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.mid());
    }
}
