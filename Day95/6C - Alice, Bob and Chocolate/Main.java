import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int i = 0;
        int j = n-1;
        
        int a = 0;
        int b = 0;
        
        int A = 0;
        int B = 0;
        
        while(i<=j){
            if(a<=b){
                a += arr[i];
                i++;
                A++;
            }else{
                b += arr[j];
                j--;
                B++;
            }
        }
        
        System.out.print(A + " " + B);
    }
}