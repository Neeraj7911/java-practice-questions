import java.util.*;
public class twoSum {
    public static int[] twosum(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum==target){
                return new int[]{start+1, end+1};
            }else if(sum<target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println(
            "Enter the length of the array"
        );
        //sc.close();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum");
        int k = sc.nextInt();
        int result[] = twosum(arr, k);
        System.out.println("The indices of the two numbers are:");
        for(int i=0;i<2;i++){
            System.out.print(result[i]+" ");
        }


    }
}
