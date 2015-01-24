package test;

import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class yahooTest {

  @BeforeClass
  public void beforeclass(){  
	  System.out.println("Before class called");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test called");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method called");
  }
  
  @Test
  public void test1() {
	  System.out.println("Executing test 1");
  }
  
  @Test
  public void test2() {
	  System.out.println("Executing test 2");
  }
  
  @AfterClass
  public void afterclass(){  
	  System.out.println("After class called");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test called");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method called");
  }
}
