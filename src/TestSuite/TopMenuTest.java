package TestSuite;
/**
 * Write down the following test into ‘TopMenuTest’ class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //  click on the ‘Computers’ Tab
        driver.findElement(By.linkText("Computers")).click();

        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).getText();
        //   Verify the text ‘Computers’
        Assert.assertEquals("Error Message :",actualText,"Computers");

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘Electronics’ Tab
        driver.findElement(By.linkText("Electronics")).click();
        // * * Verify the text ‘Electronics’
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")).getText();

        Assert.assertEquals("Error Message :",actualText,"Electronics");

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

        //  click on the ‘Apparel’ Tab
        driver.findElement(By.linkText("Apparel")).click();
        //  Verify the text ‘Apparel’ 4.
       String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Apparel ']")).getText();
        Assert.assertEquals("Error Message :",actualText,"Apparel");

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //  click on the ‘Digital downloads’ Tab
        driver.findElement(By.linkText("Digital downloads")).click();
        //  Verify the text ‘Digital downloads’
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Digital downloads ']")).getText();
        Assert.assertEquals("Error Message :",actualText,"Digital downloads");
    }@Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        // * * click on the ‘Books’ Tab
        driver.findElement(By.linkText("Books")).click();
        // * * Verify the text ‘Books’
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Books ']")).getText();
        Assert.assertEquals("Error Message :",actualText,"Books");
    }
    @Test
    public void  userShouldNavigateToJewelryPageSuccessfully(){
        //* * click on the ‘Jewelry’ Tab
        driver.findElement(By.linkText("Jewelry")).click();
        //* * Verify the text ‘Jewelry’
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Jewelry ']")).getText();
        Assert.assertEquals("Error Message :",actualText,"Jewelry");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // * * click on the ‘Gift Cards’ Tab
        driver.findElement(By.linkText("Gift Cards")).click();
        // * * Verify the text ‘Gift Cards’
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Gift Cards ']")).getText();
        Assert.assertEquals("Error Message :",actualText,"Gift Cards");

    }











}
