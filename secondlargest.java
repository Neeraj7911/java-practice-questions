import java.util.*;

public class secondlargest {

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {
        int num=-1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n = sc.nextInt();
                int arr[] = new int[n];

        System.out.println("Enter the elements in array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=n-1; i>=0; i--){
            if(arr[i]>arr[i-1]){
                num = arr[i-1];
                break;
            }
        }
        System.out.println("second"+num);

    }

    
}
