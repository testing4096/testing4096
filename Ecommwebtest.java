package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommwebtest {
public static void main(String[] args) {
	
    // Set the path to the ChromeDriver executable
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

    // Create a new instance of the ChromeDriver
    WebDriver driver = new ChromeDriver();

    // Navigate to the e-commerce website
    driver.get("http://www.amazon.com");

    // Example interactions with the website
    try {
        // Find the search input element and enter a search query
        WebElement searchInput = driver.findElement(By.id("search-input"));
        searchInput.sendKeys("Laptop");

        // Click the search button
        WebElement searchButton = driver.findElement(By.id("search-button"));
        searchButton.click();

        // Click on a product
        WebElement productLink = driver.findElement(By.cssSelector(".product-list .product:first-child a"));
        productLink.click();

        // Add the product to the cart
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        // View the shopping cart
        WebElement viewCartButton = driver.findElement(By.id("view-cart-button"));
        viewCartButton.click();

        // Proceed to checkout
        WebElement checkoutButton = driver.findElement(By.id("checkout-button"));
        checkoutButton.click();

        // Fill in shipping information
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        lastNameInput.sendKeys("Doe");

        WebElement addressInput = driver.findElement(By.id("address"));
        addressInput.sendKeys("123 Main Street");

        // ... Continue filling in the rest of the checkout form

        // Submit the order
        WebElement submitOrderButton = driver.findElement(By.id("submit-order-button"));
        submitOrderButton.click();
    } finally {
        // Close the browser
        driver.quit();
    }
}
}