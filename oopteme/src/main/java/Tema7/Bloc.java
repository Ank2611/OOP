package Tema7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bloc {
    private String numeBloc;
    private List<Etaj> etaj = new ArrayList<Etaj>();
    private List<Apartament> apt = new ArrayList<Apartament>();


    public Bloc( String numeBloc ) {
        this.numeBloc = numeBloc;
    }

    public String getNumeBloc() {
        return numeBloc;
    }

    public void setNumeBloc( String numeBloc ) {
        this.numeBloc = numeBloc;
    }

    public List<Etaj> getEtaj() {
        return etaj;
    }


    public List<Apartament> getApt() {
        return apt;
    }

    public void addEtaj( Etaj et ) {
        etaj.add(et);
    }

    public void afiseazaBloc() {

        for (Etaj et1 : etaj) {
            System.out.println();
            System.out.println("et-" + et1.getNrEtaj() + ":||");
            et1.afiseazaEtaj();
        }


    }
}




