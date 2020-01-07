package Tema7;

public class Main {
    public static void main( String[] args ) {
        Apartament ap1 = new Apartament(1, "fam Ionescu");
        Apartament ap2 = new Apartament(2, "fam Popescu");
        Apartament ap3 = new Apartament(3, "fam Georgescu");
        Apartament ap4 = new Apartament(4, "fam Vladimirescu");
        Apartament ap5 = new Apartament(5, "fam Tutulescu");
//        System.out.println(ap5.getNrAp());
        Etaj et0 = new Etaj(0);
        et0.adaugaApartament(ap1);
        et0.adaugaApartament(ap2);
        Bloc bloc1 = new Bloc("E2");
        bloc1.addEtaj(et0);
        System.out.print("Bloc " + bloc1.getNumeBloc());

        Etaj et1 = new Etaj(1);
        et1.adaugaApartament(ap3);
        et1.adaugaApartament(ap4);
        et1.adaugaApartament(ap5);
        bloc1.addEtaj(et1);
        bloc1.afiseazaBloc();


    }
}
