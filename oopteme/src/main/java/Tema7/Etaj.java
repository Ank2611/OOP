package Tema7;

import java.util.ArrayList;
import java.util.List;

public class Etaj {
    private int nrEtaj;
    private List<Apartament> apartament = new ArrayList<Apartament>();

    public Etaj( int nrEtaj ) {
        this.nrEtaj = nrEtaj;
    }


    public int getNrEtaj() {
        return nrEtaj;
    }

    public void setNrEtaj( int nrEtaj ) {
        this.nrEtaj = nrEtaj;
    }

    public List<Apartament> getApartament() {
        return apartament;
    }

    public void setApartament( List<Apartament> apartament ) {
        this.apartament = apartament;
    }

    public void adaugaApartament( Apartament ap ) {
        apartament.add(ap);
    }

    public void afiseazaEtaj() {
        for (Apartament a : apartament) {
            System.out.print(a.getNrAp() + ". " + a.getNumeFamilie() + " ||");
        }
    }
}
