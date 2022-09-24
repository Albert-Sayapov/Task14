public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int mid() {
        int min = sales[0];
        int max = -1;
        int sum = 0;
        for (int sale : sales) {
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
        int mid = sum / (sales.length - 2);
        return mid;
    }
}
