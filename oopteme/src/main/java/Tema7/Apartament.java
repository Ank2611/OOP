package Tema7;

public class Apartament {
    private int nrAp;
    private String numeFamilie;

    public Apartament( int nrAp, String numeFamilie ) {
        this.nrAp = nrAp;
        this.numeFamilie = numeFamilie;
    }

    public Apartament() {
    }

    public int getNrAp() {
        return nrAp;
    }

    public void setNrAp( int nrAp ) {
        this.nrAp = nrAp;
    }

    public String getNumeFamilie() {
        return numeFamilie;
    }

    public void setNumeFamilie( String numeFamilie ) {
        this.numeFamilie = numeFamilie;
    }
}
