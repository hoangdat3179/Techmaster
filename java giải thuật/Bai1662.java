import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }

        StringBuilder sb2 = new StringBuilder();
        for (String s : word2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());
    }

}
