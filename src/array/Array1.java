package array;

public class Array1 {

    public static void main(String[] args) {
        System.out.println(maxEnd3(new int[]{11, 5, 9})[1]);
//        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7,3}));
    }
    public static boolean firstLast6(int[] array){
        /*

    firstLast6

    Given an array of ints, return true if 6
    appears as either the first or last element in the array. The array will be length 1 or more.

    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false
    */
        if(array[0] == 6 || array[array.length-1]==6){
            return true;
        } else
            return false;
    }

    public static boolean sameFirstLast(int[] array) {
        return (array.length>1 && array[0]==array[array.length-1]) ?  true : false;


    /*
    SameFirstLast

    Given an array of ints, return true if the array is length 1 or more,
    and the first element and the last element are equal.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    */
    }

    public static int[] makePi(){
        return new int[]{3,1,4};
        /*
    makePi

    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

    makePi() → [3, 1, 4]
     */
    }

    public static boolean commonEnd(int[] a, int[] b){
         /*
    commonEnd
    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
    Both arrays will be length 1 or more.

    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true
     */
        return a[0] == b[0] || a[a.length-1]==b[b.length-1] ? true : false;
    }

    public static int sum3(int[] a){
            /*
    sum3

    Given an array of ints length 3, return the sum of all the elements.

    sum3([1, 2, 3]) → 6
    sum3([5, 11, 2]) → 18
    sum3([7, 0, 0]) → 7
     */
        return a[0] + a[1] + a[2];
    }

    public static int[] rotateLeft3(int[] a) {
        int [] arr = {a[1], a[2], a[0]};
        return arr;
    /*
    rotateLeft3

    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

    rotateLeft3([1, 2, 3]) → [2, 3, 1]
    rotateLeft3([5, 11, 9]) → [11, 9, 5]
    rotateLeft3([7, 0, 0]) → [0, 0, 7]
     */
    }

    public static int[] reverse3(int[] a){
            /*
    reverse3

    Given an array of ints length 3, return a new array with the elements in reverse order,
     so {1, 2, 3} becomes {3, 2, 1}.

    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]
     */
        int[] arr = {a[2],a[1],a[0]};
        return arr;
    }

    public static int[] maxEnd3(int[] a){
            /*
    maxEnd3

    Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    and set all the other elements to be that value. Return the changed array.

    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]
     */
        int[] arr= new int[3];
        if(a[0]<a[2]){
            for(int i=0;i<3;i++){
                arr[i]=a[2];
            }
        } else {
            for(int i=0;i<3;i++){
                arr[i]=a[0];
            }
        }
        return arr;
    };


    /*
    Sum2

    Given an array of ints, return the sum of the first 2 elements in the array.
    If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
     */

    /*
    middleWay

    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     */

}