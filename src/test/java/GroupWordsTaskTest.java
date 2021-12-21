import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GroupWordsTaskTest {

    @Test
    public void groupIt() {
        List<String> arr = Arrays.asList("ABCA", "BCD", "ABC");
        GroupWordsTask mp = new GroupWordsTask();
        Map<Character, Integer> arr2 = mp.groupIt(arr);
        assertEquals("{A=3, B=1}", arr2.toString());
    }
}