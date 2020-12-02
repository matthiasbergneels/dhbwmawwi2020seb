package lecture.chapter5;

public class Car {

    // (Instanz-)Attribute (Eigenschaften) für Objekte des Types "Car"
    private String color;
    private String licensePlate;
    private int horsePower;
    private double currentSpeed;
    private final String chassisNumber;
    public final Brands brand;

    public static final String[] ALLOWED_COLORS = {"SCHWARZ", "ROT", "GRÜN", "BLAU", "LILA"};

    public enum Brands{
        MERCEDES,
        BMW,
        TESLA,
        FIAT,
        DACHIA
    }

    // (Klassen-)Attribut(e) - Eigenschaften die im Kontext der Klasse definiert sind
    private static int carCounter = 0;

    // Sichtbarkeitsmodifier
    // - private: Sichtbar innerhalb der Klasse / Objektes
    //   default: Sichtbar innerhalb des Pakets (Java Package)
    // # protected: Sichtbar innerhalb des Pakets (Java Package)
    // + public: Überall Sichtbar

    // Konstruktor zur Erzeugung eines "Car" Objektes
    public Car(String color, String licensePlate,
        int horsePower, String chassisNumber, Brands brand){

        this.setColor(color);
        this.setLicensePlate(licensePlate);
        this.setHorsePower(horsePower);
        // TODO: e.g. check with REGEX ("NNNN-XXXX-####") for valid chassis number
        this.chassisNumber = chassisNumber;
        this.brand = brand;
        this.currentSpeed = 0.0;

        carCounter++;
    }

    // Methoden (Verhalten) für Objekte des Types "Car"
    public void accelerate(double speedDelta){
        if(speedDelta > 0.0 && speedDelta < 50.0) {
            this.currentSpeed = this.currentSpeed + speedDelta;
        }
        System.out.println("Das Auto ("+ this.chassisNumber +") fährt " + currentSpeed);
    }

    public void brake(double speedDelta){
        if(speedDelta > 0.0 && speedDelta < 70.0){
            if(this.currentSpeed - speedDelta < 0){
                this.currentSpeed = 0.0;
            }else{
                this.currentSpeed = this.currentSpeed - speedDelta;
            }
        }
        System.out.println("Das Auto ("+ this.chassisNumber +") fährt " + currentSpeed);
    }

    // Getter Methode (Zugriff auf privat Attribute)
    public String getColor(){
        return color;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public String getChassisNumber(){
        return chassisNumber;
    }

    // Setter Methoden ein (schreib Zugriff auf Attribute)
    public void setColor(String color){
        this.color = ALLOWED_COLORS[0];

        for(String allowedColor : ALLOWED_COLORS){
            if(allowedColor.equals(color.toUpperCase())){
                this.color = allowedColor;
                break;
            }
        }

        /* if(color == "rot" ||
                color == "grün" ||
                color == "schwarz" ||
                color == ""){
            this.color = color;
        }else{
            this.color = "schwarz";
        }

         */
    }

    public void setHorsePower(int horsePower){
        if(horsePower > 45 && horsePower < 350){
            this.horsePower = horsePower;
        }else{
            this.horsePower = 100;
        }
    }

    public void setLicensePlate(String licensePlate){
        // TODO: e.g. check with REGEX ("XX-YY ####") for valid license plate
        this.licensePlate = licensePlate;
    }

    // Klassen-Methode (statisch)
    public static int getCarCounter(){
        return carCounter;
    }
}
