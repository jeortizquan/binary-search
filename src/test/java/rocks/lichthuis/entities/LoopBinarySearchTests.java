package rocks.lichthuis.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit Tests for {@link LoopBinarySearch}
 *
 * @author Jorge Ortiz
 */
public class LoopBinarySearchTests {
    private LoopBinarySearch loopBinarySearch;
    private long[] array;

    @BeforeEach
    public void setup() {
        loopBinarySearch = new LoopBinarySearch();
        array = new long[]{1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68};
    }

    @AfterEach
    public void tearDown() {
        loopBinarySearch = null;
        array = null;
    }

    @Test
    public void testLoopBinarySearch() {
        assertEquals(6, loopBinarySearch.search(array, 0, array.length, 12));
    }

    @Test
    public void testLoopBinarySearchNonExistent() {
        assertEquals(-1, loopBinarySearch.search(array, 0, array.length, 65));
    }

    @Test
    public void testLoopBinarySearchNonExistentUpperBoundEdge() {
        assertEquals(-1, loopBinarySearch.search(array, 0, array.length, 69));
    }

    @Test
    public void testLoopBinarySearchNonExistentLowerBoundEdge() {
        assertEquals(-1, loopBinarySearch.search(array, 0, array.length, 0));
    }

    @Test
    public void testLoopBinarySearchExistentLowerBoundEdge() {
        assertEquals(0, loopBinarySearch.search(array, 0, array.length, 1));
    }

    @Test
    public void testLoopBinarySearchExistentUpperBoundEdge() {
        assertEquals(10, loopBinarySearch.search(array, 0, array.length, 68));
    }
}
