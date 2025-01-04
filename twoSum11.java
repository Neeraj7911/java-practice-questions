import java.util.*;
public class twoSum11 {
    public static boolean twosuum(int arr[], int target){

        int n = arr.length;
        int start = 0;
        int end = n-1;
        int currsum = 0;
        Arrays.sort(arr);
        if(n==1) return false;
        while(start<end){
            currsum = arr[start]+arr[end];
            if(currsum==target){
                return true;
            }
            if(currsum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return false;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum");

        int k = sc.nextInt();
        boolean result = twosuum(arr, k);
        System.out.println("The sum is present in the array: "+result);
        
    }
}
