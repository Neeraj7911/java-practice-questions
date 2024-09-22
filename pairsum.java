import java.util.ArrayList;
import java.util.List;

public class pairsum{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]> result = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==s){
                    if(arr[i]>=arr[j]){
                        result.add(new int[] {arr[j], arr[i]});
                    } else{
                        result.add(new int[] {arr[i], arr[j]});
                    }
                }
            }
        }
       result.sort((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        
        return result;
    }
}
