
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arraySize = 10000;
        int range = 1000;

        ArrayList<Integer> array = generateRandomArray(arraySize, range);

        ArrayList<Integer> arrayCopy1 = new ArrayList<>(array);
        ArrayList<Integer> arrayCopy2 = new ArrayList<>(array);

        PerformanceMetrics.measureRuntime(() -> Sort.bubbleSort1(arrayCopy1));
        PerformanceMetrics.measureRuntime(() -> Sort.bubbleSort2(arrayCopy2));
    }

    public static ArrayList<Integer> generateRandomArray(int size, int range) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(range));
        }
        return array;
    }


}
