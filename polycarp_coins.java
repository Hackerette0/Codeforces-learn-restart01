import java.util.*;


public class polycarp_coins {
    
    public static void solve(long n) {
        long b = n / 3;
        long a = n - 2 * b;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                long n = sc.nextLong(); 
                
                solve(n);
            }
        }
    }
}

