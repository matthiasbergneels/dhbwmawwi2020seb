/*
Paketname:
- lowerCamelCase
- keine Leerzeichen / keine Sonderzeichen
 */
package lecture.excursion.naming;

/*
Klassennamen
- UpperCamelCase
- keine Leerzeichen / keine Sonderzeichen
 */
public class Naming {


    /*
    Attribute / Variablen
    - lowerCamelCase
     */

    private int studentId;
    private String familyName;
    private String name;

    /* Besonderheit Boolean Attribute
    - lowerCamelCase
    - sprechende Benennung, die erkennen lässt, dass es sich um einen Boolean handelt
     */

    private boolean enabled;
    private boolean canFly;
    private boolean hasFlatRoof;


    /* Konstanten
    - UPPER_CASE mit Unterstrichen
     */

    public static final String ALLOWED_COLOR_RED = "RED";




    /* Methoden
    - lowerCamelCase
    - sprechende Methodennamen --> sollten den Inhalten und das Verhalten der Methode reflektieren
        --> nicht mehr oder nicht weniger tun
     */

    public void createInstanceAndPersist(){

    }

    public String readDataFromPersistencyAndReturnInstance(){
        return "";
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    boolean getter
    - bspw. is-, has-, can-, ...
    - sprechende Benennung, die erkennen lässt, dass ein Boolean zurückgegeben wird
     */
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
