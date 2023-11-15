import java.util.Arrays;

public class ThirdMax {
    // null -> ref
    public static int thirdMax(Integer[] a) {
        Arrays.sort(a);
        long x = Long.MAX_VALUE;
        int count = 0;
        int n = a.length;

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != x) {
                x = a[i];
                count++;
            }
            if (count == 3) {
                return a[i];
            }
        }

        return a[n - 1];
    }

    public static void main(String[] args) {

    }

}
