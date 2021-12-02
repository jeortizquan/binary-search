package rocks.lichthuis.entities;

/**
 * The type Recursive binary search.
 */
public class RecursiveBinarySearch implements Search {

    /**
     * Binary rocks.lichthuis.entities.Search function in an array of integers
     *
     * @param numbers array of integers
     * @param start   lower bound
     * @param end     upper bound
     * @param value   value to search
     * @return index of value if found or -1 if not found
     */
    @Override
    public long search(long[] numbers, int start, int end, long value) {
        int index = (start + end) / 2;
        if (start > end)
            return -1;
        else if (numbers[index] == value)
            return index;
        else if (numbers[index] < value)
            return search(numbers, index + 1, end, value);
        else if (numbers[index] > value)
            return search(numbers, start, index - 1, value);

        return -1;
    }
}
