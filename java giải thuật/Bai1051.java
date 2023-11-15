public class Bai1051 {
    public int heightChecker(int[] h) {
        int[] r = new int[h.length];
        for (int i = 0; i < h.length; i++)
            r[i] = h[i];
        Arrays.sort(r);
        int count = 0;
        for (int i = 0; i < h.length; i++)
            if (r[i] != h[i])
                count++;
        return count;
    }
}