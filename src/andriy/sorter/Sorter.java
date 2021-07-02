package andriy.sorter;

public class Sorter {
    int[] array;
    public int counter;
    public int[] sortedArray;

    Sorter(int[] numberArray){
        this.array = numberArray;
    }

    public int[] sorterCounter(){
        boolean isSorted;
        for (int i = 0; i < this.array.length; i++) {
            isSorted = true;
            for (int j = 0; j < this.array.length - 1; j++) {
                if (this.array[j] > this.array[j+1]) {
                    int currentNumber = this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+1] = currentNumber;
                    isSorted = false;
                    sortedArray = this.array;
                }
            } if(isSorted){
                    break;
            }
            counter++;
        }
        return sortedArray;
    }
}
