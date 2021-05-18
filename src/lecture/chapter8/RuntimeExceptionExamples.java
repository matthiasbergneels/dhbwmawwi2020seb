package lecture.chapter8;

public class RuntimeExceptionExamples {

    public static void main(String[] args) {


        String myText = null;

        if(myText != null){
            System.out.println(myText.toLowerCase());
        }

        int[] numbers = new int[5];

        try {
            System.out.println("Vor dem Text");
            System.out.println(myText.toLowerCase());
            System.out.println("Nach dem Text");

            for(int i = 0; i < numbers.length; i++){
                System.out.println(numbers[i]);
            }
        }catch(NullPointerException myNullPointerException){
            // Ausnahme behandeln
            System.out.println("Kein Textobjekt vorhanden! --> wir brechen ab!");
            myNullPointerException.printStackTrace();
            System.err.println(myNullPointerException.getMessage());
            System.out.println(myNullPointerException.toString());
            return;
            //myText = "Jetzt ist hier Text";
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("So viele Zahlen haben wir nicht!");
            System.out.println(e.getMessage());

        }catch(RuntimeException e){
            System.out.println("Runtime Exception aufgetreten");
        }finally {
            System.out.println("An mir geht kein Weg vorbei!");
        }

        System.out.println("Ende des Programms");

    }
}
