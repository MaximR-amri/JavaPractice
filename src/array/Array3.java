package array;

public class Array3 {
    /*
    Given start and end numbers, return a new array containing the sequence of integers from start up to but
    not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
    The end number will be greater or equal to the start number. Note that a length-0 array is valid.
    (See also: FizzBuzz Code)



    fizzArray3(5, 10) → [5, 6, 7, 8, 9]
    fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
    fizzArray3(1, 3) → [1, 2]
     */

    /*
    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
    You may modify and return the given array, or return a new array.

    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    shiftLeft([1, 2]) → [2, 1]
    shiftLeft([1]) → [1]
     */

    /*
    For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
    until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

    tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
    tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
    tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
     */

    /*
    Given a non-empty array of ints, return a new array containing the elements from the original
    array that come before the first 4 in the original array.
    The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

    pre4([1, 2, 4, 1]) → [1, 2]
    pre4([3, 1, 4]) → [3, 1]
    pre4([1, 4, 4]) → [1]
     */

    /*
    We'll say that an element in an array is "alone" if there are values before and after it,
    and those values are different from it. Return a version of the given array where every instance of the
    given value which is alone is replaced by whichever value to its left or right is larger.

    notAlone([1, 2, 3], 2) → [1, 3, 3]
    notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
    notAlone([3, 4], 3) → [3, 4]
     */

    /*
    Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are
    grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1}
    becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

    zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    zeroFront([1, 0]) → [0, 1]
     */

    /*
    Return a version of the given array where all the 10's have been removed.
    The remaining elements should shift left towards the start of the array as needed,
    and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
    You may modify and return the given array or make a new array.

    withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
    withoutTen([10, 2, 10]) → [2, 0, 0]
    withoutTen([1, 99, 10]) → [1, 99, 0]
     */

    /*
    Return a version of the given array where each zero value in the array is replaced by the largest odd value to
    the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

    zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    zeroMax([0, 1, 0]) → [1, 1, 0]
     */


    /*
    Return an array that contains the exact same numbers as the given array,
    but rearranged so that all the even numbers come before all the odd numbers.
    Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

    evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    evenOdd([3, 3, 2]) → [2, 3, 3]
    evenOdd([2, 2, 2]) → [2, 2, 2]
     */

    /*
    This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first
    problem for job interviews. Consider the series of numbers beginning at start and
    running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4.
    Return a new String[] array containing the string form of these numbers, except for multiples of 3,
    use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
    In Java, String.valueOf(xxx) will make the String form of an int or other type.
    This version is a little more complicated than the usual version since you have to allocate and index into an
    array instead of just printing, and we vary the start/end instead of just always doing 1..100.



    fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
    fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
    fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
   
     */
}
