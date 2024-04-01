package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage extends CommonPage {

    @FindBy(xpath = "//span[.='Add New Education']")
    public WebElement addNewEducationButton;

    @FindBy(xpath = "//div[@class='ant-form-item css-aqx16b']//input")
    private List<WebElement> addNewEducationInput;

    @FindBy(css = "[data-test-id='profileMenu_addNewEducationDrawer_saveButton']")
    public WebElement saveButton;

    public void entryNewEducationData(DataTable dataTable) {
        for (int i = 0; i < dataTable.width(); i++) {
            addNewEducationInput.get(i).sendKeys(dataTable.row(0).get(i));
        }
    }

}
