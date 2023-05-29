class Car extends Vehicle {
    private String tireType;

    public Car(int speed, String color, double price, String tireType) {
        super(speed, color, price);
        this.tireType = tireType;
    }

    public void drive() {
        System.out.println("The car is driving.");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped.");
    }
}

class ToyotaVIOS extends Car {
    public ToyotaVIOS(int speed, String color, double price, String tireType) {
        super(speed, color, price, tireType);
    }

    @Override
    public void stop() {
        System.out.println("The Toyota VIOS has stopped.");
    }
}