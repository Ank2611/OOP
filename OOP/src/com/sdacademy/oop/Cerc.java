package com.sdacademy.oop;

public class Cerc {
    double raza;

    public Cerc ( double raza ) {
        this.raza = raza;
    }

    public double getRaza () {
        return raza;
    }

    public double calcAria () {
        double aria = 2 * Math.PI * (this.raza * this.raza);
        return aria;
    }

    public static void main ( String[] args ) {
        Cerc cerc1 = new Cerc(5);
        System.out.println("Aria cercului cu raza: "+ cerc1.getRaza() + " este " + cerc1.calcAria());
    }
}
