import java.util.*;

class replace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int result=0, place=1;
        while(n>0){
            int digit = n%10;
            if(digit==0){
                digit = 5;
            }
            result = result+(digit*place);
            n /=10;
            place *=10;
        }
        System.out.print(result);
    }
}