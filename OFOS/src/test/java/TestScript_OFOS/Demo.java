package TestScript_OFOS;

import org.testng.annotations.Test;

import generic.Base_Test;

public class Demo extends Base_Test{
	
	@Test
	public void demo() {

		String unm;
		
		
		try {
			unm = getValueProperty("unm");
			System.out.println(unm);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
