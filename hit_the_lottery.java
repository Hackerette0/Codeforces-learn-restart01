import java.io.*;

public class hit_the_lottery {
    
    public int solve(long n) {
        int count = 0;
        long remainingAMT = n;

        //already arranged in decreasing order 
        int[] coins = {100, 50, 20, 10, 5, 1};

        for (int i = 0; i< coins.length ; i++){
            int coinVal = coins[i];
            if (remainingAMT >= coinVal){
                count += remainingAMT / coinVal;
                remainingAMT = remainingAMT % coinVal;

            }
        }


        return count;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        hit_the_lottery obj = new hit_the_lottery();
        
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            System.out.println(obj.solve(n));
        }
    }
}