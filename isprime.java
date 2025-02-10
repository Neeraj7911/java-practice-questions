import java.util.*;
public class isprime {
    public static String isPrime(int n){
        if(n<1){
            return "Not Prime";
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
