import java.util.Scanner;
public class stringvol {
    public static String isVowel(String s){
        char arr[] = s.toCharArray();
        int n = arr.length;
        for(char ch:arr){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }   
        }
        return s;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        isVowel(s);
    }
    
}
