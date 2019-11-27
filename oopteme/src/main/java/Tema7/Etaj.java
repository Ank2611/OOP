package Tema7;

public class Etaj {
    private int nrEtaj;

    public Etaj( int nrEtaj ) {
        this.nrEtaj = nrEtaj;
    }

    public int getNrEtaj() {
        return nrEtaj;
    }

    public void setNrEtaj( int nrEtaj ) {
        this.nrEtaj = nrEtaj;
    }

    public void adaugaApartament( int ap, String numeFam ) {
        System.out.print(ap + ". " + numeFam + " ||");
    }
}
