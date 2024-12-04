package src.by.academy.lesson17.util;

public class Util {

    public static boolean isAlphabeticallyHigher(String string1, String string2) {
        boolean isShorter = string1.length() < string2.length();
        int size = isShorter? string1.length(): string2.length();

        for (int i = 0; i < size; i++) {
            if (string1.charAt(i) < string2.charAt(i))
                return true;
            else if (string1.charAt(i) > string2.charAt(i))
                return false;
        }
        return isShorter;
    }
}
