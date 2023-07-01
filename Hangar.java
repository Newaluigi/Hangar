public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Renault", 40000);
        Boat boat = new Boat("Zodiac", 10000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}