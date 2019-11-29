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
        int randomResult1 = 0;
        int randomResult2 = 0;
        int diceResult = 0;
        // define the range
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        //for (int i = 0; i < 6; i++) {
        randomResult1 = (int) (Math.random() * range) + min;
        randomResult2 = (int) (Math.random() * range) + min;
//        System.out.println("Zarul de la player 1 " + (randomResult1));
//        System.out.println("Zarul de la player 2 " + (randomResult2));
        //}
        if ((randomResult1 < max && randomResult1>=min) && (randomResult2 < max && randomResult2>=min)) {
            int dice1Result = dice1.getDiceValue(randomResult1);
            int dice2Result = dice2.getDiceValue(randomResult2);
            diceResult = dice1Result + dice2Result;
        }

//        System.out.println("zar1 " + dice1Result + " zar2 " + dice2Result);
        return diceResult;
    }
}
