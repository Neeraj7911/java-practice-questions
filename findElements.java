import java.util.Arrays;

public class findElements {
    public long[] findElement(long arr[]) {
        // Your code goes here
        int n = arr.length;
        Arrays.sort(arr);
        long [] nums = new long[n-2];
        for(int i=0; i<n-2; i++){
            nums[i]=arr[i];
            
        }
        return nums;
    }
    
}
