package Interest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class SimpleInterestCalculator 
{
	private static final Logger logg = LogManager.getLogger(SimpleInterestCalculator.class);
	

public int calculateSimpleInterest(int amount , int timeInMonths , int interestRate) {
	logg.info("entering into the method");
	logg.info("exiting the method");
		
		return (( amount * timeInMonths * interestRate)/100 ) ;
		
	}
	public int calculateCompoundInterest(int amount , int timeInMonths , int interestRate) {
		logg.info("entering into the method");
		logg.info("exiting the method");
		
		return (int) ((Math.pow( 1 + (interestRate / 100.0), timeInMonths / 12.0 ) * amount) - amount) ; 
		
		
	}

}
