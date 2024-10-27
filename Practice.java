package coreJava;

import org.testng.annotations.Test;

public class Practice {

	
		static String name = "Mahender";
		
		@Test
		public void needClarity()
		{
			name = "Madhuri";
			System.out.println("1st name is "+name);
			name = "Aaradhya";
			System.out.println("2nd name is "+name);
			
		}

	

}
