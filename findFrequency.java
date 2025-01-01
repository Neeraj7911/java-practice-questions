import java.util.*;
public class findFrequency {
    public static void calculateFrequency(int arr[], int x) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }

        }
        System.out.println("Frequency of " + x + " is: " + count);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the number of elements in the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find frequency:");
        int x = sc.nextInt();
        calculateFrequency(arr, x);

    }
}
