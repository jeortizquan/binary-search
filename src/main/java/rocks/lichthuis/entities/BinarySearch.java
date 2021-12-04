package rocks.lichthuis.entities;

/**
 * Binary Search strategy pattern
 *
 * @author Jorge Ortiz
 */
public class BinarySearch {
    private Search solver;

    public BinarySearch(Search solver) {
        this.solver = solver;
    }

    public long search(long[] array, int start, int end, long value) {
        return solver.search(array, start, end, value);
    }
}


