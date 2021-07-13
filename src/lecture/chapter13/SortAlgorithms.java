package lecture.chapter13;

public class SortAlgorithms {

    public static void main(String[] args) {
        int[] unsortedNumbers = {50, 30, 80, 40, 60, 100, 20, 70, 10, 90};

        System.out.println("Bubble Sort I:");
        int[] sortedNumbers = bubbleSortNumberArray(unsortedNumbers.clone());
        printArray(sortedNumbers);

        System.out.println("Bubble SortII:");
        sortedNumbers = bubbleSortNumberArray(unsortedNumbers.clone());
        printArray(sortedNumbers);

    }



    public static int[] bubbleSortNumberArray(int numbers[]){

        long startTime = System.currentTimeMillis();

        for(int i = numbers.length; i > 0; i--){
            for(int j = 0; j < (numbers.length - 1); j++){
                if(numbers[j] > numbers[j+1]){
                    // tausche Elemente
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Bubble Sort Runtime: " + (endTime - startTime) + " ms");

        return numbers;
    }

    public static int[] bubbleSortNumberArrayV2(int numbers[]){

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < (numbers.length - 1 - i); j++){
                if(numbers[j] > numbers[j+1]){
                    // tausche Elemente
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Bubble Sort II Runtime: " + (endTime - startTime) + " ms");

        return numbers;
    }

    private static void printArray(int[] numbers){
        System.out.println("Array Ausgabe: ");
        for(int i : numbers){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
