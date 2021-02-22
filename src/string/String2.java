package string;

public class String2 {

    /*
    Implement all methods as public static
     */

    /*
    implement doubleChar
    Given a string, return a string where for every char in the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
     */

    /*
    implement countHi
    Return the number of times that the string "hi" appears anywhere in the given string.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
     */

    /*
    implement catDog
    Return true if the string "cat" and "dog" appear the same number of times in the given string.

    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
     */

    /*
    implement countCode
    Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2
     */

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

    /*
    implement xyzThere
    Return true if the given string contains an appearance of "xyz" where the xyz is not directly
    preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true
     */

    /*
    implement bobThere
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false
     */

    /*
    implement xyBalance
    We'll say that a String is xy-balanced if for all the 'x' chars in the string,
    there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
    but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false
     */

    /*
    implement prefixAgain
    Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false
     */

    /*
    implement sameStarChar
    Returns true if for every '*' (star) in the string,
    if there are chars both immediately before and after the star, they are the same.

    sameStarChar("xy*yzz") → true
    sameStarChar("xy*zzz") → false
    sameStarChar("*xa*az") → true
     */
}
