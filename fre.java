<<<<<<< HEAD
import java.util.*;
class fre{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        countfre(arr);
        sc.close();
    }
    public static void countfre(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count=1;
            while(i<n-1 && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            System.out.println(arr[i]+" "+count);
        }
    }
=======
import java.util.*;
class fre{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        countfre(arr);
        sc.close();
    }
    public static void countfre(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count=1;
            while(i<n-1 && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            System.out.println(arr[i]+" "+count);
        }
    }
>>>>>>> 09b10f1 (ascdec)
}