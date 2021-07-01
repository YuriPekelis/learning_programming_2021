package andriy.sorter;

public class Sorter {
//    int[] numberArray = {4, 5, 2, 7, 10, 23, 55, 29, 101, 43, 88, 1};
    int[] array;
    int []resultArray;

    Sorter(int[] numberArray){
        this.array = numberArray;
    }

    public int[] sorter(){
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length - 1; j++) {
                if (this.array[j] > this.array[j+1]) {
                    int currentNumber = this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+1] = currentNumber;
                }
            }
        }
        resultArray = this.array;
        return resultArray;
    }
}
