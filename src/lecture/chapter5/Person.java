package lecture.chapter5;

public class Person {

    private String name;
    private boolean blauesAuge = false;

    public void hitPerson(){
        blauesAuge  = true;
    }

    public boolean isBlauesAuge(){
        return blauesAuge;
    }
}
