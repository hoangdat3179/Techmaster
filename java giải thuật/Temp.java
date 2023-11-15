import java.util.Arrays;

/**
 * Temp
 */
public class Temp {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] dem = new int[arr.length];

        // Xay dung mang dem
        for (int i = 0; i < arr.length; i++) {
            int demSoLanXuatHienAi = 0;
            char ai = arr[i];
            // ...
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == ai) {
                    demSoLanXuatHienAi++;
                }
            }

            dem[i] = demSoLanXuatHienAi;
        }

        for (int i = 0; i < arr.length; i++) {
            if (dem[i] == 1) {
                System.out.println(arr[i]);
                return i;
            }
        }

        return -1;
    }

    // Cach 2
    public static int firstUniqChar2(String s) {
        char[] arr = s.toCharArray();
        int[] dem = new int[1000];
        // a-z A-Z
        // ['a','z']
        // [97, 122]

        for (int i = 0; i < arr.length; i++) {
            dem[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (dem[arr[i]] == 1) {
                System.out.println(arr[i]);
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "ookk";
        // [2,2,2,2]
        System.out.println(firstUniqChar(s));
    }
}