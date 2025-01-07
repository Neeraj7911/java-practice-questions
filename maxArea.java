import java.util.Scanner;

public class maxArea{
    public int maxArea1(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int maxSum = 0;
        while(start<end){
            int currsum = Math.min(arr[start], arr[end])*(end-start);
            maxSum = Math.max(maxSum,currsum);
            if(arr[start]<arr[end]) start++;
            else end--;

        }
        return maxSum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        maxArea obj = new maxArea();
        System.out.println(obj.maxArea1(arr));
        


    }
}