package Tema6;

public class JucatorBarbut {
    private int dicesResult;
    private Zar dice1 = new Zar();
    private Zar dice2 = new Zar();

    public JucatorBarbut( Zar dice1, Zar dice2 ) {
        this.dice1 = dice1;
        this.dice2 = dice2;
    }

    public JucatorBarbut() {
    }

    public int getDicesResult() {
        return dicesResult;
    }

    public void setDicesResult( int dicesResult ) {
        this.dicesResult = dicesResult;
    }

    public Zar getDice1() {
        return dice1;
    }

    public void setDice1( Zar dice1 ) {
        this.dice1 = dice1;
    }

    public Zar getDice2() {
        return dice2;
    }

    public void setDice2( Zar dice2 ) {
        this.dice2 = dice2;
    }

    public int rollDice() {
        int randomResult = 0;
        int diceResult = 0;
        // define the range
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        //for (int i = 0; i < 6; i++) {
        randomResult = (int) (Math.random() * range) + min;
        System.out.println(randomResult);
        //}
        int dice1Result = dice1.getDiceValue(randomResult);
        int dice2Result = dice2.getDiceValue(randomResult);
        System.out.println("zar1 " + dice1Result + " zar2 " + dice2Result);
        return diceResult = dice1Result + dice2Result;
    }
}
