package InterfataGenerica;

public class Patrat implements Comparable<Patrat> {
    private int latura;


    public Patrat(int latura) {
        this.latura = latura;
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura( int latura ) {
        this.latura = latura;
    }

    public static int getArea(int latura) {
        return latura * latura;
    }

    public int compareTo( Patrat itemToBeCompared ) {
        if (this.getArea(this.latura) < Patrat.getArea(itemToBeCompared.getLatura())) {
            return 1;
        } else if(this.getArea(this.latura) > Patrat.getArea(itemToBeCompared.getLatura())){
            return -1;
        } else { return 0;}
    }
}
