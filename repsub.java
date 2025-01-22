import java.util.Scanner;

public class repsub {
    public static int subrep(int A, int B){
        int count =0;
        while(A!=0 && B!=0){
            if(A>B){
                A-=B;
            } else {
                B=-A;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println("ENter numbers to subtract");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(subrep(a, b));

    }
    
}
