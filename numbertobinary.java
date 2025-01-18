import java.util.*;
class numbertobinary{
    public static String getBinaryNo(int N){
        StringBuilder S = new StringBuilder();
        String number = Integer.toBinaryString(N);
        int noOfZeroes = 30-number.length();
        for(int i=0; i<noOfZeroes; i++){
            S.append('0');
        }
        S.append(number);
        return S.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(getBinaryNo(N));
        sc.close();
    }
}