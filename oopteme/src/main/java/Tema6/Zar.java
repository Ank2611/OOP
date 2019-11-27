package Tema6;

public class Zar {
    private int[] values = {1, 2, 3, 4, 5, 6};

    public int[] getValues() {
        return values;
    }

    public int getDiceValue( int n ) {
        int result = 0;
        for (int i = 0; i < 6; i++) {
            result = values[n];
        }
        return result;
    }
}
