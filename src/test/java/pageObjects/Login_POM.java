package pageObjects;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Login_POM extends BaseClass {
	By username=By.id("id_username");
	By password=By.id("id_password");
	By loginBtn=By.xpath("//input[@value='Login']");
	

	
//	UtlityFunctions UtlityFunctionsOBJ=new UtlityFunctions();
//	
//	@DataProvider(name="testdata")
//	public String[][] loginDataExcel(){
//		DataDrivenExcel configuration = new DataDrivenExcel("C:\\Users\\bobby\\eclipse-workspace\\ds-algo-quality-way\\src\\test\\resources\\testData\\DataDriven.xlsx");
//		int rows = configuration.getRowCount(0);
//		String[][]login_credentials = new String[rows][3];
//	
//		for(int i=0;i<rows;i++)
//		{
//			login_credentials[i][0] = (configuration.getData(0, i, 0)).toString();
//			login_credentials[i][1] = (configuration.getData(0, i, 1)).toString();
//			login_credentials[i][2] = (configuration.getData(0, i, 2)).toString();
//		}
//		return login_credentials;
//	}
//	
//	
//	public void username_empty(){
//		UtlityFunctionsOBJ.send_keys(username,(loginDataExcel()[1][0]));
//	}
	
//	public void password_empty(){
//		UtlityFunctionsOBJ.send_keys(password,(loginDataExcel()[1][1]));
//	}
//	
//	public void enter_valid_usename(){
////		UtlityFunctionsOBJ.send_keys(username,"QualityWay");
//		UtlityFunctionsOBJ.send_keys(username,(loginDataExcel()[2][0]));
//	}
//	
//	public void enter_valid_password(){
////		UtlityFunctionsOBJ.send_keys(password,"pwd_ds_algo@2");
//		UtlityFunctionsOBJ.send_keys(password,(loginDataExcel()[2][1]));
//	}
//	
//	public void enter_invalid_usename(){
////		UtlityFunctionsOBJ.send_keys(username,"QualityWayInvalid");
//		UtlityFunctionsOBJ.send_keys(username,(loginDataExcel()[3][0]));
//	}
//	
//	public void enter_invalid_password(){
////		UtlityFunctionsOBJ.send_keys(password,"pwd_ds_algo@2Invalid");
//		UtlityFunctionsOBJ.send_keys(password,(loginDataExcel()[3][1]));
//	}
//	
//	public void click_login_button(){
//		UtlityFunctionsOBJ.web_element_click(loginBtn);
//	}
//	
//	public void invalid_username_password__msg(){
//		String txt=UtlityFunctionsOBJ.get_message_from_alert();
////		UtlityFunctionsOBJ.check_text(txt, "Invalid Username and Password");
//		UtlityFunctionsOBJ.check_text(txt, (loginDataExcel()[3][2]));
//	}
}
