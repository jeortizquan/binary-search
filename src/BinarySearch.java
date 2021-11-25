/**
 * Binary Search
 *
 * @author Jorge Ortiz
 */
public class BinarySearch {
    /**
     * Binary Search function in an array of integers
     *
     * @param numbers       array of integers
     * @param from          lowerbound
     * @param to            upper bound
     * @param valueToSearch value to search
     * @return index of value if found or -1 if not found
     */
    public static int binarySearch(int[] numbers, int from, int to, int valueToSearch) {
        int index = (from + to) / 2;
        if (from > to)
            return -1;
        else if (numbers[index] == valueToSearch)
            return index;
        else if (numbers[index] < valueToSearch)
            return binarySearch(numbers, index + 1, to, valueToSearch);
        else if (numbers[index] > valueToSearch)
            return binarySearch(numbers, from, index - 1, valueToSearch);
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68};
        System.out.println("[1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68] search value: 12");
        System.out.println("index: " + binarySearch(array, 0, array.length, 12));
        System.out.println("[1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68] search value: 65");
        System.out.println("index: " + binarySearch(array, 0, array.length, 65));
    }
}
