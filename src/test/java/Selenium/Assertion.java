package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertion {
  @Test
  public void firsmethod() {
	  Assert.assertEquals(true, false);
	  Assert.assertEquals(false, false);
		  
  }
  @Test
  public void secondmethod()
  {
	  SoftAssert sa= new SoftAssert();
	  sa.assertEquals(true, false);
	  sa.assertEquals(true, true);
	  
  }
}