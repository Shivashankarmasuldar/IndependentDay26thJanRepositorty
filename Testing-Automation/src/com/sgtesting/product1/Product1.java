package com.sgtesting.product1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Product1 {

	@Test
	public void CreateProduct()
	{
		System.out.println("Product has Created Successfully");
	}
	@Test
	public void ModifyProduct()
	{
		System.out.println("Product has Modified Successfully");
	}
	@Test
	public void deleteproduct()
	{
		System.out.println("Product has Deleted Successfully");
	}
	@BeforeClass
	public void SetUp()
	{
		System.out.println("Before Class Has Executed");
	}
	@AfterClass
	public void TearUp()
	{
		System.out.println("After Class Has Executed");
	}
	
}
