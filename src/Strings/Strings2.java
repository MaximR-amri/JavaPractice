package Strings;

public class Strings2 {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*zzz"));
    }
    /*
    Implement all methods as public static
     */


    public static String doubleChar(String str){
        String result = "";
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            result =result + c + c;
        }
        return result;
            /*
    implement doubleChar
    Given a string, return a string where for every char in the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
     */

    }

    public static int countHi(String str){
        int count = 0;
        for(int i= 0; i<str.length()-1; i++){
            System.out.println(str.substring(i,i+2));
            if(str.substring(i,i+2).equals("hi")){
                ;
                count++;
            }
        }

        return count;
                /*
    implement countHi
    Return the number of times that the string "hi" appears anywhere in the given string.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
     */

    }

    public static boolean catDog(String str){
        int countDog = 0;
        int countCat = 0;
        for (int i= 0; i<str.length()-2;i++){
            if(str.substring(i,i+3).equals("dog")){
                countDog++;
            } else if (str.substring(i,i+3).equals("cat")){
                countCat++;
            }
        }
        return countCat==countDog;
                 /*
    implement catDog
    Return true if the string "cat" and "dog" appear the same number of times in the given string.

    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
     */

    }

    public static int countCode (String str){
        int countCode = 0;
        for(int i= 0; i<str.length()-3;i++){
            if(str.substring(i,i+4).matches("co.e")){
                countCode++;
            }
        }
        return countCode;
                  /*
    implement countCode
    Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2
     */

    }

    public static boolean endOther(String str, String str2){
       return (str.toLowerCase().startsWith(str2) || str.toLowerCase().endsWith(str2))
               || (str2.toLowerCase().startsWith(str) || str2.toLowerCase().endsWith(str));
                    /*
    implement endOther
    Given two strings, return true if either of the strings appears at the very
    end of the other string, ignoring upper/lower case differences
    (in other words, the computation should not be "case sensitive").
     Note: str.toLowerCase() returns the lowercase version of a string.

    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true
     */
    }

    public static boolean xyzThere(String str){
        return (str.contains("xyz") && !str.contains(".xyz"));
            /*
    implement xyzThere
    Return true if the given string contains an appearance of "xyz" where the xyz is not directly
    preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true
     */
    }

    public static boolean bobThere(String str){
        boolean x=false;
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i,i+3).matches("b.b")){
                x=true;
                break;
            };
        }
    return x;
    /*
    implement bobThere
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false
     */
    }

    public static boolean xyBalance(String str){
        int countY= 0;
        int countX = 0;
        for(int i= 0; i<str.length();i++ ) {
            if (str.charAt(i)=='y') {
                countY++;
            } else if (str.charAt(i) == 'x') {
                countX++;
            }
        }
        return countY == countX;
            /*
    implement xyBalance
    We'll say that a String is xy-balanced if for all the 'x' chars in the string,
    there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
    but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false
     */
    }

    public static boolean prefixAgain(String str, int n){
        return (str.substring(n).contains(str.substring(0,n)));
        /*
    implement prefixAgain
    Given a string, consider the prefix string made of the first N chars of the string.
    Does that prefix string appear somewhere else in the string?
    Assume that the string is not empty and that N is in the range 1..str.length().

    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false
     */
    }

    public static boolean sameStarChar (String str){
        boolean value = false;
        for(int i=1; i<str.length()-1; i++){
            if(str.charAt(i) == '*' && (str.charAt(i-1)==str.charAt(i+1))){
                value = true;
            }
        }
        return value;
            /*
    implement sameStarChar
    Returns true if for every '*' (star) in the string,
    if there are chars both immediately before and after the star, they are the same.

    sameStarChar("xy*yzz") → true
    sameStarChar("xy*zzz") → false
    sameStarChar("*xa*az") → true
     */
    }
}
