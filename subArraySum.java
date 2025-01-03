import java.util.HashMap;

public class subArraySum {
    public int subarraySum(int[] nums, int k) {
        // HashMap to store the cumulative sum and its frequency
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Initial condition: A sum of 0 has been seen once

        int count = 0;
        int currentSum = 0;

        // Iterate through the array
        for (int num : nums) {
            currentSum += num; // Update the cumulative sum

            // Check if (currentSum - k) exists in the map
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k); // Add the frequency of the matching prefix sum
            }

            // Update the frequency of the current sum in the map
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
