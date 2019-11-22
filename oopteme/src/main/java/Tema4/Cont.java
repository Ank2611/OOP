package Tema4;

import java.util.Date;

public class Cont {

    private int id;
    private double sold;
    private double annualInterestRate;
    private Date dateCreated;

    public Cont() {
        this.id = 0;
        this.sold = 0.0;
        this.annualInterestRate = 0.0;
        long millis = System.currentTimeMillis();
        this.dateCreated = new Date(millis);
    }

    public Cont( int id, double sold ) {
        this.id = id;
        this.sold = sold;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public double getSold() {
        return sold;
    }

    public void setSold( double sold ) {
        this.sold = sold;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate( double annualInterestRate ) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return ((this.sold * 0.1) / 100) / 12;
    }

    public double retrag( int suma ) {
        return this.sold - suma;
    }

    public double depozit( double suma ) {
        return this.sold + suma;
    }
}
