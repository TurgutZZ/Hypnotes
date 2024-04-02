package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

public class AccauntHomePage extends CommonPage {

    @FindBy(xpath = "//a[@class='ant-dropdown-trigger']")
    private WebElement ProfileDropdown;

    @FindBy(css = "[data-menu-id='rc-menu-uuid-60343-6-1']")
    private WebElement ProfilButton2;

    @FindBy(css = "[href='/dashboard/profile']")
    private WebElement ProfilButton;


    public void goesToProfile() {
        //  ReusableMethods.waitForClickablility(ProfileDropdown,5);
        // ProfileDropdown.click();
        //ReusableMethods.waitForClickablility(ProfilButton,5);
        ReusableMethods.waitFor(2);
        ProfilButton.click();
        ReusableMethods.waitForPageToLoad(5);
    }
}
