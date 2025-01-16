import java.util.*;
class isSumPalin{
    public static boolean isSumPalin1(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        int num=sum, rev=0;
        while(sum>0){
            int digit= sum%10;
            rev= rev*10+digit;
            sum/=10;
        }
        return rev==num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isSumPalin1(n));
    }
}