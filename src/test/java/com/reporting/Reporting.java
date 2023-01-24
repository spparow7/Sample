package com.reporting;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting {

	public static void generateJvmReport(String jsonfile) {
		
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Cucumber\\target");
		
		Configuration configuration=new Configuration(file, "Adctin hotel");
		
		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("version", "107");
		configuration.addClassifications("os", "win10");
		
		List<String>Jsonfiles = new ArrayList<String>();
		Jsonfiles.add(jsonfile);
		
		ReportBuilder builder = new ReportBuilder(Jsonfiles, configuration);
		builder.generateReports();
				
	}
}
