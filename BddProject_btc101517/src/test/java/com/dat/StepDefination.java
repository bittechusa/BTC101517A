package com.dat;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefination
{
	@Given("^open browser$")
	public void open_browser(DataTable arg1) throws Throwable {
	   List<List<String>>  datas=arg1.raw();
	   String f=datas.get(1).get(0);
	   if(f.equals("firefox"))
	   {
		   System.out.println("opened firefox");
	   }
	   else if(f.equals("chrome"))
	   {
		   System.out.println("opened chrome");
	   }
	}

	@When("^i type pass$")
	public void i_type_pass() throws Throwable {
	    System.out.println("gfjd");
	}

}
