import java.util.HashMap;

public class noTriples {
    public static boolean noTriples(int[] nums) {
        // create an hashmap that holds all elements as the key
        HashMap<Integer, Integer> occurence = new HashMap<>();
    
        for (int num: nums) {
            if (occurence.containsKey(num)){
                occurence.put(num , occurence.get(num) + 1); // if number present, increment the frequency value
            } else {
                occurence.put(num, 1);
            }
        }
        // debugging
        for (HashMap.Entry<Integer, Integer> entry : occurence.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (HashMap.Entry<Integer, Integer> entry: occurence.entrySet()) {
            if (entry.getValue() == 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
    }
}