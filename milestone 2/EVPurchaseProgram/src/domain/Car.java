package domain;

public class Car {

    private String motorType;
    private int electricBatteries;
    private float energyConsumption;
    private int productionYear;
    private int stockNumber;
    private int price;

    public Car(String motorType, int electricBatteries, float energyConsumption, int productionYear, int stockNumber, int price) {
        this.motorType = motorType;
        this.electricBatteries = electricBatteries;
        this.energyConsumption = energyConsumption;
        this.productionYear = productionYear;
        this.stockNumber = stockNumber;
        this.price = price;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public int getElectricBatteries() {
        return electricBatteries;
    }

    public void setElectricBatteries(int electricBatteries) {
        this.electricBatteries = electricBatteries;
    }

    public float getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(float energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "motorType='" + motorType + '\'' +
                ", electricBatteries=" + electricBatteries +
                ", energyConsumption=" + energyConsumption +
                ", productionYear=" + productionYear +
                ", stockNumber=" + stockNumber +
                ", price=" + price +
                '}';
    }
}
