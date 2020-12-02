package lecture.chapter5;

public class CarRunExample {

    public static void main(String[] args) {

        // Deklaration einer Variable vom Typ "Car"
        Car myCar;
        Car yourCar;

        // erzeugen eines Car Objektes
        myCar = new Car("lila", "HD-XY 1234",
                199, "HJDS-JDHJ-1823");
                // Quellcode: new Car("rot", "HD-XY 1234". 199, "HJDS-JDHJ-1823");
        yourCar = new Car("GRÜn", "MA-HH 9876",
                150, "HJDU-ISKD-9825");

        // interagieren  mit dem Objekt (Instanz)
        // setzen der Attribute
        String myCarColor = new String("LILA"); //"LILA";
        System.out.println("Mein Auto wird: " + myCarColor);
        myCar.setColor(myCarColor);
        System.out.println("Mein Auto ist: " + myCar.getColor());
        //myCar.licensePlate = "Geht dich gar nichts an!";

        // nutzen der Methoden
        myCar.accelerate(30.0); // --> Quellcode: myCar.accelerate(30.0);
        myCar.brake(29.0);
        myCar.brake(3.0);

        //myCar.currentSpeed = 599.0;

        System.out.println("myCar, Farbe: " + myCar.getColor());
        System.out.println("myCar, Nummernschild: " + myCar.getLicensePlate());
        System.out.println("myCar, Leistung: " + myCar.getHorsePower());
        //System.out.println("myCar, aktuelle Geschwindigkeit: " + myCar.currentSpeed);


        //yourCar.color = "grün";
        //yourCar.licensePlate = "MA-HH 9876";
        //yourCar.horsePower = 1999;

        //yourCar.currentSpeed = -99.0;

        System.out.println("yourCar, Farbe: " + yourCar.getColor());
        System.out.println("yourCar, Nummernschild: " + yourCar.getLicensePlate());
        System.out.println("yourCar, Leistung: " + yourCar.getHorsePower());
        //System.out.println("yourCar, aktuelle Geschwindigkeit: " + yourCar.currentSpeed);
        yourCar.accelerate(45.0);
        yourCar.brake(999.0);

        yourCar.setColor(Car.ALLOWED_COLORS[3]);


        System.out.println("myCar, Farbe: " + myCar.getColor());
    }
}
