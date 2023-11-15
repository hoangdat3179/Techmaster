public class Bai1221 {

    public static int balancedStringSplit(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            l = (arr[i] == 'L') ? (l + 1) : (l - 1);
            count = (l == 0) ? (count + 1) : count;
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "LLLSSSLSLLSS";
        System.out.println(balancedStringSplit(s));
    }
}
