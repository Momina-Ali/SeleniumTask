package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class NavigateAndSelectProduct {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the main URL
            driver.get("https://www.example.com");

            // Optionally, wait for the page to load
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Click on the subcategory
            WebElement subcategory = driver.findElement(By.xpath("//a[contains(text(), 'Subcategory')]"));
            subcategory.click();

            // Optionally, wait for the subcategory page to load
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Select the product
            WebElement product = driver.findElement(By.xpath("//a[contains(text(), 'Product Name')]"));
            product.click();

            // Optionally, wait for the product page to load
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // Perform any additional actions on the product page
            // For example, add the product to the cart
            WebElement addToCartButton = driver.findElement(By.id("add-to-cart"));
            addToCartButton.click();

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
