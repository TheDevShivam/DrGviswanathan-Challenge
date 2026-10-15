
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String ss = sc.next();
        StringBuilder str = new StringBuilder("");
        String s = ss.toLowerCase();
        String vowels = "aeiouy";
        
        for(int i=0; i<s.length();i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                continue;
            }else{
                str.append("."+s.charAt(i));            }
        }
        
        System.out.println(str.toString());
    }
}