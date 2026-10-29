import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            if(360 % (180-a) == 0){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}