package test;
import junit.framework.Assert;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {

	@BeforeTest
	public void beforemethod(){
//		System.out.println("before Sample Test called");
//		skipping this test
//		throw new SkipException("Some reason");
	}
	
	@Test
	public void test1(){
		System.out.println("Test case 1");	
		Assert.assertEquals("apple", "apple");
		System.out.println("before assert");
		Assert.assertTrue("apple laptop", 6<9);
		System.out.println("after assert");
	}	
}
