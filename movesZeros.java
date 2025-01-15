import java.util.*;
public class movesZeros {
    public static void moveZero(int[] arr){
        int newIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                continue;
            }
            arr[newIndex++]=arr[i];
        }
        for(int i=newIndex; i<arr.length;i++){
            arr[i]=0;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        moveZero(arr);
        System.out.println("Array after moving zeros to the end:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
