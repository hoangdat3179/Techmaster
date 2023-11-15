public class Bai1089 {
    public void duplicateZeros(int[] a) {

        int[] b = new int[a.length];

        for (int i = 0, j = 0; i < a.length && j < b.length; i++) {
            if (a[i] == 0) {
                b[j] = a[i];

                int k = j + 1;
                if (k < b.length) {
                    b[k] = a[i];
                }

                j += 2;
            } else {
                b[j] = a[i];
                j += 1;
            }
        }

        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }

    }
}
