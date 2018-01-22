package com.gontuseries.studentadmissioncontroller;

import java.beans.PropertyEditorSupport;

public class MyCustomProperties extends PropertyEditorSupport {
	
	


	@Override
	public void setAsText(String suburb) throws IllegalArgumentException {
		{
			if (suburb.equals("Chandigarh"))
			{
				suburb = suburb + "Local";
			
			System.out.println();
				setValue(suburb);
				
			}
					
		}
		
	}



}
