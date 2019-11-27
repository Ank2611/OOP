package Tema7;

public class Main {
    public static void main( String[] args ) {
        Bloc bloc = new Bloc("e2");
        Etaj et0 = new Etaj(0);
        Apartament ap1 = new Apartament(1, "fam. Ionescu");
        Apartament ap2 = new Apartament(2, "fam. Popescu");

        Etaj et1 = new Etaj(1);
        Apartament ap3 = new Apartament(3, "fam. Georgescu");
        Apartament ap4 = new Apartament(4, "fam. Popa");
        Apartament ap5 = new Apartament(5, "fam. Vladimirescu");


        bloc.afiseazaBloc(bloc.getNumeBloc());
        bloc.adaugaEtaj(et0.getNrEtaj());
        et0.adaugaApartament(ap1.getNrAp(), ap1.getNumeFamilie());
        et0.adaugaApartament(ap2.getNrAp(), ap2.getNumeFamilie());
        System.out.println();
        bloc.adaugaEtaj(et1.getNrEtaj());
        et1.adaugaApartament(ap3.getNrAp(), ap3.getNumeFamilie());
        et1.adaugaApartament(ap4.getNrAp(), ap4.getNumeFamilie());
        et1.adaugaApartament(ap5.getNrAp(), ap5.getNumeFamilie());

    }
}
