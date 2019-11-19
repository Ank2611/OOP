package Tema3;

public class Stock {
    private String simbolStoc;
    private String stocNume;
    private double precedentClosingPrice;
    private double currentPrice;
    //public String stock = this.simbolStoc + ", " + this.stocNume;

    public Stock ( String simbolStoc, String stocNume, double precedentClosingPrice, double currentPrice ) {
        this.simbolStoc = simbolStoc;
        this.stocNume = stocNume;
        this.precedentClosingPrice = precedentClosingPrice;
        this.currentPrice = currentPrice;
    }

    public Stock ( String simbolStoc, String stocNume ) {
        this.simbolStoc = simbolStoc;
        this.stocNume = stocNume;
    }

    public String StocknName () {
        return this.simbolStoc + ", " + this.stocNume;
    }

    public String getSimbolStoc () {
        return simbolStoc;
    }

    public void setSimbolStoc ( String simbolStoc ) {
        this.simbolStoc = simbolStoc;
    }

    public String getStocNume () {
        return stocNume;
    }

    public void setStocNume ( String stocNume ) {
        this.stocNume = stocNume;
    }

    public double getPrecedentClosingPrice () {
        return precedentClosingPrice;
    }

    public void setPrecedentClosingPrice ( double precedentClosingPrice ) {
        this.precedentClosingPrice = precedentClosingPrice;
    }

    public double getCurrentPrice () {
        return currentPrice;
    }

    public void setCurrentPrice ( double currentPrice ) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return (this.precedentClosingPrice/this.currentPrice)*100;
    }

}
