import java.util.*;
public class isPalindrome {
    public static boolean isPalindromee(String s){
        int n = s.length();
        int start = 0;
        int end = n-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        boolean result = isPalindromee(s);
        System.out.println("The string is a palindrome: "+result);
    }
}
