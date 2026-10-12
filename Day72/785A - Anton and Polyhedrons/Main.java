import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(sc.next());
        }
        int ans = 0;
        
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).equals("Tetrahedron")) ans += 4;
            if(arr.get(i).equals("Cube")) ans += 6;
            if(arr.get(i).equals("Octahedron")) ans += 8;
            if(arr.get(i).equals("Dodecahedron")) ans += 12;
            if(arr.get(i).equals("Icosahedron")) ans += 20;
        }
        System.out.println(ans);
    }
}