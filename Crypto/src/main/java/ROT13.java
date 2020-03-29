import java.util.ArrayList;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    private int space;

    ROT13(Character cs, Character cf) {
        space = cf - cs;
    }

    ROT13() {
        space = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)){
                result = c.toString();

            }
            else if (result.length() > 0){
                result += s.charAt(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (result.length() == s.length()){
                break;
            }
            else {
                result += s.charAt(i);
            }
        }
        return result;
    }

}