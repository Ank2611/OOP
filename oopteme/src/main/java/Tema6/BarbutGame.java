package Tema6;

import java.util.Scanner;

public class BarbutGame {
    JucatorBarbut player1 = new JucatorBarbut();
    JucatorBarbut player2 = new JucatorBarbut();

    public BarbutGame( JucatorBarbut player1, JucatorBarbut player2 ) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public BarbutGame() {
    }

    public JucatorBarbut getPlayer1() {
        return player1;
    }

    public void setPlayer1( JucatorBarbut player1 ) {
        this.player1 = player1;
    }

    public JucatorBarbut getPlayer2() {
        return player2;
    }

    public void setPlayer2( JucatorBarbut player2 ) {
        this.player2 = player2;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1 ready? ");
        String rasp1 = sc.nextLine();
        System.out.println("Player 2 ready? ");
        String rasp2 = sc.nextLine();

        if (rasp1 == "yes") {
            int z1 = player1.rollDice();
            player1.setDicesResult(z1);
            System.out.println("Player1 rolled: " + player1.getDicesResult());
        }

        if (rasp2 == "yes") {
            int z2 = player2.rollDice();
            player2.setDicesResult(z2);
            System.out.println("Player2 rolled: " + player2.getDicesResult());
        }


    }

}
