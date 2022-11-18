package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage_Instructor;
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
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC1901: The functions of the Course manager page should work correctly ...................... ////
        // When the appropriate values are selected from the filter and the filter button is pressed,
        // the relevant course should appear in the list.
        qualityDemyPage_instructor.categoriesLink.click();
        qualityDemyPage_instructor.categoryChoosing.click();
        qualityDemyPage_instructor.statusLink.click();
        qualityDemyPage_instructor.statusChoosing.click();
        qualityDemyPage_instructor.priceLink.click();
        qualityDemyPage_instructor.priceChoosing.click();
        qualityDemyPage_instructor.filterButton.click();

        Assert.assertTrue(qualityDemyPage_instructor.categoryChoosing.isDisplayed());

    }

    @Test
    public void US19_TestCase1902() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();


        // TC1902: Course should be able to get selected from the search box
        qualityDemyPage_instructor.searchBox.sendKeys(qualityDemyPage_instructor.categoryChoosing.getText());

        /*
        System.out.println(myCourseDemyPage_instructor.categoryChoosing.getText());
        // Web Design for Web Developers
         */

        Assert.assertTrue(qualityDemyPage_instructor.categoryChoosing.isDisplayed());

    }

    @Test
    public void US19_TestCase1903() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC1903: Clicking on the three dots under the action section and
        // clicking the View course on frontend link should redirect to the page of the relevant course
        String firstPageWindowHandleValue= Driver.getDriver().getWindowHandle();

        qualityDemyPage_instructor.threeDots3.click();
        qualityDemyPage_instructor.viewCourseOnFrontend.click();

        Set<String> windowHandlesSet= Driver.getDriver().getWindowHandles();

        String secondPageWindowHandleValue= "";

        for (String eachHandleValue:windowHandlesSet
        ) {
            if (!eachHandleValue.equals(firstPageWindowHandleValue)){
                secondPageWindowHandleValue= eachHandleValue;
            }
        }

        Driver.getDriver().switchTo().window(secondPageWindowHandleValue);

        Assert.assertTrue(qualityDemyPage_instructor.pageRelevantCourse.isDisplayed());

    }


    @Test
    public void US19_TestCase1904() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC04: Clicking on the three dots under the action section and
        // clicking the Go to course playing page link should lead to the page of the relevant course content
        String firstPageWindowHandleValue= Driver.getDriver().getWindowHandle();

        qualityDemyPage_instructor.threeDots3.click();
        qualityDemyPage_instructor.goCoursePlayingPage.click();

        Set<String> windowHandlesSet= Driver.getDriver().getWindowHandles();

        String secondPageWindowHandleValue= "";

        for (String eachHandleValue:windowHandlesSet
        ) {
            if (!eachHandleValue.equals(firstPageWindowHandleValue)){
                secondPageWindowHandleValue= eachHandleValue;
            }
        }

        Driver.getDriver().switchTo().window(secondPageWindowHandleValue);

        Assert.assertTrue(qualityDemyPage_instructor.pageRelevantCourse.isDisplayed());

    }

    @Test
    public void US19_TestCase1905() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC5: When you click on the three dots under the action section
        // and click on the Edit this course link, it should redirect to the edit page of the relevant course
        qualityDemyPage_instructor.threeDots3.click();
        qualityDemyPage_instructor.editThisCourse.click();

        Assert.assertTrue(qualityDemyPage_instructor.updateEditCourse.isDisplayed());

    }

    @Test
    public void US19_TestCase1906() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC06: When you click on the three dots under the action section
        // and click on the Mark as drafted link,
        // a confirmation message should come
        // and after approval, the status section of the course should change to draft
        qualityDemyPage_instructor.threeDots2.click();
        qualityDemyPage_instructor.markAsDraft.click();

        Assert.assertTrue(qualityDemyPage_instructor.continueButton.isEnabled());

        qualityDemyPage_instructor.continueButton.click();

        Assert.assertTrue(qualityDemyPage_instructor.draft.isDisplayed());

    }

    @Test
    public void US19_TestCase1907() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC07: When you click on the three dots under the action section
        // and click on the Publish this course link,
        // a confirmation message should come and after approval,
        // the status section of the course should change to pending
        qualityDemyPage_instructor.threeDots1.click();
        qualityDemyPage_instructor.publicThisCourse.click();

        Assert.assertTrue(qualityDemyPage_instructor.continueButton.isEnabled());

        qualityDemyPage_instructor.continueButton.click();

        Assert.assertTrue(qualityDemyPage_instructor.pending1.isDisplayed());

    }

    @Test
    public void US19_testCase1908() {
        // go to the MyCourseDemy web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        // With a valid username and password, login to the system
        QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();
        qualityDemyPage_instructor.loginLink.click();

        qualityDemyPage_instructor.emailBox.sendKeys(ConfigReader.getProperty("validEmailFatihIns2"));
        qualityDemyPage_instructor.passwordBox.sendKeys(ConfigReader.getProperty("validPasswordFatihIns2"));

        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualityDemyPage_instructor.loginButton.click();

        // Click to the Instructor link
        qualityDemyPage_instructor.instructorLink.click();

        // Click to the Course Manager link
        qualityDemyPage_instructor.courseManagerLink.click();

        // TC08: When you click on the three dots under the action section
        // and click on the delete link from here,
        // a confirmation message should come
        // and the course should be deleted from the list after approval
        qualityDemyPage_instructor.threeDots2.click();
        qualityDemyPage_instructor.delete.click();

        Assert.assertTrue(qualityDemyPage_instructor.continueButton.isEnabled());

        qualityDemyPage_instructor.continueButton.click();

        Assert.assertFalse(qualityDemyPage_instructor.bassGuitar.isDisplayed());

    }




}