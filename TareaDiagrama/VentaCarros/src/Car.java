public abstract class Car implements Vehicle {

    private CarType type;

    private String cardID;

    private int maxSpeed;

    public Car(CarType type, String carID, int maxSpeed) {
    }

    public CarType getType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getCardID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getMaxSpeed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
