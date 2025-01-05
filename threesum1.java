import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class threesum1 {
    // User function Template for Java
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            map.computeIfAbsent(arr[i], x -> new ArrayList<>()).add(i);
        }

        for (int j = 1; j < arr.length - 1; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                int sum = -1 * (arr[j] + arr[k]);
                
                if (map.containsKey(sum)) {
                    for (int i : map.get(sum)) {
                        if (i < j) {
                            res.add(Arrays.asList(i, j, k));
                        }
                    }
                }
            }
        }
        
        return res;
    }
}
    
}
