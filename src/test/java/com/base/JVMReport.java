package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {

	public static void generateJVMReport(String josFile) {
		// location of the JVMReport to store
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports");
		Configuration con=new Configuration(loc, "Adaction");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "83");
		con.addClassifications("Operating System Name", "Windows");
		con.addClassifications("Operating System Verstion", "10");
		con.addClassifications("Operating System Type", "64-bit");
		con.addClassifications("Type of Testing", "Regression");
		
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(josFile);
		
		//ReportBuilder
		ReportBuilder builder=new ReportBuilder(jsonFiles, con);
		
		//generate
		builder.generateReports();
	}

}
