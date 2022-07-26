package cd.get.ready.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        Map<String, Integer> map = new HashMap<>();
        for (String word : input) {
            int count = map.getOrDefault(word, 0);
            map.put(word, ++count);
        }

        int count = 0;
        for (Integer num : map.values()) {
            if (num > 1) count++;
        }
        return count;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : input) {
            int count = map.getOrDefault(num, 0);
            map.put(num, ++count);
        }

        int count = 0;
        for (Integer num : map.values()) {
            if (num > 1) count++;
        }
        return count;
    }
}
