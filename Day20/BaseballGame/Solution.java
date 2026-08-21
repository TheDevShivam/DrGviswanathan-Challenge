import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<operations.length;i++){
            if(operations[i].equals("+")){
                int a = s.pop();
                int b = s.peek();
                s.push(a);
                s.push(a+b);
            }else if(operations[i].equals("D")){
                int c = s.peek();
                s.push(2*c);
            }else if(operations[i].equals("C")){
                s.pop();
            }else{
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int sum =0;

        while(!s.isEmpty()){
            sum += s.pop();
        }

        return sum;
        
    }
}