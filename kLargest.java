import java.util.*;

public class kLargest {
    static List<Integer> kLargestt(int arr[], int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int ch:arr){
            minHeap.add(ch);
            if(minHeap.size()>k){
                minHeap.poll();

            }

        }
        List<Integer> result = new ArrayList<>(minHeap);
        Collections.sort(result,Collections.reverseOrder());
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array");

        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        List<Integer> result = kLargestt(arr,k);
        System.out.println(result);
        sc.close();

    }
}
