package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCourseDemyPage_Instructor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class US_19 {

    @Test
    public void US19_TestCase1901() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        MyCourseDemyPage_Instructor myCourseDemyPage_instructor = new MyCourseDemyPage_Instructor();
        myCourseDemyPage_instructor.loginLink.click();

        myCourseDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorEmail2"));
        myCourseDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorPassword2"));

        ReusableMethods.bekle(2);
        myCourseDemyPage_instructor.cookies.click();
        ReusableMethods.bekle(2);
        myCourseDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        myCourseDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        myCourseDemyPage_instructor.courseManagerLink.click();

        // TC1901: The functions of the Course manager page should work correctly ...................... ////
        // When the appropriate values are selected from the filter and the filter button is pressed,
        // the relevant course should appear in the list.
        myCourseDemyPage_instructor.categoriesLink.click();
        myCourseDemyPage_instructor.categoryChoosing.click();
        myCourseDemyPage_instructor.statusLink.click();
        myCourseDemyPage_instructor.statusChoosing.click();
        myCourseDemyPage_instructor.priceLink.click();
        myCourseDemyPage_instructor.priceChoosing.click();
        myCourseDemyPage_instructor.filterButton.click();

        Assert.assertTrue(myCourseDemyPage_instructor.categoryChoosing.isDisplayed());

    }

    @Test
    public void US19_TestCase1902() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        MyCourseDemyPage_Instructor myCourseDemyPage_instructor = new MyCourseDemyPage_Instructor();
        myCourseDemyPage_instructor.loginLink.click();

        myCourseDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorEmail2"));
        myCourseDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorPassword2"));

        ReusableMethods.bekle(2);
        myCourseDemyPage_instructor.cookies.click();
        ReusableMethods.bekle(2);
        myCourseDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        myCourseDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        myCourseDemyPage_instructor.courseManagerLink.click();


        // TC1902: Course should be able to get selected from the search box
        myCourseDemyPage_instructor.searchBox.sendKeys(myCourseDemyPage_instructor.categoryChoosing.getText());

        /*
        System.out.println(myCourseDemyPage_instructor.categoryChoosing.getText());
        // Web Design for Web Developers
         */

        Assert.assertTrue(myCourseDemyPage_instructor.categoryChoosing.isDisplayed());

    }

    @Test
    public void US19_TestCase1903() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        MyCourseDemyPage_Instructor myCourseDemyPage_instructor = new MyCourseDemyPage_Instructor();
        myCourseDemyPage_instructor.loginLink.click();

        myCourseDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorEmail2"));
        myCourseDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorPassword2"));

        ReusableMethods.bekle(2);
        myCourseDemyPage_instructor.cookies.click();
        ReusableMethods.bekle(2);
        myCourseDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        myCourseDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        myCourseDemyPage_instructor.courseManagerLink.click();

        // TC1903: Clicking on the three dots under the action section and
        // clicking the View course on frontend link should redirect to the page of the relevant course
        String firstPageWindowHandleValue= Driver.getDriver().getWindowHandle();

        myCourseDemyPage_instructor.threeDots.click();
        myCourseDemyPage_instructor.viewCourseOnFrontend.click();

        Set<String> windowHandlesSet= Driver.getDriver().getWindowHandles();

        String secondPageWindowHandleValue= "";

        for (String eachHandleValue:windowHandlesSet
             ) {
            if (!eachHandleValue.equals(firstPageWindowHandleValue)){
                secondPageWindowHandleValue= eachHandleValue;
            }
        }

        Driver.getDriver().switchTo().window(secondPageWindowHandleValue);

        Assert.assertTrue(myCourseDemyPage_instructor.pageRelevantCourse.isDisplayed());

    }


    @Test
    public void US19_TestCase1904() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        MyCourseDemyPage_Instructor myCourseDemyPage_instructor = new MyCourseDemyPage_Instructor();
        myCourseDemyPage_instructor.loginLink.click();

        myCourseDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorEmail2"));
        myCourseDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorPassword2"));

        ReusableMethods.bekle(2);
        myCourseDemyPage_instructor.cookies.click();
        ReusableMethods.bekle(2);
        myCourseDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        myCourseDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        myCourseDemyPage_instructor.courseManagerLink.click();

        // TC04: Clicking on the three dots under the action section and
        // clicking the Go to course playing page link should lead to the page of the relevant course content
        String firstPageWindowHandleValue= Driver.getDriver().getWindowHandle();

        myCourseDemyPage_instructor.threeDots.click();
        myCourseDemyPage_instructor.goCoursePlayingPage.click();

        Set<String> windowHandlesSet= Driver.getDriver().getWindowHandles();

        String secondPageWindowHandleValue= "";

        for (String eachHandleValue:windowHandlesSet
        ) {
            if (!eachHandleValue.equals(firstPageWindowHandleValue)){
                secondPageWindowHandleValue= eachHandleValue;
            }
        }

        Driver.getDriver().switchTo().window(secondPageWindowHandleValue);

        Assert.assertTrue(myCourseDemyPage_instructor.pageRelevantCourse.isDisplayed());

    }

    @Test
    public void US19_TestCase1905() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        MyCourseDemyPage_Instructor myCourseDemyPage_instructor = new MyCourseDemyPage_Instructor();
        myCourseDemyPage_instructor.loginLink.click();

        myCourseDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorEmail2"));
        myCourseDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("FatihValidInstructorPassword2"));

        ReusableMethods.bekle(2);
        myCourseDemyPage_instructor.cookies.click();
        ReusableMethods.bekle(2);
        myCourseDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        myCourseDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        myCourseDemyPage_instructor.courseManagerLink.click();

        // TC5: When you click on the three dots under the action section
        // and click on the Edit this course link, it should redirect to the edit page of the relevant course
        myCourseDemyPage_instructor.threeDots.click();
        myCourseDemyPage_instructor.editThisCourse.click();

        Assert.assertTrue(myCourseDemyPage_instructor.updateEditCourse.isDisplayed());

    }

}