import java.util.*;

class ascdec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        optarr(arr);
        sc.close();
    }
    public static void optarr(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        int mid = n/2;
        for(int i=0; i<mid; i++){
            System.out.print(arr[i]);
        }
        for(int j=n-1; j>=mid; j--){
            System.out.print(arr[j]);
        }
    }
}