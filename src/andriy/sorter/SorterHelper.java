package andriy.sorter;

import java.util.Arrays;

public class SorterHelper {
    public static void main(String[] args){
        int[] numberArray = {4, 5, 2, 7, 10, 165, 23, 55, 29, 101, 43, 88, 1, 178, 200};
//        int[] numberArray = {1, 2, 3, 4, 5, 7};
        Sorter sortedArray = new Sorter(numberArray);
        System.out.println("Sorted array is: " + Arrays.toString(sortedArray.sorterCounter()));
        System.out.println("Counter is: " + sortedArray.counter);
    }
}
