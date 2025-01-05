import java.util.*;
public class threeSum {
    public static List<List<Integer>> threeSum1(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        if(arr==null || n<3) return result;

        for(int i=0; i<n-2; i++){
            if(i<0 && arr[i]==arr[i-1])continue;
            int start = i+1;
            int end = n-1;
            while(start<end){
                int sum = arr[i]+arr[start]+arr[end];
                if(sum==0){
                    result.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    while(start<end && arr[start]== arr[start+1]) start++;
                    while(start<end && arr[end]==arr[end-1]) end--;
                } else if(sum<0){
                    start++;
                } else{
                    end--;
                }
            }
        }
return result;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> result = threeSum1(arr);
        System.out.println(result);

    }
    
}
