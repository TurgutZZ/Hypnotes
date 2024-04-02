package pages;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.actions;

public class ProfilePage extends CommonPage {
    private static int size;
    @FindBy(xpath = "//span[.='Add New Education']")
    public WebElement addNewEducationButton;

    @FindBy(css = "[class='ant-drawer-body'] input")
    private List<WebElement> addNewEducationInput;

    @FindBy(css = "[data-test-id='profileMenu_addNewEducationDrawer_saveButton']")
    public WebElement saveButton;

    @FindBy(css = "[class='ant-space css-aqx16b ant-space-horizontal ant-space-align-center']>[class='ant-space-item']")
    private List<WebElement> addedEducations;

    public void entryNewEducationData(DataTable dataTable) {
        for (int i = 0; i < dataTable.width(); i++) {
            addNewEducationInput.get(i).sendKeys(dataTable.row(0).get(i));
            actions.sendKeys(Keys.TAB).perform();
            actions.sendKeys(Keys.TAB).perform();
            ReusableMethods.waitFor(1);
            System.out.println("size = " + size);
            ReusableMethods.writeOverTxt("C:\\Users\\Turgut\\Desktop\\KesifPlus\\Hypnotes\\src\\test\\resources\\dummy.txt", String.valueOf(size));
        }
    }

    public int addedEducations() {
        size = addedEducations.size();
        return size;
    }

    public void verifyAddedEducations(){
        int expectedSize = ReusableMethods.readTxt("C:\\Users\\Turgut\\Desktop\\KesifPlus\\Hypnotes\\src\\test\\resources\\dummy.txt");
        int actualSize = addedEducations();
        Assert.assertEquals(expectedSize+1,actualSize);
    }

}
