package Interest;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SimpleInterestCalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	SimpleInterestCalculator obj = new SimpleInterestCalculator() ; 
    	/*
    	 * test cases for the simple interest calculation
    	 * 
    	 */
    	assertEquals(1200,obj.calculateSimpleInterest(1000, 12, 10));
    	assertEquals(4800,obj.calculateSimpleInterest(2000, 12, 20));
    	assertEquals(4800,obj.calculateSimpleInterest(4000, 12 , 10));
    	assertEquals(6000,obj.calculateSimpleInterest(5000, 12, 10));
    	/*
    	 * test cases for the compound interest calculation
    	 * calculates the compound interest annually
    	 */
    	assertEquals(100 , obj.calculateCompoundInterest(1000, 12, 10));
        assertEquals( 400 , obj.calculateCompoundInterest(4000, 12, 10) );
        assertEquals( 200 , obj.calculateCompoundInterest(2000, 12, 10) );
        assertEquals( 800 , obj.calculateCompoundInterest(8000, 12, 10) );
        
    }
}
