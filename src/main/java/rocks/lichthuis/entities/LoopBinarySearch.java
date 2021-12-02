package rocks.lichthuis.entities;

/**
 * The type Loop binary search.
 */
public class LoopBinarySearch implements Search {

    /**
     * Binary rocks.lichthuis.entities.rocks.lichthuis.entities.Search function in an array of integers
     *
     * @param numbers array of integers
     * @param start   lower bound
     * @param end     upper bound
     * @param value   value to search
     * @return index of value if found or -1 if not found
     */
    @Override
    public long search(long[] numbers, int start, int end, long value) {

        while (end > start) {
            int index = (start + end) / 2;
            if ( numbers[index] == value)
                return index;
            if ( numbers[index] < value )
                start = index + 1;
            if ( numbers[index] > value )
                end = index - 1;
        }

        return -1;
    }

}
