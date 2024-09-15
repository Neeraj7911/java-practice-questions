import java.util.*;
public class climb{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        int climb = N/M;
        int remclimb = N%M;
        int tclimb = climb+remclimb;
        System.out.print(tclimb);
    }
}