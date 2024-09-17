import java.util.*;

public class Permutation {

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Method to calculate factorial
    public static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        int ans = 1;
        while (n > 0) {
            ans *= n--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        HashMap<Character, Integer> mp = new HashMap<>();
        int count = 0;
        
        // Counting non-vowel characters and storing their frequencies
        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i))) {
                count++;
                mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        // If no consonants, output 0
        if (count == 0) {
            System.out.println(0);
            return;
        }

        int deno = 1;

        // Calculating the denominator using the factorial of frequencies
        for (int freq : mp.values()) {
            deno *= fact(freq);
        }

        // Output the result
        System.out.println(fact(count) / deno);
    }
}
