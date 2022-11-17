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

    // Homepage
    @FindBy (xpath = "//a[text()='Log in']")
    public WebElement loginLink;

    // Homepage ==> Login Page
    @FindBy (xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@id='login-password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement cookies;

    // Homepage ==> Login Page ==> Instructor Page
    @FindBy (linkText = "Instructor")
    public WebElement instructorLink;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page
    @FindBy (linkText = "Course manager")
    public WebElement courseManagerLink;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page
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

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page ==> Relevant course Page
    @FindBy (xpath = "//h1[text()='Web Design for Developers']")
    public WebElement pageRelevantCourse;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page
    @FindBy (xpath = "(//*[text()='Go to course playing page'])[3]")
    public WebElement goCoursePlayingPage;

    @FindBy (xpath = "(//*[text()='Edit this course'])[3]")
    public WebElement editThisCourse;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page ==> Edit course Page
    @FindBy (xpath = "//h4[@class='page-title']")
    public WebElement updateEditCourse;

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