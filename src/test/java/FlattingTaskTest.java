import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FlattingTaskTest {

    @Test
    public void flattingString() {
        List<String> arr = Arrays.asList("fed", "abc", "nz", "plk");
        FlattingTask mp = new FlattingTask();
        List<String > arr2 = mp.flattingString(arr);
        assertEquals("[f, e, d, a, b, c, n, z, p, l, k]", arr2.toString());
    }
}