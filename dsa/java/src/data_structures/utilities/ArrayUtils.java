package data_structures.utilities;

public class ArrayUtils {

    /**
     * In-line reverses an array.
     */
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }

    /**
     * Swaps two elements in the array.
     */
    public static void swap(int[] array, int index1, int index2) {
        array[index1] = array[index1]^array[index2]; // a = a xor b
        array[index2] = array[index1]^array[index2]; // b = (a xor b) xor b = a
        array[index1] = array[index1]^array[index2]; // a = (a xor b) xor a = b
    }

    /**
     * Returns the first index of an element in a given array
     */
    public static <T> int firstIndexOf(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (Utils.equals(element, array[i])) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Copies an array and returns a new array. If newSize is larger than the original array, the additional size of the
     * copied array will be padded with the defaultValue. If newSize is smaller, the copied array will only contain the first newSize
     * elements of the array.
     */
    public static int[] copyOf(int[] array, int newSize, int defaultValue) {
        int[] copy = new int[newSize];

        // Copy from original array to the copy. Copy the first newSize values or the entire array (whichever if smaller)
        int indexesToCopy = Math.min(newSize, array.length);

        System.arraycopy(array, 0, copy, 0, indexesToCopy);

        // Initialize any excess size to defaultValue
        for (int i = array.length; i < newSize; i++) {
            copy[i] = defaultValue;
        }

        return copy;
    }
}
