import java.util.*;
class accque1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("r: ");
        int r = sc.nextInt();
        System.out.print("unit: ");
        int unit = sc.nextInt();
        System.out.print("n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("input array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.print(solve(arr,r,unit,n));
    }
    public static int solve(int[] arr,int r, int unit, int n){
        int res = r*unit;
        int sum = 0;
        int count = 0;
        if(arr==null){
            return -1;
        }
        for(int i=0; i<n;i++){
            sum = sum+arr[i];
            count++;
            if(sum>=res) break;
        }
        if(sum < res){
            return 0;
        }
            return count;
            
    }

}