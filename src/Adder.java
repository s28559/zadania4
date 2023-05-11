import java.math.BigDecimal;
import java.util.List;

public class Adder {
    public int add (int a, int b){
        return a+b;
    }
    public BigDecimal add(List<BigDecimal> decimals){
        BigDecimal sum = new BigDecimal("0");
        for (int i=0; i<decimals.size();i++){
            sum= sum.add(decimals.get(i));
        }
        return sum;
    }
}