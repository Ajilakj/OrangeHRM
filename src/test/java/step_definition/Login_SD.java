package step_definition;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BaseClass;
import pageObjects.Login_POM;

public class Login_SD extends BaseClass{
	Login_POM LoginOBJ=new Login_POM();
	

//	  @tag1
	@Given("User is in Login page to check both fields empty")
	public void user_is_in_login_page_to_check_both_fields_empty() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@When("user leaves username password fields empty")
	public void user_leaves_username_password_fields_empty() {
//		LoginOBJ.username_empty();
//		LoginOBJ.password_empty();
	}
	
	@When("clicks Login button to check both fields empty")
	public void clicks_login_button_to_check_both_fields_empty() {
//		 LoginOBJ.click_login_button();
	}
	
	@Then("please fill out this field text is displayed for only username")
	public void please_fill_out_this_field_text_is_displayed_for_only_username() {
//		 UtlityFunctionsOBJ.get_message_from_active_window();
	}
	
////	  @tag2
//	@Given("User is in Login page to check pssword empty")
//	public void user_is_in_login_page_to_check_pssword_empty() {
//		UtlityFunctionsOBJ.check_url_login();
//	}
//	
//	@When("user enters valid username and leaves password field empty")
//	public void user_enters_valid_username_and_leaves_password_field_empty() {
//		LoginOBJ.enter_valid_usename();
//		LoginOBJ.password_empty();
//	}
//	
//	@When("clicks Login button to check pssword empty")
//	public void clicks_login_button_to_check_pssword_empty() {
//		LoginOBJ.click_login_button();
//	}
//	
//	@Then("please fill out this field text is displayed for password")
//	public void please_fill_out_this_field_text_is_displayed_for_password() {
//		 UtlityFunctionsOBJ.get_message_from_active_window();
//	}
//	
//	
////	  @tag3
//	@Given("User is in Login page to check username empty")
//	public void user_is_in_login_page_to_check_username_empty() {
//		UtlityFunctionsOBJ.check_url_login();
//	}
//	
//	@When("user enters valid password and leaves username field empty")
//	public void user_enters_valid_password_and_leaves_username_field_empty() {
//		LoginOBJ.username_empty();
//		LoginOBJ.enter_valid_password();;
//	}
//	
//	@When("clicks Login button to check username empty")
//	public void clicks_login_button_to_check_username_empty() {
//		LoginOBJ.click_login_button();
//	}
//	
//	@Then("please fill out this field text is displayed for username")
//	public void please_fill_out_this_field_text_is_displayed_for_username() {
//		 UtlityFunctionsOBJ.get_message_from_active_window();
//	}
//	
////	  @tag4
//	@Given("User is in Login page to check nonregister user")
//	public void user_is_in_login_page_to_check_nonregister_user() {
//		UtlityFunctionsOBJ.check_url_login();
//	}
//	
//	@When("enters a username and a password")
//	public void enters_a_username_and_a_password() {
//		LoginOBJ.enter_invalid_usename();
//		LoginOBJ.enter_invalid_password();
//	}
//	
//	@When("clicks Login button to check nonregister user")
//	public void clicks_login_button_to_check_nonregister_user() {
//		LoginOBJ.click_login_button();
//	}
//	
//	@Then("Invalid Username and Password message should display for non registered user")
//	public void invalid_username_and_password_message_should_display_for_non_registered_user() {
//		LoginOBJ.invalid_username_password__msg();
//	}
//	
////	  @tag5
//	@Given("User is in Login page to check password incorrect")
//	public void user_is_in_login_page_to_check_password_incorrect() {
//		UtlityFunctionsOBJ.click_back_button();
//		UtlityFunctionsOBJ.check_url_login();
//	}
//	
//	@When("enters a valid username and incorrect password")
//	public void enters_a_valid_username_and_incorrect_password() {
//		LoginOBJ.enter_valid_usename();
//		LoginOBJ.enter_invalid_password();
//	}
//	
//	@When("clicks Login button to check password incorrect")
//	public void clicks_login_button_to_check_password_incorrect() {
//		LoginOBJ.click_login_button();
//	}
//	
//	@Then("Invalid Username and Password message should display for non registered password")
//	public void invalid_username_and_password_message_should_display_for_non_registered_password() {
//		LoginOBJ.invalid_username_password__msg();
//	}
//	
////	  @tag6
//	@Given("User is in Login page to check username incorrect")
//	public void user_is_in_login_page_to_check_username_incorrect() {
//		UtlityFunctionsOBJ.click_back_button();
//		UtlityFunctionsOBJ.check_url_login();
//	}
//	
//	@When("enters an incorrect username and a valid password")
//	public void enters_an_incorrect_username_and_a_valid_password() {
//		LoginOBJ.enter_invalid_usename();
//		LoginOBJ.enter_valid_password();
//	}
//	
//	@When("clicks Login button to check username incorrect")
//	public void clicks_login_button_to_check_username_incorrect() {
//		LoginOBJ.click_login_button();
//	}
//	
//	@Then("Invalid Username and Password message should display for non registered username")
//	public void invalid_username_and_password_message_should_display_for_non_registered_username() {
//		LoginOBJ.invalid_username_password__msg();
//	}
//	
////	  @tag7
//	@Given("Check register link from login page")
//	public void check_register_link_from_login_page() {
//		UtlityFunctionsOBJ.click_back_button();
//		UtlityFunctionsOBJ.check_url_login();
//	}
//
//	@When("use click register link from login page")
//	public void use_click_register_link_from_login_page() {
//		UtlityFunctionsOBJ.click_register_link();
//	}
//
//	@Then("user is navigated to register page")
//	public void user_is_navigated_to_register_page() {
//		UtlityFunctionsOBJ.check_url_register();
//	}
//	
////	  @tag8
//	@Given("User is in Login page to check successful login with valid credentials")
//	public void user_is_in_login_page_to_check_successful_login_with_valid_credentials() {
//		UtlityFunctionsOBJ.click_back_button();
//		UtlityFunctionsOBJ.check_url_login();
//	}
//	
//	@When("enters valid username and valid password")
//	public void enters_valid_username_and_valid_password() {
//	   LoginOBJ.enter_valid_usename();;
//	   LoginOBJ.enter_valid_password();
//	}
//
//	@When("clicks Login button")
//	public void clicks_login_button() {
//		LoginOBJ.click_login_button();
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		UtlityFunctionsOBJ.check_url_home();
//	}
	

}
