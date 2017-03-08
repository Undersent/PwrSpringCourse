package com.example.models;

import java.util.HashMap;
import java.util.Map;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

public class Exchanger {

	Map<String, Double> currencyInPLN = new HashMap<String, Double>();
	
		public Exchanger(){
			currencyInPLN.put("PLN", 1.0);
			currencyInPLN.put("EUR", 4.0);
			currencyInPLN.put("USD", 3.0);
		}
		
		
		public double getRatio(String currencyFrom, String currencyTo) throws Exception
		{
			if(!currencyFrom.contains(currencyFrom) 
					&& !currencyTo.contains(currencyTo)){
				throw new InvalidTargetObjectTypeException();
			}
			
			return currencyInPLN.get(currencyFrom) / currencyInPLN.get(currencyTo);
		}
		
		
}
