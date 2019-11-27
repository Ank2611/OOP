package Tema7;

public class Bloc {
    private String numeBloc;
    private Etaj etaj;
    private Apartament ap;

    public Bloc( String numeBloc ) {
        this.numeBloc = numeBloc;
        this.etaj = etaj;
        this.ap = ap;
    }

    public String getNumeBloc() {
        return numeBloc;
    }

    public void setNumeBloc( String numeBloc ) {
        this.numeBloc = numeBloc;
    }

    public Etaj getEtaj() {
        return etaj;
    }

    public void setEtaj( Etaj etaj ) {
        this.etaj = etaj;
    }

    public Apartament getAp() {
        return ap;
    }

    public void setAp( Apartament ap ) {
        this.ap = ap;
    }

    public void adaugaEtaj( int et ) {
        System.out.print("et-" + et + ":||");
    }

    public void afiseazaBloc( String numeBloc ) {
        System.out.println("===========================");
        System.out.println("Blocul : " + this.numeBloc);
    }
}
