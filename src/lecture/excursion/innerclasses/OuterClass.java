package lecture.excursion.innerclasses;

public class OuterClass {

    public static interface InnerInterface{
        void print(String message);
    }

    // innere Top-Level Klasse
    public static class InnerTopLevelClass{
        void print(String message){
            System.out.println(InnerTopLevelClass.class.getName() + " - Innere Top Level Klasse sagt: " + message);
        }
    }

    // inner Elemente Klasse
    public class InnerElementClass{
        void print(String message){
            System.out.println(InnerElementClass.class.getName() + " - Innere Element Klasse sagt: " + message);
        }
    }

    void printFromInnerLocalClass(String message){
        // innere lokale Klasse
        class InnerLocalClass{
            void print(String message){
                System.out.println(InnerLocalClass.class.getName() + " - Innere Lokale Klasse sagt: " + message);
            }
        }

        InnerLocalClass myInnerLocalClass = new InnerLocalClass();
        myInnerLocalClass.print(message);
    }

    void printFromInnerAnonymousClass(String message){
        // innere anonyme Klasse
        InnerInterface myInnerAnonymousClass = new InnerInterface(){
            public void print(String message){
                System.out.println(this.getClass().getName() + " - Innere anonyme Klasse sagt: " + message);
            }
        };

        InnerInterface myInnerAnonymousClass2 = new InnerInterface(){
            public void print(String message){
                System.out.println(this.getClass().getName() + " - Innere anonyme Klasse sagt: " + message);
            }
        };

        myInnerAnonymousClass.print(message);
        myInnerAnonymousClass2.print(message);
    }

    void printFromLambdaFunction(String message){
        InnerInterface myLambdaFunction = (String lambdaMessage) -> {
            System.out.println(this.getClass().getName() + " - Lambda Funktion sagt: " + lambdaMessage);
        };

        myLambdaFunction.print(message);
    }

    void printFromLambdaFunctionShortend(String message){
        InnerInterface myLambdaFunction =
                lambdaMessage -> System.out.println(this.getClass().getName() + " - Lambda Funktion sagt: " + lambdaMessage);

        myLambdaFunction.print(message);
    }

    public static void main(String[] args) {
        String message = "Hello World";

        System.out.println(OuterClass.class.getName() + " - Äusere Klasse sagt: " + message);

        OuterClass.InnerTopLevelClass myInnerTopLevelClass = new OuterClass.InnerTopLevelClass();
        myInnerTopLevelClass.print(message);

        OuterClass myOuterClass = new OuterClass();
        InnerElementClass myInnerElementClass = myOuterClass.new InnerElementClass();
        myInnerElementClass.print(message);

        myOuterClass.printFromInnerLocalClass(message);

        myOuterClass.printFromInnerAnonymousClass(message);

        myOuterClass.printFromLambdaFunction(message);

    }
}
