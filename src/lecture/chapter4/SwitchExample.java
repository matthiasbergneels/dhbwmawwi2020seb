package lecture.chapter4;

public class SwitchExample {

    public static void main(String[] args) {

        int grade = 5;

        switch(grade){
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                System.out.println("Danach fällt man durch");
                break;
            case 5:
                System.out.println("ungenügend");
                break;
            default:
                System.out.println("Ungültige Note");
                break;
        }

        System.out.println("Ende");


        switch(grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Bestanden");
                break;
            case 5:
            case 6:
                System.out.println("Durchgefallen");
                break;
            default:
                System.out.println("Ungültige Note");
                break;
        }

    }

}
