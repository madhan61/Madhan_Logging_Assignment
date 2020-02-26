package com.epam3.House;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HouseCostTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	 HouseCost obj = new HouseCost() ;
         
         assertEquals(4800 , obj.calculateHouseConstrucionCost(true,false,false,false,4)) ; 
         
         assertEquals(6000 , obj.calculateHouseConstrucionCost(false,true,false,false,4)) ;
         
         assertEquals(1800 , obj.calculateHouseConstrucionCost(false,false,true,false,1)) ;
         
         assertEquals(2500 , obj.calculateHouseConstrucionCost(false,false,true,true,1)) ;
    
    }
}
