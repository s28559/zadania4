import java.math.BigDecimal;

public class Multiplier {

    public int multiply(int a, int b){
        return a*b;
    }
    public int multiply(int a, int b, int c, int d){
        return multiply(a,b)*c*d;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public BigDecimal multiply(BigDecimal a, BigDecimal b){
        return a.multiply(b);
    }
}
