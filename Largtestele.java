import java.util.*;
public class Largtestele {
    public static int largest(int arr[]){
        int n = arr.length;
        int max = arr[0];
        for(int i=1;i<n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest Element is: "+largest(arr));


}
}
