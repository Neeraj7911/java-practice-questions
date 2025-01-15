import java.util.*;
class reciProcal{
    public static String reciProcal1(String S){
        StringBuilder result = new StringBuilder();
        for(char ch: S.toCharArray()){
            if(Character.isUpperCase(ch)){
                char value = (char) ('Z'-(ch-'a'));
                result.append(value);
            } else if(Character.isLowerCase(ch)){
                char value = (char) ('z'-(ch-'a'));
                result.append(value);
            } else {result.append(ch);}
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String S = sc.nextLine();
        System.out.println(reciProcal1(S));
        
    }
}
