package lecture.chapter13;

public class SortAlgorithms {

    private static int swapCount = 0;
    private static int getSwapCount = 0;

    public static void main(String[] args) {
        int[] unsortedNumbers = {50, 30, 80, 40, 60, 100, 20, 70, 10, 90};

        int[] sortedNumbers = bubbleSortNumberArray(unsortedNumbers.clone());
        printArray(sortedNumbers);

        sortedNumbers = bubbleSortNumberArrayV2(unsortedNumbers.clone());
        printArray(sortedNumbers);

        sortedNumbers = bubbleSortNumberArrayV3(unsortedNumbers.clone());
        printArray(sortedNumbers);

    }

    public static int[] bubbleSortNumberArray(int numbers[]) {

        long startTime = System.currentTimeMillis();

        // O(n*n)
        for (int i = numbers.length; i > 0; i--) {
            for (int j = 0; j < (numbers.length - 1); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // tausche Elemente
                    swapElementsInArray(numbers, j);
                }
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Bubble Sort Runtime: " + (endTime - startTime) + " ms - SwapCount: " + swapCount);
        swapCount = 0;

        return numbers;
    }

    public static int[] bubbleSortNumberArrayV2(int numbers[]) {

        long startTime = System.currentTimeMillis();

        // O(n * log n)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < (numbers.length - 1 - i); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // tausche Elemente
                    swapElementsInArray(numbers, j);
                }
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Bubble Sort II Runtime: " + (endTime - startTime) + " ms - SwapCount: " + swapCount);
        swapCount = 0;

        return numbers;
    }

    public static int[] bubbleSortNumberArrayV3(int numbers[]) {

        long startTime = System.currentTimeMillis();

        int i = numbers.length - 1;
        boolean swap = false;

        // O(n * log n) --> optimiert für teilweise sortierte Arrays
        do {
            swap = false;
            for (int j = 0; j <= i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // tausche Elemente
                    swapElementsInArray(numbers, j);
                    swap = true;
                }
            }
            i--;
        } while (swap);

        long endTime = System.currentTimeMillis();

        System.out.println("Bubble Sort III Runtime: " + (endTime - startTime) + " ms - SwapCount: " + swapCount);
        swapCount = 0;

        return numbers;
    }

    private static void swapElementsInArray(int[] numbers, int j) {
        swapCount++;
        int temp = numbers[j];
        numbers[j] = numbers[j + 1];
        numbers[j + 1] = temp;
    }

    private static void printArray(int[] numbers) {
        System.out.print("Array Ausgabe: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ( (i < numbers.length - 1)  ? ", " : ""));
        }
        System.out.println();
    }
}