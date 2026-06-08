import java.util.*;
import java.io.*;

public class make_itgood {
    
    public int solve(long n) {
        // your logic here
        return count;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        Main obj = new Main();
        
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            System.out.println(obj.solve(n));
        }
    }
}