package rocks.lichthuis.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit Tests for {@link RecursiveBinarySearch}
 *
 * @author Jorge Ortiz
 */
public class RecursiveBinarySearchTests {

    private RecursiveBinarySearch recursiveBinarySearch;
    private long[] array;

    @BeforeEach
    public void setup() {
        recursiveBinarySearch = new RecursiveBinarySearch();
        array = new long[]{1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68};
    }

    @AfterEach
    public void tearDown() {
        recursiveBinarySearch = null;
        array = null;
    }

    @Test
    public void testRecursiveBinarySearch() {
        assertEquals(6, recursiveBinarySearch.search(array, 0, array.length, 12));
    }

    @Test
    public void testRecursiveBinarySearchNonExistent() {
        assertEquals(-1, recursiveBinarySearch.search(array, 0, array.length, 65));
    }

    @Test
    public void testRecursiveBinarySearchNonExistentUpperBoundEdge() {
        assertEquals(-1, recursiveBinarySearch.search(array, 0, array.length, 69));
    }

    @Test
    public void testRecursiveBinarySearchNonExistentLowerBoundEdge() {
        assertEquals(-1, recursiveBinarySearch.search(array, 0, array.length, 0));
    }

    @Test
    public void testRecursiveBinarySearchExistentLowerBoundEdge() {
        assertEquals(0, recursiveBinarySearch.search(array, 0, array.length, 1));
    }

    @Test
    public void testRecursiveBinarySearchExistentUpperBoundEdge() {
        assertEquals(10, recursiveBinarySearch.search(array, 0, array.length, 68));
    }
}
