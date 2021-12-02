import rocks.lichthuis.entities.BinarySearch;
import rocks.lichthuis.entities.LoopBinarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Binary rocks.lichthuis.entities.Search
 *
 * @author Jorge Ortiz
 */
public class Application {
    static BinarySearch binarySearch = new BinarySearch(new LoopBinarySearch());

    public static void main(String[] args) {
        long[] array = new long[]{1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68};
        System.out.println("[1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68] search value: 12");
        System.out.println("index: " + binarySearch.search(array, 0, array.length, 12));
        System.out.println("[1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68] search value: 65");
        System.out.println("index: " + binarySearch.search(array, 0, array.length, 65));
        System.out.println("[1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68] search value: 69");
        System.out.println("index: " + binarySearch.search(array, 0, array.length, 69));
        System.out.println("[1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68] search value: 0");
        System.out.println("index: " + binarySearch.search(array, 0, array.length, 0));
        System.out.println("[1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68] search value: 1");
        System.out.println("index: " + binarySearch.search(array, 0, array.length, 1));
        System.out.println("[1, 2, 4, 6, 7, 8, 12, 23, 66, 67, 68] search value: 68");
        System.out.println("index: " + binarySearch.search(array, 0, array.length, 68));
    }
}

