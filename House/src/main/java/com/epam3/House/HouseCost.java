package com.epam3.House;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class HouseCost 
{

	private static final Logger logg = LogManager.getLogger(HouseCost.class);
public int calculateHouseConstrucionCost(boolean standardMaterials , boolean aboveStandardMaterials , boolean highStandardMaterials , boolean automatedHome , int area) {
		
	logg.info("enter into the method");
	logg.info("exiting the method");
		if(standardMaterials)
			return 1200 * area ; 
		
		else if(aboveStandardMaterials)
		return 1500 * area ; 
		
		else if(highStandardMaterials == true && automatedHome == false)
			return 1800 * area ;
		
		else if(highStandardMaterials == true && automatedHome == true)
			return 2500 * area ; 
		return 0 ;
		
	}
}
