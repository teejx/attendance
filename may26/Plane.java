class Plane extends Vehicle {
    private double wingspan;

    public Plane(int speed, String color, double price, double wingspan) {
        super(speed, color, price);
        this.wingspan = wingspan;
    }

    public void fly() {
        System.out.println("The plane is flying.");
    }

    @Override
    public void stop() {
        System.out.println("The plane has stopped.");
    }
}

class U2SpyPlane extends Plane {
    public U2SpyPlane(int speed, String color, double price, double wingspan) {
        super(speed, color, price, wingspan);
    }

    @Override
    public void stop() {
        System.out.println("The U-2 Spy Plane has stopped.");
    }
}