class countTriplets {
    public int countTriplets1(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];

                if (sum == target) {
                    // Count duplicates for start and end
                    if (arr[start] == arr[end]) {
                        // All elements between start and end are the same
                        int totalElements = end - start + 1;
                        count += (totalElements * (totalElements - 1)) / 2;
                        break;
                    }

                    // Count duplicates on both sides
                    int leftCount = 1, rightCount = 1;

                    while (start < end && arr[start] == arr[start + 1]) {
                        leftCount++;
                        start++;
                    }
                    while (start < end && arr[end] == arr[end - 1]) {
                        rightCount++;
                        end--;
                    }

                    // Add combinations
                    count += leftCount * rightCount;
                    start++;
                    end--;
                } else if (sum < target) {
                    start++; // Explore larger sums
                } else {
                    end--; // Explore smaller sums
                }
            }
        }

        return count;
    }
}
