package com.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtil {
	
	public static String empname()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return("abc"+generatedString);
	}




public static String empsal() {
	String genereatedString = RandomStringUtils.randomNumeric(5);
	return(genereatedString);
}
public static String empAge()
{
	String generatedString = RandomStringUtils.randomNumeric(2);
	return(generatedString);
}

}
