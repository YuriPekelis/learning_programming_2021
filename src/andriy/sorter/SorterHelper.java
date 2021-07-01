package andriy.sorter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SorterHelper {
    public static void main(String[] args){
        int[] numberArray = {4, 5, 2, 7, 10, 23, 55, 29, 101, 43, 88, 1};
        Sorter sortedArray = new Sorter(numberArray);
        System.out.println("Sorted array is: " + Arrays.toString(sortedArray.sorter()));
    }
}
