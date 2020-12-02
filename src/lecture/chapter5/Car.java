package lecture.chapter5;

public class Car {

    // Attribute (Eigenschaften) für Objekte des Types "Car"
    private String color;
    private String licensePlate;
    private int horsePower;
    private double currentSpeed;
    private final String chassisNumber;

    public static final String[] ALLOWED_COLORS = {"SCHWARZ", "ROT", "GRÜN", "BLAU", "LILA"};

    // Sichtbarkeitsmodifier
    // - private: Sichtbar innerhalb der Klasse / Objektes
    //   default: Sichtbar innerhalb des Pakets (Java Package)
    // # protected: Sichtbar innerhalb des Pakets (Java Package)
    // + public: Überall Sichtbar

    // Konstruktor zur Erzeugung eines "Car" Objektes
    public Car(String color, String licensePlate,
        int horsePower, String chassisNumber){

        this.setColor(color);
        this.setLicensePlate(licensePlate);
        this.setHorsePower(horsePower);
        // TODO: e.g. check with REGEX ("NNNN-XXXX-####") for valid chassis number
        this.chassisNumber = chassisNumber;
        this.currentSpeed = 0.0;
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
                System.out.println(color + " ist gleich " + allowedColor);
                this.color = allowedColor;
                break;
            }else{
                System.out.println(color + " ist UNGLEICH " + allowedColor);
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
}
