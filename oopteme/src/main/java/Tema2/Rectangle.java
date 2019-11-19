package Tema2;

public class Rectangle {
    private double latime;
    private double lungime;

    public Rectangle () {
        this.latime=1;
        this.lungime=1;
    }

    public Rectangle ( double latime, double lungime ) {
        this.latime = latime;
        this.lungime = lungime;
    }

    public double getLatime () {
        return latime;
    }

    public void setLatime ( double latime ) {
        this.latime = latime;
    }

    public double getLungime () {
        return lungime;
    }

    public void setLungime ( double lungime ) {
        this.lungime = lungime;
    }

    public double getArea(){
        return this.latime*this.lungime;
    }

    public double getPerimeter(){
        return 2*(this.latime + this.lungime);
    }
}
