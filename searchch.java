import java.util.*;
public class searchch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        sc.close();
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.print(count);
    }
}