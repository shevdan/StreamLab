import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzTaskTest {

    @Test
    public void fizzBuzzIt() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        FizzBuzzTask mp = new FizzBuzzTask();
        List<String> arr2 = mp.fizzBuzzIt(arr);
        assertEquals("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz]",
                arr2.toString());
    }
}