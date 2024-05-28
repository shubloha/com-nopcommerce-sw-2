package TestSuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/*
Select gender radio button
* Enter First name
* Enter Last name
* Select Day Month and Year
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on REGISTER button
* Verify the text 'Your registration completed’
 */
public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";




    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
       //* click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
    //      * Verify the text ‘Register’
        String actualText = driver.findElement(By.xpath("//a[@class='ico-register']")).getText();
        Assert.assertEquals("Error Message",actualText,"Register");
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
       // click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
      //  Select gender radio button for male
        driver.findElement(By.id("gender-male")).click();
       //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Shubham");
       //  Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Lohar");
        //Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).findElement(By.xpath("//option[@value='10']")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).findElement(By.xpath("//option[text()='October']")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).findElement(By.xpath("//option[@value='1996']")).click();
        //Enter Email address
        driver.findElement(By.id("Email")).sendKeys("shubham10109@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("qwe1234");
        //Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("qwe1234");
        //Click on REGISTER button
        driver.findElement(By.id("register-button")).click();
        //Verify the text 'Your registration completed
        String expectedResult = "Your registration completed";
        String actualText =driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();
        Assert.assertEquals("Registration not complete successfully",expectedResult,actualText);





    }


}
