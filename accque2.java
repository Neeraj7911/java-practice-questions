<<<<<<< HEAD
import java.util.*;
public class accque2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int summ = 0;
        System.out.print("Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        for(int j = 0; j<n; j++){
            if(arr[j]<0){
                summ = summ+arr[j];
            }
        }
        System.out.print(summ);

    }
}
=======
import java.util.*;
public class accque2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int summ = 0;
        System.out.print("Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        for(int j = 0; j<n; j++){
            if(arr[j]<0){
                summ = summ+arr[j];
            }
        }
        System.out.print(summ);

    }
}
>>>>>>> 690fa768a1796b6fcac9f20f68cac854276523dd
