import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Integer cntElm(Map.Entry<Character, List<String>> element) {
        int count = 0;
        for (String word : element.getValue()) {
            count += word.chars().filter(chr -> chr == element.getKey()).count();
        }
        return Integer.valueOf(count);
    }


    public Map<Character, Integer> groupIt(List<String> arr) {

        return arr
                .stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> GroupWordsTask.cntElm(entry)));
    }

}
