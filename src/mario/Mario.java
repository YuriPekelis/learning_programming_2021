package mario;

public class Mario {
    public void printPyramid(int height) {
        if ((height>1) && (height<=8)) {
            for(int i=0; i<height; i++) { // lines
                printSymbols(height-1-i, ' ');
                printSymbols(i+1, '#');
                printSymbols(2, ' ');
                printSymbols(i+1, '#');
                System.out.println("");
            }
        } else {
            System.out.println("Wrong height");
        }
    }

    private void printSymbols(int symbolsQuantity, char symbol) {
        for (int j = 0; j < symbolsQuantity; j++) {
            System.out.print(symbol);
        }
    }
}
