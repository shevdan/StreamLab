import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzTask {

    public List<String> fizzBuzzIt(List<Integer> arr) {
        return arr.stream().map(FizzBuzzTask::buzz).collect(Collectors.toList());
    }

    public static String buzz(int num) {
        if (num % 3 == 0) {
          if (num % 5 == 0)
              return "Fizz Buzz";
          return "Fizz";
        }
        if (num % 5 == 0)
            return "Buzz";
        return String.valueOf(num);

    }
}
