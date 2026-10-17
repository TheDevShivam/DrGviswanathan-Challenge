import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int k = sc.nextInt();
        int r = sc.nextInt();
 
        for (int i = 1; i <= 10; i++) {
            int price = k * i;
 
            if (price % 10 == 0 || price % 10 == r) {
                System.out.println(i);
                break;
            }
        }
    }
}