
package math.util.live;

public class ClassCon extends MathUtilLive{
    public static long getFactorial(int n) {
        //ham tinh giai thua; n! = 1 * 2 * ... * n
        //0! = 1! = 1
        //ko tinh duoc giai thua cho so am
        //20! la vua khop kieu long. vi long toi da 18 so 0
        //giai thua la ham tang cuc nhanh ve gia tri
        //neu muon dung tu 21! tro len ta phai dung longlong hoac kieu lon hon nua
        //QUY UOC
            //neu dua vao so am hoac > 21! ta ko tinh, ma se bao 1 ngoai le
            //trong C, neu ko thay ta tra ve -1, no van la 1 value, dieu nay ko nen
        
        //dieu kien dau vao    
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("invalid argument. n must be between 0 and 20");
        
        //o day n tu 0 -> 20
        if(n == 0 || n ==1)
            return 1;
        
        //o day n tu 2 -> 20. ta adung for hoac de quy(recursion)
        int p = 1;
        for (int i = 2; i <= n; i++)
            p *= i;
        return p;
    }
    
    
    
    
}
