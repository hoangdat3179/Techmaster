public class Bai485 {
    public static int findMaxConsecutiveOnes(int[] a) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < a.length; i++) {
            count = (a[i] == 1) ? (count + 1) : 0;
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 0, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
