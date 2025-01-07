import java.util.Scanner;

public class revstr {
    public static String revstr(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String result = revstr(s);
        System.out.println("The reversed string is: "+result);



    }
}
