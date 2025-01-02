import java.util.*;
public class rotatearr {
    private void revarr(int arr[], int end, int start){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int nums[], int k){
        int n = nums.length;
        k = k%n;
        revarr(nums,0,n-1);
        revarr(nums,0,k-1);
        revarr(nums,k,n-1);

    }
    public static void main(String[] args){
        rotatearr r = new rotatearr();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotations");
        int k = sc.nextInt();
        r.rotate(arr,k);
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
