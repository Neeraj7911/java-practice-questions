import java.util.*;
class removeSpaces {
    static String modify(String s){
        String arr = s.replace(" ","");
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String newS = sc.nextLine();
        
        
        System.out.println(modify(newS));
    }
}