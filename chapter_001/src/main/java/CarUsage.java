public class CarUsage {
    public static void main(String[] args) {
        Car audi = new Car();
        boolean driving = audi.canDrive();
        System.out.println("Can you drive ? " + driving);
        System.out.println("I am going to a gas station.");
        int gas = 25;
        audi.fill(gas);
        driving = audi.canDrive();
        System.out.println("Can you drive now ? :" + driving);
        System.out.println("Now.I am going to my granny");
        System.out.println("It is 10 kilometers from here.");
        int distance = 10;
        audi.drive(distance);
        audi.gasInfo();
    }
}