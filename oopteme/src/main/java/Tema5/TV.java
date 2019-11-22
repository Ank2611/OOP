package Tema5;

public class TV {
    private int nrChannel;
    private int volume;
    private boolean isOn;


    public int getNrChannel() {
        return nrChannel;
    }

    public void setNrChannel( int nrChannel ) {
        this.nrChannel = nrChannel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume( int volume ) {
        this.volume = volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn( boolean on ) {
        isOn = on;
    }

    public TV( int nrChannel, int volume, boolean isOn ) {
        this.nrChannel = nrChannel;
        this.volume = volume;
        this.isOn = isOn;
    }

    public int changeNextChannel() {
        int nextCh = 0;
        if ((this.nrChannel >= 1 && this.nrChannel < 100) && isOn()) {
            nextCh = this.nrChannel + 1;
        } else if (this.nrChannel == 100) {
            nextCh = 1;
        }
        if (nextCh == 0) {
            System.out.println("Televizorul este stins!");
        }
        return nextCh;
    }

    public int changePrevChannel() {
        int prevCh = 0;
        if ((this.nrChannel > 1 && this.nrChannel <= 100) && isOn()) {
            prevCh = this.nrChannel + 1;
        } else if (this.nrChannel == 1) {
            prevCh = 100;
        }
        if (prevCh == 0) {
            System.out.println("Televizorul este stins!");
        }
        return prevCh;
    }

    public int setUpVol() {
        int counterVol = 0;
        if ((this.volume >= 0 && this.volume < 50) && isOn()) {
            counterVol = this.volume + 1;
        } else if (this.volume == 50) {
            counterVol = 50;
        }
        if (counterVol == 0) {
            System.out.println("Televizorul este stins!");
        }

        return counterVol;
    }

    public int setDownVol() {
        int counterVol = 0;
        if ((this.volume > 0 && this.volume <= 50) && isOn()) {
            counterVol = this.volume - 1;
        } else if (this.volume == 0) {
            counterVol = 0;
        }
        if (counterVol == 0) {
            System.out.println("Televizorul este stins!");
        }
        return counterVol;
    }


}
