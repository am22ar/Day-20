package com.JUnit;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistrationTest {
	userRegistration userRegistration = new userRegistration();
	 @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        boolean result = userRegistration.firstName("Sangeeta");
	        Assert.assertEquals(true, result);
	    }

	    @Test
	    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
	        boolean result = userRegistration.firstName("sangeeta");
	        Assert.assertEquals(false, result);
	    }
}
