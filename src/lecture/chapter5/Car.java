package lecture.chapter5;

public class Car {

    // Attribute (Eigenschaften) für Objekte des Types "Car"
    private String color;
    private String licensePlate;
    private int horsePower;
    private double currentSpeed;
    private final String chassisNumber;

    // Sichtbarkeitsmodifier
    // - private: Sichtbar innerhalb der Klasse / Objektes
    //   default: Sichtbar innerhalb des Pakets (Java Package)
    // # protected: Sichtbar innerhalb des Pakets (Java Package)
    // + public: Überall Sichtbar

    // Konstruktor zur Erzeugung eines "Car" Objektes
    public Car(String paramaterColor, String parameterLicensPlate,
        int parameterHorsePower, String parameterChassisNumber){

        setColor(paramaterColor);
        setLicensePlate(parameterLicensPlate);
        setHorsePower(parameterHorsePower);
        // TODO: e.g. check with REGEX ("NNNN-XXXX-####") for valid chassis number
        chassisNumber = parameterChassisNumber;
        currentSpeed = 0.0;

    }

    // Methoden (Verhalten) für Objekte des Types "Car"
    public void accelerate(double speedDelta){
        if(speedDelta > 0.0 && speedDelta < 50.0) {
            currentSpeed = currentSpeed + speedDelta;
        }
        System.out.println("Das Auto ("+ chassisNumber +") fährt " + currentSpeed);
    }

    public void brake(double speedDelta){
        if(speedDelta > 0.0 && speedDelta < 70.0){
            if(currentSpeed - speedDelta < 0){
                currentSpeed = 0.0;
            }else{
                currentSpeed = currentSpeed - speedDelta;
            }
        }
        System.out.println("Das Auto ("+ chassisNumber +") fährt " + currentSpeed);
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
    public void setColor(String parameterColor){
        if(parameterColor == "rot" ||
            parameterColor == "grün" ||
            parameterColor == "schwarz"){
            color = parameterColor;
        }else{
            color = "schwarz";
        }
    }

    public void setHorsePower(int parameterHorsePower){
        if(parameterHorsePower > 45 && parameterHorsePower < 350){
            horsePower = parameterHorsePower;
        }else{
            horsePower = 100;
        }
    }

    public void setLicensePlate(String parameterLicensePlate){
        // TODO: e.g. check with REGEX ("XX-YY ####") for valid license plate
        licensePlate = parameterLicensePlate;
    }
}
