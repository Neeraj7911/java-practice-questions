import java.util.*;
public class moveZeroes {

    public static void moveZerotolast(int[] nums){
        int start = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=0){
                nums[start]=nums[i];
                start++;            }
        }
        while(start<nums.length){
            nums[start]=0;
            start++;
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        moveZerotolast(arr);
        System.out.println("Array after moving zeroes to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}