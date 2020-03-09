package StepDefinitions;

import Pages.AddEmployeeWithDisc.AddEmployeePage;
import Utils.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class AddEmployeeStepDefs {
    AddEmployeePage addEmployeePage = new AddEmployeePage();
WebDriver driver = Driver.getDriver();
    @Given("the user click on Add Employee button")
    public void the_user_click_on_Add_Employee_button() {
      addEmployeePage.addEmployeeBtn.click();
    }

    @Given("the user enters the info {string} {string} {string}")
    public void the_user_enters_the_info(String LastName, String FirstName, String dependent) {
       addEmployeePage.lastName.sendKeys(LastName);
       addEmployeePage.firstName.sendKeys(FirstName);
       addEmployeePage.dependents.sendKeys(dependent);
    }
    @Given("the user clicks on save button")
    public void the_user_clicks_on_save_button() {
        addEmployeePage.submitBtn.click();
    }

    @Given("the user validate the new employee is displayed in the table")
    public void the_user_validate_the_new_employee_is_displayed_in_the_table() {
for (int i =0; i<addEmployeePage.tableContents.size();)
        addEmployeePage.tableContents.get()
    }


}
