import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int pcount = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                pcount++;
            }
        }
        
        int[] arr1 = new int[pcount];
        int index = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                arr1[index] = arr[i];
                index++;
            }
        }
        
        Arrays.sort(arr1);
        
        int median;
        if(arr1.length % 2 == 0){
            median = (arr1[arr1.length/2 - 1] + arr1[arr1.length/2]) / 2;
        } else {
            median = arr1[arr1.length/2];
        }
        
        System.out.println("Median of positive elements: " + median);
    }
}
