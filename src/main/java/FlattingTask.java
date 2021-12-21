import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {

    public List<String> flattingString(List<String> arr) {
        return arr.stream().flatMap(x -> x.chars().mapToObj(y -> (String.valueOf((char) y))))
                .collect(Collectors.toList());
    }

}
