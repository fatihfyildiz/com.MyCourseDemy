package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class MyCourseDemyPage_Instructor {
    public MyCourseDemyPage_Instructor() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //----------------------------------------FATIH------------------------------------------------------//

    @FindBy (xpath = "//a[text()='Log in']")
    public WebElement loginLink;

    @FindBy (xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@id='login-password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement cookies;

    @FindBy (linkText = "Instructor")
    public WebElement instructorLink;

    @FindBy (linkText = "Course manager")
    public WebElement courseManagerLink;

    @FindBy (id = "select2-category_id-container")
    public WebElement categoriesLink;

    @FindBy (xpath = "(//*[text()='Web Design for Web Developers'])[2]")
    public WebElement categoryChoosing;

    @FindBy (id = "select2-status-container")
    public WebElement statusLink;

    @FindBy (xpath = "(//*[text()='Pending'])[2]")
    public WebElement statusChoosing;

    @FindBy (id = "select2-price-container")
    public WebElement priceLink;

    @FindBy (xpath = "/html/body/div[2]/div/div[2]/div/div[3]/div/div/div/form/div[3]/div/span/span[1]/span/span[1]")
    public WebElement priceChoosing;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement filterButton;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "(//button[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[3]")
    public WebElement threeDots;

    @FindBy (xpath = "//a[@href='https://qualitydemy.com/home/course/web-design-for-developers/53']")
    public WebElement viewCourseOnFrontend;

    @FindBy (xpath = "//h1[text()='Web Design for Developers']")
    public WebElement pageRelevantCourse;

    //-----------------------------------------GURSEL--------------------------------------------------------//





 //----------------------------------------LEVENT-------------------------------------------------------//








 //----------------------------------------MURAT-------------------------------------------------------//









//----------------------------------------EMINE------------------------------------------------------//








//----------------------------------------ZEYNEP------------------------------------------------------//










//-----------------------------------------MERYEM------------------------------------------------------//








//----------------------------------------NESE------------------------------------------------------//








//----------------------------------------YAKUP------------------------------------------------------//







//----------------------------------------TALHA------------------------------------------------------//








//----------------------------------------BORA------------------------------------------------------//








//----------------------------------------NEVZAT------------------------------------------------------//






}