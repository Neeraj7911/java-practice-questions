import java.util.*;
class armstrong{
    public static boolean armstrong1(int n){
        int num = n;
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        return sum==num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrong1(n));
    }
}