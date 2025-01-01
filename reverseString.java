import java.util.*;

public class reverseString {
    public static void revstr(char s[]){
        int start = 0, end = s.length-1;
        while(end>start){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string:");
        char s[] = sc.next().toCharArray();
        revstr(s);
        System.out.println("Reverse of the string is:" + new String(s));

    }
    
}
