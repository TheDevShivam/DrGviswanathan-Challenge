import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 
        int limit = a * b * c;
        int[] divisors = new int[limit + 1];
 
        for (int i = 1; i <= limit; i++) {
            for (int j = i; j <= limit; j += i) {
                divisors[j]++;
            }
        }
        long sum = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    sum += divisors[i * j * k];
                }
            }
        }
 
        System.out.println(sum % 1073741824);
    }
}