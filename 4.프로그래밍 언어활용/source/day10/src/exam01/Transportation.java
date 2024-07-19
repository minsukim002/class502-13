package exam01;

public enum Transportation {
    BUS(1000),
    SUBWAY(4500),
    TAXI(1300);

    private final int fare;

    Transportation(int fare){
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }
}
