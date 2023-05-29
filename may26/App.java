public class App {
    public static void main(String[] args) {
        ToyotaVIOS toyotaVIOS = new ToyotaVIOS(100, "Red", 20000.0, "All-Season");
        toyotaVIOS.drive();
        toyotaVIOS.stop();

        U2SpyPlane u2SpyPlane = new U2SpyPlane(500, "Black", 1000000.0, 80.5);
        u2SpyPlane.fly();
        u2SpyPlane.stop();

        FandangoYacht fandangoYacht = new FandangoYacht(30, "White", 500000.0, "Blue");
        fandangoYacht.floatBoat();
        fandangoYacht.stop();
    }
}
