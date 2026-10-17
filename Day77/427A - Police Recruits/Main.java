import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int police = 0, count = 0;
 
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
 
            if (a == -1) {
                if (police == 0)
                    count++;
                else
                    police--;
            } else {
                police += a;
            }
        }
 
        System.out.println(count);
    }
}