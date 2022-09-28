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

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            } else if (sales[i] < min) {
                min = sales[i];
            }
            if (sales[i] != -1) {
                sum += sales[i];
            }
        }
        sum = sum - max;
        sum = sum - min;
        long mid = sum / (sales.length - 2);
        return mid;
    }
}
