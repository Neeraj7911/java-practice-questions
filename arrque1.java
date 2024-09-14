import java.util.*;
public class arrque1{
    public static int retSingleno(int[] arr){
        int result=0;
        for(int i:arr){
            result ^= i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(retSingleno(arr));
    }
} 