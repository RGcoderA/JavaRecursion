public class Zerocount {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 2, 0, 3, 0, 4, 0};
        int count = countZeros(array);
        System.out.println("Number of zeros: " + count);
    }

    private static int countZeros(int[] array) {
        return countZerosHelper(array, 0);
    }

    private static int countZerosHelper(int[] array, int index) {
        if (index >= array.length) {
            return 0;
        }

        int count = countZerosHelper(array, index + 1);
        if (array[index] == 0) {
            count++;
        }

        return count;
    }
}