import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SuperString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String input = "";
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            input = scanner.next();
            char[] sequence = input.toCharArray();
            for (int j = 0; j < sequence.length; j++) {
                if (hashMap.containsKey(sequence[j]))
                {
                    int count = 1;
                    count += hashMap.get(sequence[j]);
                    hashMap.replace(sequence[j],count);
                }
                else {
                    hashMap.put(sequence[j],1);
                }
            }
            int flag = 0;
            for (char s: hashMap.keySet()) {
                if (s != alphabets[hashMap.get(s)-1])
                {
                    flag = 1;
                    System.out.print("NO");
                    break;
                }
            }
            if (flag == 0)
            {
                System.out.print("YES");
            }
            hashMap.clear();
        }
    }
}
