package com.Utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pegination {
	
	static WebDriver driver;
	
    public void nextPage() {
    	
        WebElement nextPageLink = driver.findElement(By.cssSelector(".pagination_nav .pagination .page-item:last-child a"));
        nextPageLink.click();
    }

    // Click the previous page link
    public void previousPage() {
        WebElement previousPageLink = driver.findElement(By.cssSelector(".pagination_nav .pagination .page-item:first-child a"));
        previousPageLink.click();
    }

    // Click a specific page by its number
    public void goToPage(int pageNumber) {
        WebElement pageLink = driver.findElement(By.cssSelector(".pagination_nav .pagination .page-item:not(.disabled) a[href*='?page=" + pageNumber + "']"));
        pageLink.click();
    }


}
