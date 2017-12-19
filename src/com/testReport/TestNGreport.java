package com.testReport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGreport {
	
	@Test
	public void test1()
	{
		Reporter.log("TC_Portal_001: To verify that user is able to submite application to OWLS portal.");
		
		Reporter.log("Step 1. ");
		
		Reporter.log("Step 2. ");
		Reporter.log("Step 3. ");
		Reporter.log("Step 4. ");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2()
	{
		Reporter.log("TC_CRM_001: To verify submitted Application task status for application having Convictions, document uploded and wildlife possession.");
		
		Reporter.log("Step 1. ");
		
		Reporter.log("Step 2. ");
		Reporter.log("Step 3. ");
		Reporter.log("Step 4. ");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3()
	{
		Reporter.log("TC_CRM_002: To verify online User submits a basic application with a condition which will trigger review of the application.");
		
		Reporter.log("Step 1. ");
		
		Reporter.log("Step 2. ");
		Reporter.log("Step 3. ");
		Reporter.log("Step 4. ");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test4()
	{
		Reporter.log("TC_CRM_003: To verify submitted Application's 'Interview/Site Inspection' task and it should be wildlife licensing queue and inspecting screen should be visibile to the role - Manager wildlife licensing.");
		
		Reporter.log("Step 1. ");
		
		Reporter.log("Step 2. ");
		Reporter.log("Step 3. ");
		Reporter.log("Step 4. ");
		throw new SkipException("Skipping Test case as Task status is not 'Approval By Delegate'.");
	}
	
	@Test
	public void test5()
	{
		Reporter.log("TC_CRM_005: To verify user can Complete Await Payment Confirmation Task and Permit Document PDF generated.");
		
		Reporter.log("Step 1. ");
		
		Reporter.log("Step 2. ");
		Reporter.log("Step 3. ");
		Reporter.log("Step 4. ");
		throw new SkipException("Skipping Test case as Task status is not 'Approval By Delegate'.");

	}

}
