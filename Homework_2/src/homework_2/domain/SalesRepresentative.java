package homework_2.domain;

public class SalesRepresentative {

    private int numberOfsales;
    private int dividentPerSale;

    public SalesRepresentative(int numberOfsales, int dividentPerSale) {
        this.numberOfsales = numberOfsales;
        this.dividentPerSale = dividentPerSale;
    }

    public int getNumberOfsales() {
        return numberOfsales;
    }

    public void setNumberOfsales(int numberOfsales) {
        this.numberOfsales = numberOfsales;
    }

    public int getDividentPerSale() {
        return dividentPerSale;
    }

    public void setDividentPerSale(int dividentPerSale) {
        this.dividentPerSale = dividentPerSale;
    }


    @Override
    public String toString() {
        return "SalesRepresentative{" +
                "numberOfsales=" + numberOfsales +
                ", dividentPerSale=" + dividentPerSale +
                '}';
    }

}
