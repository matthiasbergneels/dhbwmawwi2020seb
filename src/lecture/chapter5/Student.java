package lecture.chapter5;

public class Student {

    private String name;
    private String familyName;
    private int studentNo;

    public void drink(double fluideAmount){
        System.out.println("Studierende trinkt " + fluideAmount + " ml Flüssigkeit. ");
    }

    public void drink(double fluideAmount, double alcoholPercentage){
        //System.out.println("Studierende trinkt " + fluideAmount + " ml Flüssigkeit. ");
        this.drink(fluideAmount);
        System.out.println("und wird betrunkener...");
    }

    public void drink(double fluideAmount, boolean isPoison){
        this.drink(fluideAmount);
        if(isPoison){
            System.out.println("und stirbt! XXX");
        }
    }

    public void drink(boolean isTranquilizer, double amount){
        this.drink(amount);
        if(isTranquilizer){
            System.out.println("und ist betäubt...");
        }

    }
}

