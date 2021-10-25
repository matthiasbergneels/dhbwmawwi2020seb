package test.lecture.chapter13;

import lecture.chapter13.SortAlgorithms;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmsTest {

    static int count = 50000;
    static int randomRange = 3000000;
    static int[] toSort = null;

    @DisplayName("Testing on unsorted Array")
    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class UnsortedArrays {

        @BeforeAll
        void setUp() {
            toSort = generatedArrayWithRandomValues();
        }

        @Test
        void bubbleSortNumberArray() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArray(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void bubbleSortNumberArrayV2() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArrayV2(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void bubbleSortNumberArrayV3() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArrayV3(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void bubbleSortNumberArrayV3TimeBased() {
            assertTimeout(Duration.ofSeconds(50), () -> {
                int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArrayV3(toSort.clone());
            });

        }

        @Test
        void selectionSortNumberArray() {
            int[] sortedArray = SortAlgorithms.selectionSortNumberArray(toSort.clone());
            assertTrue(isSorted(sortedArray));
        }

        @Test
        void quickSortNumberArray() {
            int[] sortedArray = SortAlgorithms.quickSortNumberArray(toSort.clone());
            assertTrue(isSorted(sortedArray));
        }

    }


    @DisplayName("Testing on sorted Array")
    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class SortedArrays {

        @BeforeAll
        void setUp() {
            toSort = generateSortedArray();
        }

        @Test
        void bubbleSortNumberArraySorted() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArray(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void bubbleSortNumberArraySortedV2() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArrayV2(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void bubbleSortNumberArraySortedV3() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArrayV3(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void selectionSortNumberArray() {
            int[] sortedArray = SortAlgorithms.selectionSortNumberArray(toSort.clone());
            assertTrue(isSorted(sortedArray));
        }

        @Test
        void quickSortNumberArray() {
            int[] sortedArray = SortAlgorithms.quickSortNumberArray(toSort.clone());
            assertTrue(isSorted(sortedArray));
        }
    }


    @DisplayName("Testing on half sorted Array (first half sorted)")
    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class FirstHalfSortedArrays {

        @BeforeAll
        void setUp() {
            toSort = generateFirstHalfSortedArray();
        }

        @Test
        void bubbleSortNumberArraySorted() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArray(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void bubbleSortNumberArraySortedV2() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArrayV2(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void bubbleSortNumberArraySortedV3() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArrayV3(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void selectionSortNumberArray() {
            int[] sortedArray = SortAlgorithms.selectionSortNumberArray(toSort.clone());
            assertTrue(isSorted(sortedArray));
        }

        @Test
        void quickSortNumberArray() {
            int[] sortedArray = SortAlgorithms.quickSortNumberArray(toSort.clone());
            assertTrue(isSorted(sortedArray));
        }
    }


    @DisplayName("Testing on half sorted Array (second half sorted)")
    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class SecondHalfSortedArrays {

        @BeforeAll
        void setUp() {
            toSort = generateSecondHalfSortedArray();
        }

        @Test
        void bubbleSortNumberArraySorted() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArray(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void bubbleSortNumberArraySortedV2() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArrayV2(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void bubbleSortNumberArraySortedV3() {
            int[] bubbleSortedArray = SortAlgorithms.bubbleSortNumberArrayV3(toSort.clone());
            assertTrue(isSorted(bubbleSortedArray));
        }

        @Test
        void selectionSortNumberArray() {
            int[] sortedArray = SortAlgorithms.selectionSortNumberArray(toSort.clone());
            assertTrue(isSorted(sortedArray));
        }

        @Test
        void quickSortNumberArray() {
            int[] sortedArray = SortAlgorithms.quickSortNumberArray(toSort.clone());
            assertTrue(isSorted(sortedArray));
        }
    }

    private static boolean isSorted(int[] array){
        for(int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

    private static int[] generatedArrayWithRandomValues(){
        int[] generatedArray = new int[count];
        for(int i = 0; i < count; i++){
            boolean notInserted = true;
            while(notInserted){
                int randomNumber = (int)(Math.random() * randomRange);

                boolean found = false;
                for(int j = 0; j < i; j++){
                    if(generatedArray[j] == randomNumber){
                        found = true;
                        break;
                    }
                }

                if(!found){
                    generatedArray[i] = randomNumber;
                    notInserted = false;
                }

            }
        }
        return generatedArray;
    }

    private static int[] generateSortedArray(){
        int[] generatedArray = new int[count];
        for(int i = 0; i < count; i++){
            generatedArray[i] = i;
        }
        return generatedArray;
    }

    private static int[] generateFirstHalfSortedArray(){
        int[] generatedArray = generatedArrayWithRandomValues();
        for(int i = 0; i < count/2; i++){
            generatedArray[i] = i;
        }
        return generatedArray;
    }

    private static int[] generateSecondHalfSortedArray(){
        int[] generatedArray = generatedArrayWithRandomValues();
        for(int i = (int)count/2; i < count; i++){
            generatedArray[i] = i;
        }
        return generatedArray;
    }
}