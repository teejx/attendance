class Boat extends Vehicle {
    private String mainSailColor;

    public Boat(int speed, String color, double price, String mainSailColor) {
        super(speed, color, price);
        this.mainSailColor = mainSailColor;
    }

    public void floatBoat() {
        System.out.println("The boat is floating.");
    }

    @Override
    public void stop() {
        System.out.println("The boat has stopped.");
    }
}

class FandangoYacht extends Boat {
    public FandangoYacht(int speed, String color, double price, String mainSailColor) {
        super(speed, color, price, mainSailColor);
    }

    @Override
    public void stop() {
        System.out.println("The Fandango Yacht has stopped.");
    }
}