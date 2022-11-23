package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage_Instructor {
    public QualityDemyPage_Instructor() {
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

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement acceptCookies;

    /* Or, alternatively;
    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement acceptCookies;
     */

    // Homepage ==> Login Page ==> Instructor Page
    @FindBy (linkText = "Instructor")
    public WebElement instructorLink;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page
    @FindBy (linkText = "Course manager")
    public WebElement courseManagerLink;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page
    @FindBy (id = "select2-category_id-container")
    public WebElement categoriesLink;

    @FindBy (xpath = "(//*[text()='Web Design for Web Developers'])[3]")
    public WebElement categoryChoosingTC1;

    @FindBy (xpath = "(//*[text()='Web Design for Web Developers'])[2]")
    public WebElement categoryChoosingTC2;

    @FindBy (id = "select2-status-container")
    public WebElement statusLink;

    @FindBy (xpath = "(//span[@title='All'])[1]")
    public WebElement statusChoosing;

    @FindBy (id = "select2-price-container")
    public WebElement priceLink;

    @FindBy (xpath = "/html/body/div[2]/div/div[2]/div/div[3]/div/div/div/form/div[3]/div/span/span[1]/span/span[1]")
    public WebElement priceChoosing;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement filterButton;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "(//button[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[2]")
    public WebElement threeDots2; // Web Design for Developers

    @FindBy (xpath = "(//button[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[3]")
    public WebElement threeDots3; // Bass Guitar

    @FindBy (xpath = "(//button[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[4]")
    public WebElement threeDots4; // Piano

    @FindBy (xpath = "(//button[@class='btn btn-sm btn-outline-primary btn-rounded btn-icon'])[1]")
    public WebElement threeDots1; // English

    @FindBy (xpath = "(//a[text()='View course on frontend'])[2]")
    public WebElement viewCourseOnFrontend;

    @FindBy (xpath = "(//*[text()='Go to course playing page'])[3]")
    public WebElement goCoursePlayingPage; // Bass Guitar

    @FindBy (xpath = "(//*[text()='Edit this course'])[3]")
    public WebElement editThisCourse; // Bass Guitar

    @FindBy (xpath = "(//*[text()='Mark as drafted'])[3]")
    public WebElement markAsDraft; // Piano ==> Since the first one (English) is already Drafted and the last (Piano) becomes 3

    @FindBy (xpath = "(//*[text()='Continue'])[1]")
    public WebElement continueButton;

    @FindBy (xpath = "//span[text()='Draft']")
    public WebElement draft;

    @FindBy (xpath = "(//a[text()='Publish this course'])[1]")
    public WebElement publishThisCourse; // English

    @FindBy (xpath = "(//span[text()='Pending'])[1]")
    public WebElement pending1;

    @FindBy (xpath = "(//a[text()='Delete'])[4]")
    public WebElement delete;

    @FindBy (xpath = "//span[text()='Piano']")
    public WebElement Piano;

    @FindBy (xpath = "//a[@href='https://qualitydemy.com/user/course_form/add_course']")
    public WebElement addNewCourseButton;

    @FindBy (id = "topbar-userdrop")
    public WebElement account;

    @FindBy (xpath = "//a[@href='https://qualitydemy.com/login/logout']")
    public WebElement logout;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page ==> Relevant course Page
    @FindBy (xpath = "//h1[text()='Web Design for Developers']")
    public WebElement pageRelevantCourseTC3; // Web Design for Developers

    @FindBy (xpath = "//h1[text()='Bass Guitar']")
    public WebElement pageRelevantCourseTC4; // Bass Guitar

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page ==> Edit course Page
    @FindBy (xpath = "//h4[@class='page-title']")
    public WebElement updateEditCourse; // Bass Guitar & Web Design for Developers

    @FindBy (xpath = "//a[text()='Web Design for Developers']")
    public WebElement webDesignForDevelopersTitle;

    // Homepage ==> Login Page ==> Instructor Page ==> Dashboard Page ==> Course manager (Courses) Page ==> Add New Course
    @FindBy (xpath = "//*[text()='Course adding form']")
    public WebElement courseAddingForm;

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