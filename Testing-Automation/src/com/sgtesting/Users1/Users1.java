package com.sgtesting.Users1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users1 {

	@Test
	public void CreateUser()
	{
		System.out.println("User Has Created Successfully");
	}
	@Test
	public void ModifyUser()
	{
		System.out.println("User has Modified Successfully");
	}
	@Test
	public void deleteUser()
	{
		System.out.println("User has Deleted Successfully");
	}
	@BeforeClass
	public void setUp()
	{
		System.out.println("Before The Class");
	}
	@AfterClass
	public void tearUp()
	{
		System.out.println("AfterClass");
	}
}
