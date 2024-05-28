package TestSuite;
/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";


        @Before
        public void setUp() {
            openBrowser(baseUrl);
        }
        @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //find the login link and click on login link element
       WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
            WebElement welcomeTextElements = driver.findElement(By.xpath("//h1"));


            String actualText = welcomeTextElements.getText();
            Assert.assertEquals("Not redirected to login page", expectedText, actualText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
            // click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //* Enter valid username
       WebElement emailField = driver.findElement(By.id("Email"));
       emailField.sendKeys("shubham111000@gmail.com");
        //Enter valid password
       WebElement passwordField =driver.findElement(By.id("Password"));
       passwordField.sendKeys("Sigma@123");
       //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();

        //Verify the ‘Log out’ text is display
       String logOut = driver.findElement(By.xpath("//a[text()='Log out']")).getText();
        System.out.println(logOut);



    }
    @Test
    public void verifyTheErrorMessage (){
            //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
            //Enter invalid username
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("shubham123@gmail.com");
           //Enter invalid password
        WebElement passwordField =driver.findElement(By.id("Password"));
        passwordField.sendKeys("1010");
        //Click on Login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //Verify the error message ‘Login was unsuccessful.
        //Please correct the errors and try again. No customer account found’
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class= 'message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);


    }
    //    @After
//    public void tearDown() {
//        closeBrowser();
//    }

}
