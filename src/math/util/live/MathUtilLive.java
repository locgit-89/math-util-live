
package math.util.live;

import java.util.Scanner;

public class MathUtilLive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        long n = ClassCon.getFactorial(m);
        System.out.println(m + "! expect = 120. actual = " + n);
        
    }
    
}

