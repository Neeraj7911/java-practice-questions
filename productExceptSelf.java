import java.util.*;
public class productExceptSelf {
    public static int[] proexpself(int arr[]){
        int n = arr.length;
        if (n == 0) {
            return new int[0];
        }
        int [] result = new int[n];
        result[0]=1;
        for(int i=1; i<n;i++){
            result[i]=result[i-1]*arr[i-1];

        }
        int right = 1;
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*right;
            right=right*arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter lenght of array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n; i++){
            arr[i]=sc.nextInt();

        }
        int result[] = proexpself(arr);
        System.out.println("Product of array except self is:");
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
}
