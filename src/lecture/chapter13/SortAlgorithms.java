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

        sortedNumbers = selectionSortNumberArray(unsortedNumbers.clone());
        printArray(sortedNumbers);

        sortedNumbers = quickSortNumberArray(unsortedNumbers.clone());
        printArray(sortedNumbers);
    }

    public static int[] bubbleSortNumberArray(int numbers[]) {

        long startTime = System.currentTimeMillis();

        // O(n*n)
        for (int i = numbers.length; i > 0; i--) {
            for (int j = 0; j < (numbers.length - 1); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // tausche Elemente
                    swapElementsInArray(numbers, j, j + 1);
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
                    swapElementsInArray(numbers, j, j + 1);
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
                    swapElementsInArray(numbers, j, j + 1);
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

    public static int[] selectionSortNumberArray(int numbers[]){

        long startTime = System.currentTimeMillis();

        int sortedMarker = numbers.length - 1;

        while(sortedMarker > 0){
            int maxPos = sortedMarker;
            for(int i = 0; i <= sortedMarker; i++){
                if(numbers[i] > numbers[maxPos]){
                    maxPos = i;
                }
            }

            if(maxPos != sortedMarker){
                swapElementsInArray(numbers, maxPos, sortedMarker);
            }

            sortedMarker--;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("SelectionSort Runtime: " + (endTime - startTime) + " ms - SwapCount: " + swapCount);
        swapCount = 0;

        return numbers;
    }

    public static int[] quickSortNumberArray(int[] numbers){
        long startTime = System.currentTimeMillis();

        int sortedMarker = numbers.length - 1;

        quickSortNumberArray(numbers, 0, numbers.length-1);

        long endTime = System.currentTimeMillis();

        System.out.println("QuickSort Runtime: " + (endTime - startTime) + " ms - SwapCount: " + swapCount);
        swapCount = 0;

        return numbers;
    }

    private static void quickSortNumberArray(int[] numbers, int left, int right){

        int indexLeft = left;
        int indexRight = right;

        if(left < right){

            // pre sort left and right side
            int pivot = numbers[indexRight];

            while(indexLeft <= indexRight){
                // search for elements bigger than pivot element from left side
                while (numbers[indexLeft] < pivot){
                    indexLeft++;
                }

                // search for elements smaller than pivot element from right side
                while (numbers[indexRight] > pivot){
                    indexRight--;
                }

                if(indexLeft <= indexRight){
                    swapElementsInArray(numbers, indexLeft, indexRight);
                    indexLeft++;
                    indexRight--;
                }
            }


                if (left < indexRight) {
                    // pre-sorted left part-array
                    quickSortNumberArray(numbers, left, indexRight);
                }

                if (indexLeft < right) {
                    // pre-sorted right part-array
                    quickSortNumberArray(numbers, indexLeft, right);
                }

        }

    }


    private static void swapElementsInArray(int[] numbers, int i, int j) {
        swapCount++;
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    private static void printArray(int[] numbers) {
        System.out.print("Array Ausgabe: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ( (i < numbers.length - 1)  ? ", " : ""));
        }
        System.out.println();
    }
}