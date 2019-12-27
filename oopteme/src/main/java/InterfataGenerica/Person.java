package InterfataGenerica;

public class Person implements Comparable<Person> {
    private int varsta;

    public Person( int varsta ) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta( int varsta ) {
        this.varsta = varsta;
    }


    public int compareTo( Person itemToBeCompared ) {
        if (this.getVarsta() < (itemToBeCompared.getVarsta())) {
            return 1;
        } else if(this.getVarsta() >(itemToBeCompared.getVarsta()) ){
            return -1;
        } else { return 0;}
    }
}
