import java.math.BigInteger;

/**
 * Created by arshadshaik on 12/3/15.
 */
public class LargestPrimeFactor {
    public static void main(String args[]){
        double n = 600851475143d;

       // System.out.print(max.toString());
        long largestFactor = 0;
        for (int i = 2;i<=n ;++i){
            if (n%i == 0 ){
                n = n/i;
                largestFactor = i;
            System.out.println(largestFactor);
            }

        }
    //System.out.println(largestFactor);

    }


}
