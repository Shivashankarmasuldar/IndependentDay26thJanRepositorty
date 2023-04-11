package com.sgtesting.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {

	@Test
	public void createuser()
	{
		System.out.println("The User Demouser1 has created Successfully");
	}
	@Test
	public void modifyeuser()
	{
		System.out.println("The User Demouser1 has modified Successfully");
	}
	@Test
	public void deleteUser()
	{
		System.out.println("The User Demouser1 has deleted Successfully");
	}
	@BeforeClass
	public void setUp()
	{
		System.out.println("launch chrome browser,navigate the URL and login the Application");
	}
	@AfterClass
	public void tearDown()
	{
		System.out.println("logout from the Application and close Application");
		System.out.println("#########################################");
	}
}

