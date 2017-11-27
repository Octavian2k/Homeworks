package domain;

public class Purchase {

    private String clientName;
    private String delearshipName;
    private Car car;

    public Purchase(String clientName, String delearshipName, Car car) {
        this.clientName = clientName;
        this.delearshipName = delearshipName;
        this.car = car;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDelearshipName() {
        return delearshipName;
    }

    public void setDelearshipName(String delearshipName) {
        this.delearshipName = delearshipName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "clientName='" + clientName + '\'' +
                ", delearshipName='" + delearshipName + '\'' +
                ", car=" + car +
                '}';
    }
}
