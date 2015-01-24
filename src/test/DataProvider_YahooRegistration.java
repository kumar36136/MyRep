package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_YahooRegistration {
	
	@Test (dataProvider="dataRegister")
	public void testRegistration(String username, String password, String email, String city){
		System.out.println(username+"  "+"  "+password+"  "+"  "+email+"  "+city);
		
	}
	
	@DataProvider
	public Object[][] dataRegister(){
		Object data[][] = new Object[3][4];
		
//		row 1
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = "email1";
		data[0][3] = "city1";
		
//		row 2
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = "email2";
		data[1][3] = "city2";
		
//		row 3
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = "email3";
		data[2][3] = "city3";
		
		return data;
	}

}
