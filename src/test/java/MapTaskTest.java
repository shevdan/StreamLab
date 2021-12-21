import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MapTaskTest {

    @Test
    public void mapping() {
        List<String> arr = Arrays.asList("1", "abc", "2", "3");
        MapTask mp = new MapTask();
        List<Integer> arr2 = mp.mapping(arr);
        assertEquals("[1, 2, 3]", arr2.toString());
    }
}