import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    int sum=0;
    for(int i=0; i<k; i++){
      sum += arr[i];
    }
    
    int i = 1;
    int j = k;
    int minIdx = 0;
    int minSum = sum;

    while(j<n){
      sum = sum + arr[j] - arr[i-1];
      if(sum < minSum){
          minSum = sum;
          minIdx = i;
        }
      i++;
      j++;
    }

    System.out.print(minIdx+1);
  }
}