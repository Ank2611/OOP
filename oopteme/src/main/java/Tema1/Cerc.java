package Tema1;

public class Cerc {
    private double raza;

    public double getRaza () {
        return raza;
    }

    public void setRaza ( double raza ) {
        this.raza = raza;
    }

    public double calcAria () {
        double aria = 2 * Math.PI * (this.raza * this.raza);
        return aria;
    }
}
