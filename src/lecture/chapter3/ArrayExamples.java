package lecture.chapter3;

public class ArrayExamples {

    public static void main(String[] args) {

        int[] numbers;

        numbers = new int[10];

        /*
        int numberA;
        int numberB;
        .
        .
        .
        int numberX;
         */

        numbers[0] = 16;
        numbers[1] = 42;
        numbers[5] = 115;
        numbers[9] = 87;

        System.out.println(numbers[1]);
        System.out.println(numbers[9]);
        System.out.println(numbers[8]);

        System.out.println(numbers.length);


        char[][] tictactoe = new char[3][3];



        String[][] sentences = new String[5][];

        sentences[0] = new String[2];
        sentences[0][0] = "Hello";
        sentences[0][1] = "World";

        sentences[1] = new String[3];
        sentences[1][0] = "Ich";
        sentences[1][1] = "habe";
        sentences[1][2] = "hunger";

        sentences[2] = new String[5];
        sentences[2][0] = "Ich";
        sentences[2][1] = "denke";
        sentences[2][2] = "Java";
        sentences[2][3] = "ist";
        sentences[2][4] = "leicht";
    }
}
