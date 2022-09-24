public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long mid() {
        long min = sales[0];
        long max = -1;
        long sum = 0;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            } else if (sale < min) {
                min = sale;
            }
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != min && sales[i] != max) {
                sum += sales[i];
            }
        }
        long mid = sum / (sales.length - 2);
        return mid;
    }
}
