package sample;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentrep {
	static ExtentReports extent;
	@BeforeTest
	public static ExtentReports confi() {
		String path=System.getProperty("user.dir")+"\\reports+index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setDocumentTitle("Automation testing result");
		report.config().setReportName("Test Result");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("tester", "krishnamoorthy");
		return extent;
	}

}
