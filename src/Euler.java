import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Euler {
	
	public static void main(String[] args) {

		BigDecimal e = BigDecimal.ZERO;
		
		//????
		MathContext mc = new MathContext(100, RoundingMode.HALF_UP);//????
		//????
		
		for(int i = 0; i < 100; i++)
		{			
			e = e.add(
						BigDecimal.ONE.divide(
												(Fakt(new BigDecimal(i))) , mc /*mc??*/
											 )
					 );
		}
		System.out.println("e: "+e);
	}
	
	public static BigDecimal Fakt(BigDecimal x) {
		if(x.equals(BigDecimal.ZERO)) return BigDecimal.ONE;
		else
			return x.multiply(Fakt(x.subtract(BigDecimal.ONE)));//subtract = levon | rekurzív megvalósítás
	}

}
