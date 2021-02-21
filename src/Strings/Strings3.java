package Strings;

public class Strings3 {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }

    public static String mixString(String str1, String str2) {
         /*
    mixString

    Given two strings, a and b, create a bigger string made of the first char of a,
    the first char of b, the second char of a, the second char of b, and so on.
    Any leftover chars go at the end of the result.

    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"
    */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length() || i < str2.length(); i++) {
            if (i < str1.length()) {
                result.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                result.append(str2.charAt(i));
            }
        }
        return result.toString();
    }


    public static String repeatEnd(String str, int n) {
          /*
    repeatEnd

    Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.
    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"
    */
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(str.length() - n);
        }
        return result;
    }


    public static String repeatFront(String str, int n) {
          /*
    repeatFront

    Given a string and an int n, return a string made of the first n characters of the string, followed by the
    first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string,
    inclusive (i.e. n >= 0 and n <= str.length()).

    repeatFront("Chocolate", 4) → "ChocChoChC"
    repeatFront("Chocolate", 3) → "ChoChC"
    repeatFront("Ice Cream", 2) → "IcI"
    */
        String result = "";
        int x = n;
        for (int i = 0; i < x; i++) {
            result += str.substring(0, n);
            n--;
        }
        return result;
    }


    public static String repeatSeparator(String str1, String str2, int n) {
            /*
    repeatSeparator

    Given two strings, word and a separator sep,
    return a big string made of count occurrences of the word, separated by the separator string.

    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    repeatSeparator("This", "And", 2) → "ThisAndThis"
    repeatSeparator("This", "And", 1) → "This"
    */
        String result = str1;
        for (int i = 1; i < n; i++) {
            if (n > 1) {
                result += str2 + str1;
            }
        }
        return result;
    }


    public static boolean xyzMiddle(String str) {
    /*
    xyzMiddle

    Given a string, does "xyz" appear in the middle of the string? To define middle,
    we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
    This problem is harder than it looks.

    xyzMiddle("AAxyzBB") → true
    xyzMiddle("AxyzBB") → true
    xyzMiddle("AxyzBBB") → false
    */
        return (Math.abs(str.substring(0, str.indexOf('x')).length() - str.substring(str.indexOf('z')).length()) <= 1);

    }

    public static String getSandwich(String str) {
    /*
    getSandwich

    A sandwich is two pieces of bread with something in between.
    Return the string that is between the first and last appearance of "bread" in the given string,
    or return the empty string "" if there are not two pieces of bread.

    getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""
    */
        if (str.contains("bread") && str.indexOf("bread", str.indexOf('d')) > -1) {
            int i = str.indexOf('d');
            int j = str.indexOf("bread", i);
            return str.substring(i + 1, j);
        } else return "";

    }


    public static String oneTwo(String str) {
    /*
    oneTwo

    Given a string, compute a new string by moving the first char to come after the next two chars,
    so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
    Ignore any group of fewer than 3 chars at the end.

    oneTwo("abc") → "bca"
    oneTwo("tca") → "cat"
    oneTwo("tcagdo") → "catdog"
    */
        String result = "";
        for (int i = 0; i < str.length(); i = i + 3) {
            result += str.substring(i + 1, i + 3) + str.substring(i, i + 3).charAt(0);
        }
        return result;
    }


    public static String zipZap(String str) {
    /*
    zipZap

    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
    Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
    zipZap("zipXzap") → "zpXzp"
    zipZap("zopzop") → "zpzp"
    zipZap("zzzopzop") → "zzzpzp"
    */

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 3).matches("z.p")) {
                sb.deleteCharAt(sb.indexOf(String.valueOf(str.charAt(i + 1))));
            }
        }
        return sb.toString();
    }


    public static String starOut(String s) {
    /*
    starOut

    Return a version of the given string, where for every star (*) in the string the star and the chars immediately
    to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

    starOut("ab*cd") → "ad"
    starOut("ab**cd") → "ad"
    starOut("sm*eilly") → "silly"
    */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') continue;
            if (i > 0 && s.charAt(i - 1) == '*') continue;
            if (i < s.length() - 1 && s.charAt(i + 1) == '*') continue;

            sb.append(s.charAt(i));
        }

        return sb.toString();

    }

    public static String plusOut(String s, String word) {
    /*
    plusOut

    Given a string and a non-empty word string,
    return a version of the original String where all chars
    have been replaced by pluses ("+"),
    except for appearances of the word string which are preserved unchanged.

    plusOut("12xy34", "xy") → "++xy++"
    plusOut("12xy34", "1") → "1+++++"
    plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
    */
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (i <= s.length() - word.length()) {
                if (s.substring(i, i + word.length()).equals(word)) {
                    result += word;
                    i += word.length() - 1;
                } else result += "+";
            } else result += "+";
        }
        return result;
    }
}
