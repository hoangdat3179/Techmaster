import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = null;
        String b = null;
        for (int i = 0; i < word1.length; i++) {
            a = a + word1[i];
        }
        for (int j = 0; j < word2.length; j++) {
            b = b + word2[j];
        }
        if (a.equals(b)) {
            return true;
        } else
            return false;
    }
}
