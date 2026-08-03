
public class Solution {
    public int addDigits(int num) {
       if(num == 0){
        return 0;
       } 
       
       while(num>9){
        int sum = 0;
        while(num>0){
            int lastDigit = num%10;
            sum += lastDigit;
            num = num/10;
        }

        num = sum;
       } 

     return num;
    }
}