public class CarDemoApp {

    public static void main(String[] args) {
        String name = "Susi";
        Car porsche911 = new Car();
        porsche911.manufacturer = "Porsche";
        porsche911.currentGear = 1;
        porsche911.colour = "steel-blue";
        
        Car vwGolf = new Car();
        vwGolf.colour = "red";
        vwGolf.manufacturer = "Volkswagen";
        vwGolf.currentGear = 1;

        System.out.println("vwGolf.manufacturer = " + vwGolf.manufacturer);
        System.out.println("vwGolf.colour = " + vwGolf.colour);
        System.out.println("vwGolf = " + vwGolf);
        
    }
}
