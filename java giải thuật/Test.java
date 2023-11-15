public class Test {
    public boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(Character.toUpperCase(ch[i])){
                count++;

            }
        }
    }
}
